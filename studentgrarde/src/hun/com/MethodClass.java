package hun.com;

;

/** �۾� �޼���鸸 �����ϴ� Ŭ���� **/
public class MethodClass {
	public static DateClass dc = null;

	public MethodClass() {
	} // ������ END

	/**
	 * 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ����
	 * 
	 * @return
	 **/
	public static void CreatMethod() {
		dc = new DateClass();
		dc.initTake();
		dc.initDepartment();

	}

	// "1292001", "C101-01", "B+"
	/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
	public static String seachstudent(String t) {
		String grade = "";
		String temp = "";

		for (int i = 0; i < dc.take.size(); i++) {

			// ������ take.grade�� �ҷ��� �ϴµ� ��� �θ��� �𸣰���
			dc.take.get(i).grade.startsWith(t);
			grade = grade + dc.take.get(i).grade + ",";
			temp = temp + dc.take.get(i).getStudent_id() + ",";// �й� 174637,9413
			// temp =tk.//private ���� ��� �����ϴ����� ����// �ذ� dc,take=ArrayList
			// dc.take.get(0)=takeclass
			// ������ ���� �ϴ� ����
		}
		return temp;
	}

	// 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **
	public static String[] seachdept(String a) {// �й�
		dc.initStudent();
		String s[] = a.split(",");
		String[] tem = { "", "" };
		int dept_id = 0;
		for (int idx = 0; idx < s.length; idx++) {
			for (int a1 = 0; a1 < dc.stu.size(); a1++)
				if (dc.stu.get(idx).getStu_id().equals(s[idx])) {
					tem[0] = (tem[0] + dc.stu.get(idx).name + ","); // �տ� Ÿ�� ���� �߸� �ԷµǾ� �վ���// �а� �̸�
					tem[1] = (tem[1] + dept_id + dc.stu.get(idx).getDept_id()) + ",";// �а��μ� ��ȣ }
				}
			// "1292001", "900424-1825409", "�豤��", 3, "����", 920
		}
		return tem;// �а� ��ȣ
	}

	public static String fia(String a) {
		dc.initDepartment();
		String dname="";
		String D_name[]=a.split(",");
		
		for(int idx=0; idx<a.length(); idx++) {			
			for(int i=0; i<dc.dept.size(); i++) {				
				if(dc.dept.get(i).dept_name.contentEquals(D_name[i]));
				dname=dname+dc.dept.get(i).dept_name;
			}
		}
		return dname;// �а���
	}


	public static void printResult(String a, String d, String c) {// ��� �ؾ� �ϴ� �� �̸�, �а�, ����
		// dnames;//�а������ �����ϰ� �ִ°�
		// temp;// temp[0]�� �̸��� ������ �ִ� ��
		String dname = "";
		String id = "";
		String name = "";
		String[] snames = name.split(",");
		String[] ids = id.split(",");
		String[] dnames = dname.split(",");

		for (int idx = 0; idx < snames.length; idx++) {
			System.out.println(snames[idx] + ids[idx] + dnames[idx]);
		} // MethodClass END
	}
}
/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ȣ�� **/

/** ������ A�̻�(A, A+) �� �л����� �̸��� �й�, �а����� ��� **/
/** 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ�� **/

/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/

/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
