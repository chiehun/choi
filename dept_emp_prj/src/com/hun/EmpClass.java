package com.hun;

public class EmpClass {
//"1001", "����", "���", "1013", "2007-03-01", 300, 0, "20");
	public String empNo	=""; 		//��� ������ȣ
	public String empName="";	//����̸�
	public String job ="";				//����
	public String mgr	="";			//���޹�ȣ
	public String hireDate	="";	
	public int sale=0;
	public int commission	=0;
	public String  deptNo="";
	
	public EmpClass() {
		// TODO Auto-generated constructor stub
	}

	public EmpClass(String empN, String string2, String string3, String string4, String string5, int i, int j,
			String string6) {
		// TODO Auto-generated constructor stub
		this.empNo=empN;
		this.empName=string2;
		this.job=string3;
		this.mgr=string4;
		this.hireDate=string5;
		this.sale=i;
		this.commission=j;
		this.deptNo=string6;
				
	}

}
