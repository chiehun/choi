package hun.com;

public class Student {
 private String stu_id="";  // �й�   getter
 private String resident_id="";  // �ֹι�ȣ   getter
 public String name="";  // �̸�
 public int year=0;    // �г�
 public String address="";  // �ּ�
 private int dept_id=0;   // �а���ȣ  getter
	
	//("1292001", "900424-1825409", "�豤��", 3, "����", 920);
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
