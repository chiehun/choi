package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 호출 **/
		MethodClass.createObject();
		// System.out.println(MethodClass.dc.takes.length);// 확인 코드

		/** 학점이 A이상(A, A+) 인 학생들의 이름과 학번, 학과명을 출력 **/
		String stu_id = MethodClass.searchStudentID("A"); // 확인 코드//D왜"A"로만 출력 되는가
		//stu_id : 학번들
		//System.out.println(stu_id);
		/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 **/
		//MethodClass.searchStudentInfo(stu_id);
		/**학번 중복 제거 메서드 호출

		/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
		String[] infos = MethodClass.searchStudentInfo(stu_id);
		// infos[0] : 이름들 / infos[1] : 학과번호들
		/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
		String dnames=MethodClass.convertDepartmentID(infos[1]);
	
				//"컴퓨터 공학과
		/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
		String[] s= dnames.split(",");
		String[] a = infos[1].split(",");
		String[] b=infos[0].split(",");
		for(int idx=0; idx<a.length; idx++) {
			System.out.println(s[idx]);
			System.out.println(a[idx] );
			System.out.println(b[idx]);
		}
	} // main() END

} // class END
