package com.hun;
/**mySQL��  quiz_db �� quiz_table ���� �ִ�
 * ������ ������ �ϳ��� ��ü�� �����ֱ� ����  Ŭ����
 * (�� ���ڵ带 �ϳ��� ��ü��...)
 * QuizDB ��ü�� ArrayList<Quiz> quiz_list�� ����(add())
 * */
public class Quiz {
	private int quizNO=0;
	private String quizQuestion=null;
	private String quizAnswer=null;

	public int getQuizNO() {
		return quizNO;
	}

	public void setQuizNO(int quizNO) {
		this.quizNO = quizNO;
	}

	public String getQuizQuestion() {
		return quizQuestion;
	}

	public void setQuizQuestion(String quizQuestion) {
		this.quizQuestion = quizQuestion;
	}

	public String getQuizAnswer() {
		return quizAnswer;
	}

	public void setQuizAnswer(String quizAnswer) {
		this.quizAnswer = quizAnswer;
	}

	public Quiz() {

	}

}
