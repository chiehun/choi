package com.hun;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �λ�� ������� ��� �޿�!
		String dName = "�λ��";// �λ��
		DateClass.initDept();
		DateClass.initEMP();
		String n = "";
		String ename = "";
		String sale = "";
		for (int idx = 0; idx < DateClass.depts.length; idx++) {
			if (DateClass.depts[idx].deptName.equals(dName)) {
				n = DateClass.depts[idx].deptNo; // �μ� ��ȣ
			}
		} // �μ� ��ȣ �˻� ����

		for (int idx = 0; idx < DateClass.emps.length; idx++) {
			// "1001", "����", "���", "1013", "2007-03-01", 300, 0, "20"
			if (DateClass.emps[idx].deptNo.equals(n)) {

				ename = ename + DateClass.emps[idx].empName + ","; // ����̸�
				sale = sale + DateClass.emps[idx].sale + ","; //�޿�
			}
		}
		int sum = 0;
		String[] enames = ename.split(",");
		String[] sales=sale.split(",");
		System.out.println("�渮�λ�� ��� ");
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
