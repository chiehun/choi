package hun.com;

public class DateClass {
	static DeptmentClass [] dept= new DeptmentClass[3];
	static StudentClass std []= new StudentClass[8];
	static TakesClass tak [] = new TakesClass[12];
	// 데이터 주소
	public DateClass() {		
	}//초기 생성자
	//학과 정보 메서드
	public static  void initDeptmentClass() {
		dept[0] = new DeptmentClass (920, "컴퓨터공학과", "201호");
		dept[1] = new DeptmentClass (923, "산업공학과", "207호");
		dept[2] = new DeptmentClass (925, "전자공학과", "308호");
	}
	public static  void initStudentClass() {
		std[0] = new StudentClass ("1292001", "900424-1825409", "김광식", 3, "서울", 920);
		std[1]= new StudentClass ("1292002", "900305-1730021", "김정현", 3, "서울", 920);	
		std[2]= new StudentClass ("1292003", "891021-2308302", "김현정", 4, "대전", 920);
		std[3]= new StudentClass ("1292301", "890902-2704012", "김현정", 2, "대구", 923);
		std[4]= new StudentClass ("1292303", "910715-1524390", "박광수", 3, "광주", 923);
		std[5]= new StudentClass ("1292305", "921011-1809003", "김우주", 4, "부산", 923);
		std[6]= new StudentClass ("1292501", "900825-1506390", "박철수", 3, "대전", 925);
		std[7]= new StudentClass ("1292502", "911011-1809003", "백태성", 3, "서울", 925);
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
