package com.hun;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인사부 사람들의 평균 급여!
		String dName = "인사부";// 인사부
		DateClass.initDept();
		DateClass.initEMP();
		String n = "";
		String ename = "";
		String sale = "";
		for (int idx = 0; idx < DateClass.depts.length; idx++) {
			if (DateClass.depts[idx].deptName.equals(dName)) {
				n = DateClass.depts[idx].deptNo; // 부서 번호
			}
		} // 부서 번호 검색 종료

		for (int idx = 0; idx < DateClass.emps.length; idx++) {
			// "1001", "김사랑", "사원", "1013", "2007-03-01", 300, 0, "20"
			if (DateClass.emps[idx].deptNo.equals(n)) {

				ename = ename + DateClass.emps[idx].empName + ","; // 사원이름
				sale = sale + DateClass.emps[idx].sale + ","; //급여
			}
		}
		int sum = 0;
		String[] enames = ename.split(",");
		String[] sales=sale.split(",");
		System.out.println("경리부사원 명단 ");
		System.out.println("------------------- ");
		for (int f = 0; f < enames.length; f++) {
			System.out.println(enames[f]);
		}
		for(int a=0; a<5; a++) {
				sum=sum+Integer.parseInt(sales[a]);			
		}	
		double avg =0;
		avg=sum/ename.length()*1.0;
		System.out.println(sum);
		System.out.println(avg);
	}
 }
