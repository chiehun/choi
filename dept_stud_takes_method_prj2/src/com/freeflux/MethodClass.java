package com.freeflux;

/** �۾� �޼���鸸 �����ϴ� Ŭ���� **/
public class MethodClass {
	public static DataClass dc = null;// ��ü ������ �ʱ�ȭ ��ų�� null

	public MethodClass() {
	} // ������ END

	/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ���� **/
	public static void createObject() {
		dc = new DataClass();
		dc.initTakes();
		dc.initDepartments();
		dc.initTakes();
	} // createObject() END

	/** 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ�� **/
	// DataClass��ü�� takes�迭 ������ �� take ���� ���� ���ϸ� �˻�
	public static String searchStudentID(String t) {// t= A
		// System.out.println(; Ȯ��
		String temp = "";
		String grade = "";
		for (int idx = 0; idx < dc.takes.size(); idx++) {
			if (dc.takes.get(idx).take.startsWith(t)) {
				grade = grade + dc.takes.get(idx).take + ",";
				temp = temp + dc.takes.get(idx).getStu_id() + ",";// 1234323 "," 123123
			}
		} // for() end = int idx �Ҹ�
		return temp; // for ���� �����ڿ� temp ������� ������ return ����� ��
	}// searchStudentID :String t/String temp �Ҹ�

	/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
	public static String[] searchStudentInfo(String stu_id) {// "1234323......"
		dc.initStudents();
		String[] temp = { "", "" }; // temp[0] �̸���, temp[1] �а� ��ȣ��
		String[] s_ids = stu_id.split(",");

		for (int n = 0; n < dc.students.size(); n++) { // �а���ȣ n++
			for (int idx = 0; idx < dc.students.size(); idx++) {// �л�����; idx++
				if (dc.students.get(idx).getStu_id().equals(s_ids[idx])) {// �޼��带 ������ �ݺ��ϴ°� �غ���
					temp[0] = temp[0] + dc.students.get(idx).name + ",";// �̸�
					temp[1] = temp[1] + dc.students.get(idx).getDept_id() + ",";
				}
			}
		}
		// Ȯ�� �ڵ�System.out.println(dc.students[0].stu_id);
		return temp;// temp[0]�� �̸��� ������ �ִ� ��
	}

	/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
	public static String convertDepartmentID(String d_id) {
		dc.initDepartments();
		String[] temp = d_id.split(",");// "920".
		String dnames = "";
		int no = 0;
		// depts : 920, 923
		for (int n = 0; n < temp.length; n++) {// ��ȸ�� �й��� ���� ��ŭ �ݺ�
			for (int idx = 0; idx < dc.depts.size(); idx++) {// dc.dept�迭�� ���� ��ŭ �ݺ�
				no = Integer.parseInt(temp[n]);
				if (dc.depts.get(idx).dept_id == no) {
					dnames = dnames + dc.depts.get(idx).dept_name + ",";
				}
			}
		}
		// Ȯ�� �ڵ� System.out.println(dc.depts[2].dept_name);
		// System.out.println(dnames);
		return dnames;// �а������ �����ϰ� �ִ°�
	}// convertDepartmentID end

	/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
	// String name : "�豤��
	// String id : "132465
	// String dname :"��ǻ�� ���а�,~~
	public static void printResult(String s, String string, String string2) {// ��� �ؾ� �ϴ� �� �̸�, �а�, ����
		// dnames;//�а������ �����ϰ� �ִ°�
		// temp;// temp[0]�� �̸��� ������ �ִ� ��
		String dname = "";
		String id = "";
		String name = "";
		String[] snames = name.split(",");
		String[] ids = id.split(",");
		String[] dnames = dname.split(",");
	
			System.out.println(snames[0] + ids[0] + dnames[0]);
	
	}

} // MethodClass END

/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ȣ�� **/

/** ������ A�̻�(A, A+) �� �л����� �̸��� �й�, �а����� ��� **/
/** 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ�� **/

/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/

/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/

/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
