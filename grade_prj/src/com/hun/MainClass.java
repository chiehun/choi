package com.hun;

public class MainClass {

	public static void main(String[] args) {
		GradeClass[] grade = new GradeClass[6];
		grade[0] = new GradeClass("1292001", "900424-1825409", "�豤��", 3, "����", 92);
		grade[1] = new GradeClass("1292002", "900305-1730021", "������", 3, "����", 20);
		grade[2] = new GradeClass("1292003", "891021-2308302", "������", 4, "����", 55);
		grade[3] = new GradeClass("1292301", "890902-2704012", "������", 2, "�뱸", 78);
		grade[4] = new GradeClass("1292303", "910715-1524390", "�ڱ���", 3, "����", 54);
		grade[5] = new GradeClass("1292305", "921011-1809003", "�����", 4, "�λ�", 88);
		grade[6] = new GradeClass("1292501", "900825-1506390", "��ö��", 3, "����", 73);
		grade[7] = new GradeClass("1292502", "911011-1809003", "���¼�", 3, "����", 95);

		
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}

	}// main

}// class END
