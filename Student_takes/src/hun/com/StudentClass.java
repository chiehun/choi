package hun.com;

public class StudentClass {
//"1292001", "900424-1825409", "±è±¤½Ä", 3, "¼­¿ï", 920);
	public	String student_id = "";
	public	String jumin="";
	public	String student_name="";
	public	int grade=0;
	public	String home="";
	public	int dept_num=0;
	
	public StudentClass(String s_id, String ju, String stu_name, int gd, String hm, int d_num) {
		this.student_id=s_id;
		this.jumin=ju;
		this.student_name=stu_name;
		this.home=hm;
		this.dept_num=d_num;
		
	}

}
