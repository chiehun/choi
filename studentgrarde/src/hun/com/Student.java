package hun.com;

public class Student {
 private String stu_id="";  // 학번   getter
 private String resident_id="";  // 주민번호   getter
 public String name="";  // 이름
 public int year=0;    // 학년
 public String address="";  // 주소
 private int dept_id=0;   // 학과번호  getter
	
	//("1292001", "900424-1825409", "김광식", 3, "서울", 920);
	public Student(String s_id, String res_id, String nm, int yea, String add, int dp_id) {
	this.stu_id=s_id;
	this.resident_id=res_id;
	this.name=nm;
	this.year=yea;
	this.address=add;
	this.dept_id=dp_id;
	
	}

	public String getStu_id() {
		return stu_id;
	}

	public String getResident_id() {
		return resident_id;
	}

	public int getDept_id() {
		return dept_id;
	}

}
