package com.freeflux;

/** �л����� Ŭ���� **/
public class TextClass {
	public TextClass() {
	}

	public static DataClass creatObject() {

		DataClass dc = new DataClass();
		dc.initDepartments(); // �а����� �迭�� �ʱ� ������ ����
		dc.initStudents(); // �л����� �迭�� �ʱ� ������ ����
		return dc;
	}

	/** 1. �л����� �迭 �κ��� ���л� �˻� �޼��� **/
	public static String[] searchinfo(char c, Student[] s) {

		String names = ""; // �˻� �л��̸��� : "�̸�,�̸�...."
		String dept_id = ""; // �˻� �л� �а���ȣ�� : "�а���ȣ,�а���ȣ...."
		int ageSum = 0; // ���� ��
		int count = 0; // �˻� �ο���
		for (int idx = 0; idx < s.length; idx++) {
			if (s[idx].gender == c) {
				names = names + s[idx].name + ","; // �л� �̸� ����
				dept_id = dept_id + s[idx].dept_id + ","; // �л� �а���ȣ ����
				ageSum = ageSum + s[idx].age; // �л� ���� ����
				count = count + 1; // count++ �� ���� // �ο��� ����

			}
		}
		String[] resultData = { names, dept_id, (ageSum + ""), (count + "") };
		return resultData;
	}

	public static String[] StringSplit(String s) {
		return s.split(",");

	} // dept_id:"920","923", d.depts

	public static String[] convertDept(String[] d, Department[] dd) {// d �а� ��ȣ��
		String[] dname = new String[d.length]; // �а� �̸��� ����
		// for �� ó�� �ؿ�����(0708����)
		dname[0] = searchDeptName(dd, d[0]);
		dname[1] = searchDeptName(dd, d[1]);
		return dname;
	} // d.depts "920"

	public static String searchDeptName(Department[] depts, String sName) {
		String dName = "";
		for (int idx = 0; idx < depts.length; idx++) {
			if (depts[idx].dept_id.equals(sName)) {
				dName = depts[idx].dept_name;
			}
		}
		return dName;
	}

	// 3. ���л��� ��ճ��� ���ϱ�
	public static double avg(String s, String c) {
		int sum = Integer.parseInt(s);
		int count = Integer.parseInt(c);
		return (float) sum / count;
	}
 public static void answer(String s1[], String s2[],  double s4) {
	 
	 for(int idx=0; idx<s1.length; idx++) {
			System.out.println(s1[idx]);
	 }	 
	 for(int idx=0; idx<s2.length; idx++) {
	 System.out.println(s2[idx]);
	 }
	 System.out.println(s4);
 }


}// class END
