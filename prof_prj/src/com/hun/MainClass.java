package com.hun;

public class MainClass {

	public static void main(String[] args) {
		ProfessorClass[] profs =new  ProfessorClass[6];
		profs [0] = new ProfessorClass("92001", "590327-1839240", "���±�", 920, "����", "1997");
		profs [1] = new ProfessorClass("92002", "690702-1350026", "����", 910, "�α���", "2003");
		profs [2] = new ProfessorClass("92301", "741011-2765501", "�ּ���", 910, "�α���", "2005");
		profs [3] = new ProfessorClass("92302", "750728-1102458", "���¼�", 920, "����", "1999");
		profs [4] = new ProfessorClass("92501", "620505-1200546", "��ö��", 900, "������", "2007");
		profs [5] = new ProfessorClass("92502", "740101-1830264", "��μ�", 910, "�α���", "2005");

		
		/*int sum=0;
		sum=pc1.pay+pc2.pay+pc3.pay+pc4.pay+pc5.pay+pc6.pay;
		ProfessorClass [] profs1 = {pc1, pc2, pc3, pc4, pc5, pc6};
		System.out.println(profs[0].year);
		
		int [] age=new int[6];
		
		for(int idx=0; idx<profs1.length; idx++) {
			sum=sum+profs[idx].pay;
			age[0]=profs1[0].age;
			System.out.println(age);			
				}*/
	for(int i = 0; i  < profs.length; i++) {
		System.out.println(profs[i].proyears);
		System.out.println();
	}


	} // main
}// class
