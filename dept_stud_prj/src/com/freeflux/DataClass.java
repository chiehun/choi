package com.freeflux;

/**  �а� �� �л��������� �����ϴ� Ŭ���� **/
public class DataClass {
	Department[] depts=new Department[3];	// �а����� �迭
	Student[] students=new Student[8];			// �л����� �迭
	
	public DataClass() { // �⺻ ������
		
	} // ������ END

	/** �а����� �ʱ� ������ �޼��� **/
	public void initDepartments() {
		depts[0]=new Department("920", "��ǻ�Ͱ��а�", "201ȣ");
		depts[1]=new Department("923", "������а�", "207ȣ");
		depts[2]=new Department("925", "���ڰ��а�", "308ȣ");
	}
	/** �л����� �ʱ� ������ �޼��� **/
	public void initStudents() {
		students[0]=new Student("1292001", "900424-1825409", "�豤��", 3, "����", "920");
		students[1]=new Student("1292002", "900305-1730021", "������", 3, "����", "920");
		students[2]=new Student("1292003", "891021-2308302", "������", 4, "����", "920");
		students[3]=new Student("1292301", "890902-2704012", "������", 2, "�뱸", "923");
		students[4]=new Student("1292303", "910715-1524390", "�ڱ���", 3, "����", "923");
		students[5]=new Student("1292305", "921011-1809003", "�����", 4, "�λ�", "923");
		students[6]=new Student("1292501", "900825-1506390", "��ö��", 3, "����", "925");
		students[7]=new Student("1292502", "911011-1809003", "���¼�", 3, "����", "925");
	}
	
} // class END