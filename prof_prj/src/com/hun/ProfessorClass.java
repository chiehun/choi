package com.hun;

public class ProfessorClass {
	// "92001", "590327-1839240", "이태규", 920, "교수", "1997"
	// 이 영역에 선언되는 변수는 클래스의 인스턴스 변수
	// 인스턴스는 클래스가 객체로 생성되는 과정...
	// 생성된 객체는 하나의 인스턴스 결과..

	public String n, jumin, name, rank, year;
	public int pay;
	public int age = 0;// 주민 번호를 이용한 나이 저장 변수
	public int proyears=0;// 입사 년도를 이용한 재직 년수 저장 변수
	// String j

	public ProfessorClass(String no, String j, String n, int p, String r, String y) {

		this.n = no;
		this.jumin = j;
		this.name = n;
		this.rank = r;
		this.pay = p;
		this.year = y;
this.fassyear(this.year);
		 this.ageM(this.jumin);// this.ageMethod(j);
	}// 생성자 END
		//주민 번호를 이용한 나이계산 매서드

	public void ageM(String jumin) {
		String[] ju = jumin.split("-");

		String min = ju[0].substring(0, 2);
		int tp = Integer.parseInt(min);

		/*
		 * String nFront = ju[0].substring(0, 2); int temp = Integer.parseInt(nFront);
		 */

		String nBack = ju[1].substring(0, 1);
		if (nBack.equals("1") || nBack.equals("2")) {
			this.age = 2020 - (tp + 1900);
		} else {
			this.age = 2020 - (tp + 2000);

		}
	}
	public void fassyear(String year) {
		int py =Integer.parseInt(year);
		this.proyears = 2020 -py;
	}
}// Class END
