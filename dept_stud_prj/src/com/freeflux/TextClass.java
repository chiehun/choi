package com.freeflux;

/** 학생정보 클래스 **/
public class TextClass {
	public TextClass() {
	}

	public static DataClass creatObject() {

		DataClass dc = new DataClass();
		dc.initDepartments(); // 학과정보 배열에 초기 데이터 대입
		dc.initStudents(); // 학생정보 배열에 초기 데이터 대입
		return dc;
	}

	/** 1. 학생정보 배열 로부터 여학생 검색 메서드 **/
	public static String[] searchinfo(char c, Student[] s) {

		String names = ""; // 검색 학생이름들 : "이름,이름...."
		String dept_id = ""; // 검색 학생 학과번호들 : "학과번호,학과번호...."
		int ageSum = 0; // 나이 합
		int count = 0; // 검색 인원수
		for (int idx = 0; idx < s.length; idx++) {
			if (s[idx].gender == c) {
				names = names + s[idx].name + ","; // 학생 이름 누적
				dept_id = dept_id + s[idx].dept_id + ","; // 학생 학과번호 누적
				ageSum = ageSum + s[idx].age; // 학생 나이 누적
				count = count + 1; // count++ 와 동일 // 인원수 증가

			}
		}
		String[] resultData = { names, dept_id, (ageSum + ""), (count + "") };
		return resultData;
	}

	public static String[] StringSplit(String s) {
		return s.split(",");

	} // dept_id:"920","923", d.depts

	public static String[] convertDept(String[] d, Department[] dd) {// d 학과 번호들
		String[] dname = new String[d.length]; // 학과 이름을 저장
		// for 문 처리 해오보기(0708과제)
		dname[0] = searchDeptName(dd, d[0]);
		dname[1] = searchDeptName(dd, d[1]);
		return dname;
	} // d.depts "920"

	public static String searchDeptName(Department[] depts, String sName) {
		String dName = "";
		for (int idx = 0; idx < depts.length; idx++) {
			if (depts[idx].dept_id.equals(sName)) {
				dName = depts[idx].dept_name;
			}
		}
		return dName;
	}

	// 3. 여학생의 평균나이 구하기
	public static double avg(String s, String c) {
		int sum = Integer.parseInt(s);
		int count = Integer.parseInt(c);
		return (float) sum / count;
	}
 public static void answer(String s1[], String s2[],  double s4) {
	 
	 for(int idx=0; idx<s1.length; idx++) {
			System.out.println(s1[idx]);
	 }	 
	 for(int idx=0; idx<s2.length; idx++) {
	 System.out.println(s2[idx]);
	 }
	 System.out.println(s4);
 }


}// class END
