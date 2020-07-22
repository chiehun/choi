package com.hun;

public class MainClass {

	public static void main(String[] args) {
		GradeClass[] grade = new GradeClass[6];
		grade[0] = new GradeClass("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		grade[1] = new GradeClass("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		grade[2] = new GradeClass("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		grade[3] = new GradeClass("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		grade[4] = new GradeClass("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		grade[5] = new GradeClass("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		grade[6] = new GradeClass("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		grade[7] = new GradeClass("1292502", "911011-1809003", "백태성", 3, "서울", 95);

		
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}

	}// main

}// class END
