package com.hun;

public class GradeClass {
		
	public String Studentcode, jumin, name, home;
	public int  grade;
	public int  point;
	public int age;
//	public 
  
	public GradeClass(String stcode, String ju, String nm, int gd, String ho, int pt) {
		/* s,s,s in s in
		1. �й�,		2. age(����)	3. �̸� 	4. �г�		5. ������		6. 90�� �̻� 'A' = char*/
		this.Studentcode=stcode;
		this.jumin=ju;
		this.name=nm;
		this.grade=gd;
		this.home=ho;
		this.point=pt;						
	}
	public void AgeMothed(String ju) {
		String []jp=jumin.split("-");		
		String min= jp[0].substring(0, 2);// ���ڿ�
		
		int tp=Integer.parseInt(min);// 99,93,91,
		
		String nfront=jp[1].substring(0, 1);// 12
		if(jp.equals("1") || jp.equals("2")) {
			this.age = 2020 - (1900+tp);			
		}else {			
			this.age = 2020 - (2000+tp);
		}
	}
		

}
