package hun.com;

public class DateClass {
	public static ComStudyClass[] coms =new ComStudyClass[3];
	public static StutentClass[] stc = new StutentClass[8];
	
	public DateClass() {	
	}
		public static void initcoms() {
		coms[0]=new ComStudyClass("920", "컴퓨터공학과", "201호");
		coms[1]=new ComStudyClass ("923", "산업공학과", "207호");
		coms[2]=new ComStudyClass("925", "전자공학과", "308호");
			
		}
		public static void initstc() {
			stc[0]=new StutentClass("1292001", "900424-1825409", "김광식", 3, "서울", "920");			
			stc[1]=new StutentClass("1292002", "900305-1730021", "김정현", 3, "서울", "920");
			stc[2]=new StutentClass("1292003", "891021-2308302", "김현정", 4, "대전", "920");
			stc[3]=new StutentClass("1292301", "890902-2704012", "김현정", 2, "대구", "923");
			stc[4]=new StutentClass("1292303", "910715-1524390", "박광수", 3, "광주", "923");
			stc[5]=new StutentClass("1292305", "921011-1809003", "김우주", 4, "부산", "923");
			stc[6]=new StutentClass("1292501", "900825-1506390", "박철수", 3, "대전", "925");
			stc[7]=new StutentClass("1292502", "911011-1809003", "백태성", 3, "서울", "925");
			
		}
	

}
