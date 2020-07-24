package com.hun;

public class QuizProtool { // ��� ����
	private static final int WAITING=0; 	// ���
	private static final int PROBLEM = 1;	//����
	private static final int ANSWER =2;	// ����
	
	private static final int NUMPROBLEMS =3; //�������� ��
	
	private int state = WAITING; // ���¸� �����ϴ� ���� 
														// �ʱⰪ�� ��� ����....
	private int currentProblem = 0; // ���׹�ȣ ���� ����
														// �Ʒ��� �ΰ��� �迭�� �̿��Ͽ� ������ ������ Ȯ��
	// ���� �迭 / ���� �迭
	
	//private String [] problems = {"��Ʈ��ũ ó�� ��Ű���� ?", "�ڹ��� ����ȭ�� �ֽŹ����� ?", "���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ� ?" };
	//private String [] answers = {"java.net", "1.8", "IP" }; //DateBase�� ó��
	
	/**_____server  main�� �ϴ���________________________________________________________________________________________**/
	// QuizServer => main(){
	// QuizProtocol qp = new QuizProtocol();
	// qp.process();
	private QuizDB qdb = null;
	public QuizProtool() { //������  // �����ڰ� �����ɶ� ������ �����ϱ� ���ؼ�
		qdb= new QuizDB("quiz_db"); //�ּ� + ������ �̸�
		qdb.connect();		//���� �޼���
		//qdb.quizInsert();	// QuizProtocl�� String[] ���̺� ����/���� ����
		qdb.quizSelect();		// ���̺���� �����͸� ��ȸ ��,
		// �� ���ڵ带 Quiz ��ü ������ ��, ArrayList�� add()
		
		}//�⺻ ������
	
	public String preocess(String thelnput) {
		String theQutput = null;
		
		//�ʱ� ��� ������ ���, client���� ������ ����
		if(state == WAITING) {
			//client ���� ����
			theQutput=" ��� �����մϴ� y/n"; 
			state = PROBLEM;
			
		//Client�� ��� ������ �������� ������ ����
		}else if (state == PROBLEM) {
			
			//Client�� ���� ������ �ϰڴٰ� Y �Ǵ�  y�� �Է����� ��
			if (thelnput.equalsIgnoreCase("y")){
				theQutput=qdb.quiz_list.get(currentProblem).getQuizQuestion();
				state = ANSWER; // ���� ���� ANSWER ���� ��� ���� 
				
			}else {//client�� n N�� �Է��Ͽ������
				state = WAITING;  //n ������ ��� ���·�
				theQutput="quit";  // �����ٰ� �� ���� 
			}
			
		// ���� ���� �Ǿ�����	
		}else if (state == ANSWER) {
			if (thelnput.equalsIgnoreCase(qdb.quiz_list.get(currentProblem).getQuizAnswer())) {
				theQutput = "�����Դϴ�. ����Ͻðڽ��ϱ�? y,n";
				state = PROBLEM;
			
			}else {
				state = PROBLEM;
				theQutput ="�����Դϴ�. ��� �Ͻðڽ��ϱ�? y/n";
			}	
			
			// client�� ��� ������
			currentProblem = (currentProblem+1) % NUMPROBLEMS; // problem
			//012012012012012012012 % �ݺ��Ҷ� ����
		}
		return theQutput;
	}
}
