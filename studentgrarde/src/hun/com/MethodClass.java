package hun.com;

;

/** 작업 메서드들만 보유하는 클래스 **/
public class MethodClass {
	public static DateClass dc = null;

	public MethodClass() {
	} // 생성자 END

	/**
	 * 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 선언
	 * 
	 * @return
	 **/
	public static void CreatMethod() {
		dc = new DateClass();
		dc.initTake();
		dc.initDepartment();

	}

	// "1292001", "C101-01", "B+"
	/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
	public static String seachstudent(String t) {
		String grade = "";
		String temp = "";

		for (int i = 0; i < dc.take.size(); i++) {

			// 문제점 take.grade을 불러야 하는데 어떻게 부르진 모르겠음
			dc.take.get(i).grade.startsWith(t);
			grade = grade + dc.take.get(i).grade + ",";
			temp = temp + dc.take.get(i).getStudent_id() + ",";// 학번 174637,9413
			// temp =tk.//private 여서 어떻게 접근하는지가 문제// 해결 dc,take=ArrayList
			// dc.take.get(0)=takeclass
			// 성적을 저장 하는 변수
		}
		return temp;
	}

	// 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **
	public static String[] seachdept(String a) {// 학번
		dc.initStudent();
		String s[] = a.split(",");
		String[] tem = { "", "" };
		int dept_id = 0;
		for (int idx = 0; idx < s.length; idx++) {
			for (int a1 = 0; a1 < dc.stu.size(); a1++)
				if (dc.stu.get(idx).getStu_id().equals(s[idx])) {
					tem[0] = (tem[0] + dc.stu.get(idx).name + ","); // 앞에 타입 값이 잘못 입력되어 잇었음// 학과 이름
					tem[1] = (tem[1] + dept_id + dc.stu.get(idx).getDept_id()) + ",";// 학과부서 번호 }
				}
			// "1292001", "900424-1825409", "김광식", 3, "서울", 920
		}
		return tem;// 학과 번호
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
		return dname;// 학과명
	}


	public static void printResult(String a, String d, String c) {// 출력 해야 하는 값 이름, 학과, 성적
		// dnames;//학과명들을 저장하고 있는값
		// temp;// temp[0]은 이름을 가지고 있는 값
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
/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 호출 **/

/** 학점이 A이상(A, A+) 인 학생들의 이름과 학번, 학과명을 출력 **/
/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 **/

/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/

/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
