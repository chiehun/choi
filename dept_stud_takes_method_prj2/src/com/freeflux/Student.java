package com.freeflux;

/** 학생정보 클래스 **/
public class Student {
	private String stu_id = ""; // 학번
	private String resident_id = ""; // 주민번호//변경
	public String name = ""; // 이름
	public int year = 0; // 학년
	
	public String getStu_id() {
		return stu_id;
	}

	public String getResident_id() {
		return resident_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public String address = ""; // 주소
	private int dept_id = 0; // 학과번호

	// ("1292001", "900424-1825409", "김광식", 3, "서울", 920);
	public Student(String s, String r, String n, int y, String a, int d) {
		this.stu_id = s;
		this.resident_id = r;
		this.name = n;
		this.year = y;
		this.address = a;
		this.dept_id = d;

	} // 생성자 END

} // class END
