package hun.com;

public  class Takes{
	private String student_id="";// �а���ȣ
	public String class_id =""; //���ǽ� ��ȣ
	public String grade = ""; //����
	
	
	//"1292001", "C101-01", "B+");
	public Takes(String stu_id, String cs_id, String gd) {
		this.setStudent_id(stu_id);//�а� ��ȣ
		this.class_id=cs_id; //���ǽ� ��ȣ
		this.grade=gd; //����
		
	}


	public String getStudent_id() {//�ܺη� �������ִ� ��//
		return student_id;
	}


	public void setStudent_id(String student_id) {// ������ �� �ִ� ��
		this.student_id = student_id;
	}
		
	}
 

