package com.hun;

public class ProfessorClass {
	// "92001", "590327-1839240", "���±�", 920, "����", "1997"
	// �� ������ ����Ǵ� ������ Ŭ������ �ν��Ͻ� ����
	// �ν��Ͻ��� Ŭ������ ��ü�� �����Ǵ� ����...
	// ������ ��ü�� �ϳ��� �ν��Ͻ� ���..

	public String n, jumin, name, rank, year;
	public int pay;
	public int age = 0;// �ֹ� ��ȣ�� �̿��� ���� ���� ����
	public int proyears=0;// �Ի� �⵵�� �̿��� ���� ��� ���� ����
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
	}// ������ END
		//�ֹ� ��ȣ�� �̿��� ���̰�� �ż���

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
