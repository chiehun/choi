package hun.com;

public class DateClass {
	public static ComStudyClass[] coms =new ComStudyClass[3];
	public static StutentClass[] stc = new StutentClass[8];
	
	public DateClass() {	
	}
		public static void initcoms() {
		coms[0]=new ComStudyClass("920", "��ǻ�Ͱ��а�", "201ȣ");
		coms[1]=new ComStudyClass ("923", "������а�", "207ȣ");
		coms[2]=new ComStudyClass("925", "���ڰ��а�", "308ȣ");
			
		}
		public static void initstc() {
			stc[0]=new StutentClass("1292001", "900424-1825409", "�豤��", 3, "����", "920");			
			stc[1]=new StutentClass("1292002", "900305-1730021", "������", 3, "����", "920");
			stc[2]=new StutentClass("1292003", "891021-2308302", "������", 4, "����", "920");
			stc[3]=new StutentClass("1292301", "890902-2704012", "������", 2, "�뱸", "923");
			stc[4]=new StutentClass("1292303", "910715-1524390", "�ڱ���", 3, "����", "923");
			stc[5]=new StutentClass("1292305", "921011-1809003", "�����", 4, "�λ�", "923");
			stc[6]=new StutentClass("1292501", "900825-1506390", "��ö��", 3, "����", "925");
			stc[7]=new StutentClass("1292502", "911011-1809003", "���¼�", 3, "����", "925");
			
		}
	

}
