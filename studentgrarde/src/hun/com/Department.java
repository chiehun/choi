package hun.com;

public class Department {

	 private int dept_id = 0;   // 학과번호

	 public String dept_name = "";  // 학과이름

	 public String office = "";   // 강의실

	public Department(int dp_id, String dp_nm, String off) {
		this.dept_id=dp_id;
		this.dept_name=dp_nm;
		this.office=off;
	}

}
