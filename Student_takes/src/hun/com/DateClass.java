package hun.com;

public class DateClass {
	static DeptmentClass [] dept= new DeptmentClass[3];
	static StudentClass std []= new StudentClass[8];
	static TakesClass tak [] = new TakesClass[12];
	// ������ �ּ�
	public DateClass() {		
	}//�ʱ� ������
	//�а� ���� �޼���
	public static  void initDeptmentClass() {
		dept[0] = new DeptmentClass (920, "��ǻ�Ͱ��а�", "201ȣ");
		dept[1] = new DeptmentClass (923, "������а�", "207ȣ");
		dept[2] = new DeptmentClass (925, "���ڰ��а�", "308ȣ");
	}
	public static  void initStudentClass() {
		std[0] = new StudentClass ("1292001", "900424-1825409", "�豤��", 3, "����", 920);
		std[1]= new StudentClass ("1292002", "900305-1730021", "������", 3, "����", 920);	
		std[2]= new StudentClass ("1292003", "891021-2308302", "������", 4, "����", 920);
		std[3]= new StudentClass ("1292301", "890902-2704012", "������", 2, "�뱸", 923);
		std[4]= new StudentClass ("1292303", "910715-1524390", "�ڱ���", 3, "����", 923);
		std[5]= new StudentClass ("1292305", "921011-1809003", "�����", 4, "�λ�", 923);
		std[6]= new StudentClass ("1292501", "900825-1506390", "��ö��", 3, "����", 925);
		std[7]= new StudentClass ("1292502", "911011-1809003", "���¼�", 3, "����", 925);
	}
	public static  void initTakesClass() {
		tak[0] =new TakesClass("1292001", "C101-01", "B+");
	    tak[1] =new TakesClass("1292001", "C103-01", "A+");
	    tak[2] =new TakesClass("1292001", "C301-01", "A");
	    tak[3] =new TakesClass("1292002", "C102-01", "A");
	    tak[4] =new TakesClass("1292002", "C103-01", "B+");
	    tak[5] =new TakesClass("1292002", "C502-01", "C+");
	    tak[6] =new TakesClass("1292003", "C103-02", "B");
	    tak[7] =new TakesClass("1292003", "C501-02", "A+");
	    tak[8] =new TakesClass("1292301", "C102-01", "C+");
	    tak[9] =new TakesClass("1292303", "C102-01", "C");
	    tak[10] =new TakesClass("1292303", "C103-02", "B+");
	    tak[11] =new TakesClass("1292303", "C501-01", "A+");			
	}
}
