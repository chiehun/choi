package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ȣ�� **/
		MethodClass.createObject();
		// System.out.println(MethodClass.dc.takes.length);// Ȯ�� �ڵ�

		/** ������ A�̻�(A, A+) �� �л����� �̸��� �й�, �а����� ��� **/
		String stu_id = MethodClass.searchStudentID("A"); // Ȯ�� �ڵ�//D��"A"�θ� ��� �Ǵ°�
		//stu_id : �й���
		//System.out.println(stu_id);
		/** 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ�� **/
		//MethodClass.searchStudentInfo(stu_id);
		/**�й� �ߺ� ���� �޼��� ȣ��

		/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
		String[] infos = MethodClass.searchStudentInfo(stu_id);
		// infos[0] : �̸��� / infos[1] : �а���ȣ��
		/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
		String dnames=MethodClass.convertDepartmentID(infos[1]);
	
				//"��ǻ�� ���а�
		/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
		String[] s= dnames.split(",");
		String[] a = infos[1].split(",");
		String[] b=infos[0].split(",");
		for(int idx=0; idx<a.length; idx++) {
			System.out.println(s[idx]);
			System.out.println(a[idx] );
			System.out.println(b[idx]);
		}
	} // main() END

} // class END
