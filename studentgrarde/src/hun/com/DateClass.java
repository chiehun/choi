package hun.com;

import java.util.ArrayList;



public class DateClass {
ArrayList <Department>dept = new ArrayList<Department>(); // �а� ����
ArrayList<Student> stu =new ArrayList<Student>(); //�л� ����
ArrayList<Takes> take = new ArrayList<Takes>(); //����
	public DateClass() {
	
		
	}
	public void initDepartment() {
		dept.add( new Department  (920, "��ǻ�Ͱ��а�", "201ȣ"));
		dept.add(new Department(923, "������а�", "207ȣ"));
		dept.add(new Department(925, "���ڰ��а�", "308ȣ"));
		
	}
	public void initStudent() {
		stu.add(new Student("1292001", "900424-1825409", "�豤��", 3, "����", 920));
		stu.add(new Student("1292002", "900305-1730021", "������", 3, "����", 920));
		stu.add(new Student("1292003", "891021-2308302", "������", 4, "����", 920));
		stu.add(new Student("1292301", "890902-2704012", "������", 2, "�뱸", 923));
		stu.add(new Student("1292303", "910715-1524390", "�ڱ���", 3, "����", 923));
		stu.add(new Student("1292305", "921011-1809003", "�����", 4, "�λ�", 923));
		stu.add(new Student("1292501", "900825-1506390", "��ö��", 3, "����", 925));
		stu.add(new Student("1292502", "911011-1809003", "���¼�", 3, "����", 925));
	}
	public void initTake() {
		take.add(new Takes("1292001", "C101-01", "B+"));
		take.add(new Takes("1292001", "C103-01", "A+"));
		take.add(new Takes("1292001", "C301-01", "A"));
		take.add(new Takes("1292002", "C102-01", "A"));
		take.add(new Takes("1292002", "C103-01", "B+"));
		take.add(new Takes("1292002", "C502-01", "C+"));
		take.add(new Takes("1292003", "C103-02", "B"));
		take.add(new Takes("1292003", "C501-02", "A+"));
		take.add(new Takes("1292301", "C102-01", "C+"));
		take.add(new Takes("1292303", "C102-01", "C"));
		take.add(new Takes("1292303", "C103-02", "B+"));
		take.add(new Takes("1292303", "C501-01", "A+"));
	}
}
