package com.hun;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ư�� �μ��� �ٹ��ϴ� ����� �̸� ���
		String dName="�渮��";
		DateClass.initDept();
		DateClass.initEMP();
		String n="";
		String ename="";
		for(int idx=0; idx<DateClass.depts.length; idx++) {
				if(DateClass.depts[idx].deptName.equals(dName)) {					
					n=DateClass.depts[idx].deptNo;					
				}
		}// �μ� ��ȣ �˻� ����
		
		
		for(int idx=0; idx<DateClass.emps.length; idx++) {
			
			if (DateClass.emps[idx].deptNo.equals(n)) {
				
				ename=ename +DateClass.emps[idx].empName+",";				
			}
			
			}
		
		
		String[] enames=ename.split(",");		
		System.out.println("�渮�λ�� ��� ");
		System.out.println("------------------- ");
		for(int f=0; f<enames.length; f++) {
			System.out.println(enames[f]);
		}			
	}
}

