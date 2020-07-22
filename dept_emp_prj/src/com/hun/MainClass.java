package com.hun;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 특정 부서에 근무하는 사람의 이름 출력
		String dName="경리부";
		DateClass.initDept();
		DateClass.initEMP();
		String n="";
		String ename="";
		for(int idx=0; idx<DateClass.depts.length; idx++) {
				if(DateClass.depts[idx].deptName.equals(dName)) {					
					n=DateClass.depts[idx].deptNo;					
				}
		}// 부서 번호 검색 종료
		
		
		for(int idx=0; idx<DateClass.emps.length; idx++) {
			
			if (DateClass.emps[idx].deptNo.equals(n)) {
				
				ename=ename +DateClass.emps[idx].empName+",";				
			}
			
			}
		
		
		String[] enames=ename.split(",");		
		System.out.println("경리부사원 명단 ");
		System.out.println("------------------- ");
		for(int f=0; f<enames.length; f++) {
			System.out.println(enames[f]);
		}			
	}
}

