package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		
		DataClass d=TextClass.creatObject();
		//System.out.println(d.depts[2].dept_id);
		// 0. 검색 성별 설정
		char searchGender='F';
		/** 학생 정보 배열(students)로부터 여학생 검색 메서드 호출**/
		
		
		String[] result=TextClass.searchinfo(searchGender, d.students);
		for(int idx=0; idx<result.length; idx++) {
			
		}
		
		/**2. 학생정보문자열 분리 메서드**/
		String[] names=TextClass.StringSplit(result[0]);
		String[] dept_id=TextClass.StringSplit(result[1]);		
		
		/**학과번호를 이용해서 학과명 변경 메서드**/
		
	String[] deptNames=TextClass.convertDept(dept_id, d.depts); //학과 번호 들
	
	/**평균을 구하는 메서드*/
	 double avg=TextClass.avg(result[2], result[3]);
	 
	/**5. 전체 결과를 출력하는 메서드**/
	 
	 TextClass.answer( names, deptNames, avg);
	 
	}//main
	
} // class END



