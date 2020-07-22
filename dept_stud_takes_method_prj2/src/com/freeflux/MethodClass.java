package com.freeflux;

/** 작업 메서드들만 보유하는 클래스 **/
public class MethodClass {
	public static DataClass dc = null;// 객체 변수를 초기화 시킬때 null

	public MethodClass() {
	} // 생성자 END

	/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 선언 **/
	public static void createObject() {
		dc = new DataClass();
		dc.initTakes();
		dc.initDepartments();
		dc.initTakes();
	} // createObject() END

	/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 **/
	// DataClass객체의 takes배열 데이터 중 take 변수 값을 비교하며 검색
	public static String searchStudentID(String t) {// t= A
		// System.out.println(; 확인
		String temp = "";
		String grade = "";
		for (int idx = 0; idx < dc.takes.size(); idx++) {
			if (dc.takes.get(idx).take.startsWith(t)) {
				grade = grade + dc.takes.get(idx).take + ",";
				temp = temp + dc.takes.get(idx).getStu_id() + ",";// 1234323 "," 123123
			}
		} // for() end = int idx 소멸
		return temp; // for 문이 끝난뒤에 temp 사라지기 때문에 return 해줘야 함
	}// searchStudentID :String t/String temp 소멸

	/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
	public static String[] searchStudentInfo(String stu_id) {// "1234323......"
		dc.initStudents();
		String[] temp = { "", "" }; // temp[0] 이름들, temp[1] 학과 번호들
		String[] s_ids = stu_id.split(",");

		for (int n = 0; n < dc.students.size(); n++) { // 학과번호 n++
			for (int idx = 0; idx < dc.students.size(); idx++) {// 학생정보; idx++
				if (dc.students.get(idx).getStu_id().equals(s_ids[idx])) {// 메서드를 꺼내서 반복하는거 해보기
					temp[0] = temp[0] + dc.students.get(idx).name + ",";// 이름
					temp[1] = temp[1] + dc.students.get(idx).getDept_id() + ",";
				}
			}
		}
		// 확인 코드System.out.println(dc.students[0].stu_id);
		return temp;// temp[0]은 이름을 가지고 있는 값
	}

	/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
	public static String convertDepartmentID(String d_id) {
		dc.initDepartments();
		String[] temp = d_id.split(",");// "920".
		String dnames = "";
		int no = 0;
		// depts : 920, 923
		for (int n = 0; n < temp.length; n++) {// 조회라 학번의 갯수 만큼 반복
			for (int idx = 0; idx < dc.depts.size(); idx++) {// dc.dept배열의 갯수 만큼 반복
				no = Integer.parseInt(temp[n]);
				if (dc.depts.get(idx).dept_id == no) {
					dnames = dnames + dc.depts.get(idx).dept_name + ",";
				}
			}
		}
		// 확인 코드 System.out.println(dc.depts[2].dept_name);
		// System.out.println(dnames);
		return dnames;// 학과명들을 저장하고 있는값
	}// convertDepartmentID end

	/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
	// String name : "김광식
	// String id : "132465
	// String dname :"컴퓨터 공학과,~~
	public static void printResult(String s, String string, String string2) {// 출력 해야 하는 값 이름, 학과, 성적
		// dnames;//학과명들을 저장하고 있는값
		// temp;// temp[0]은 이름을 가지고 있는 값
		String dname = "";
		String id = "";
		String name = "";
		String[] snames = name.split(",");
		String[] ids = id.split(",");
		String[] dnames = dname.split(",");
	
			System.out.println(snames[0] + ids[0] + dnames[0]);
	
	}

} // MethodClass END

/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 호출 **/

/** 학점이 A이상(A, A+) 인 학생들의 이름과 학번, 학과명을 출력 **/
/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 **/

/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/

/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/

/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
