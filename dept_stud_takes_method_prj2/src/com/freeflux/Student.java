package com.freeflux;

/** �л����� Ŭ���� **/
public class Student {
	private String stu_id = ""; // �й�
	private String resident_id = ""; // �ֹι�ȣ//����
	public String name = ""; // �̸�
	public int year = 0; // �г�
	
	public String getStu_id() {
		return stu_id;
	}

	public String getResident_id() {
		return resident_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public String address = ""; // �ּ�
	private int dept_id = 0; // �а���ȣ

	// ("1292001", "900424-1825409", "�豤��", 3, "����", 920);
	public Student(String s, String r, String n, int y, String a, int d) {
		this.stu_id = s;
		this.resident_id = r;
		this.name = n;
		this.year = y;
		this.address = a;
		this.dept_id = d;

	} // ������ END

} // class END
