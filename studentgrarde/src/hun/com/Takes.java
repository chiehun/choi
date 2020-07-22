package hun.com;

public  class Takes{
	private String student_id="";// 학과번호
	public String class_id =""; //강의실 번호
	public String grade = ""; //성적
	
	
	//"1292001", "C101-01", "B+");
	public Takes(String stu_id, String cs_id, String gd) {
		this.setStudent_id(stu_id);//학과 번호
		this.class_id=cs_id; //강의실 번호
		this.grade=gd; //성적
		
	}


	public String getStudent_id() {//외부로 전달해주는 값//
		return student_id;
	}


	public void setStudent_id(String student_id) {// 수정할 수 있는 값
		this.student_id = student_id;
	}
		
	}
 

