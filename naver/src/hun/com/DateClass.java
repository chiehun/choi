package hun.com;

public  class DateClass {
	
	GePanClass gp[] = new GePanClass[18];

	public DateClass() {
		// 11968, "2020 07 08 클래스연습데이터7 (student, takes)" , "김광식", 25
	}

	public void initGePanClass() {
		gp[0] = new GePanClass(11968, "2020 07 08 클래스연습데이터7 (student, takes)", "김광식", 25);
		gp[1] = new GePanClass(11967, "2020 07 08 클래스연습데이터5 (학과/학생)", "김정현", 62);
		gp[2] = new GePanClass(11965, "2020 07 07 클래스 연습 데이터 4 (부서/사원)", "김현정", 60);
		gp[3] = new GePanClass(11966, "2020 07 07 클래스 연습 데이터 4 ", "김우주", 34);
		gp[4] = new GePanClass(11964, "2020 07 07 클래스 연습 데이터 3 (도서) ", "김우주", 65);
		gp[5] = new GePanClass(11963, "2020 07 06 클래스 연습 데이터 2 (학생) ", "김현정", 44);
		gp[6] = new GePanClass(11962, "2020 07 06 클래스 연습 데이터 (교수) ", "백태성", 48);
		gp[7] = new GePanClass(11961, "2020 07 03 3가지 문제를 메서드 처리 ", "김광식", 58);
		gp[8] = new GePanClass(11960, "2020 07 03 split() 와 클래스 연습 데이터", "김정현", 54);
		gp[9] = new GePanClass(11959, "2020 07 02 마지막 3가지 문제 ", "박광수", 92);
		gp[10] = new GePanClass(11958, "2020 07 02 split test ", "김현정", 53);
		gp[11] = new GePanClass(11957, "2020 07 02 제어문 연습데이터 ", "김정현", 64);
		gp[12] = new GePanClass(11956, "코드를 엉망으로 작성하는 법 ", "박광수", 43);
		gp[13] = new GePanClass(11955, "유지 보수 어렵게 코딩하는 방법 ", "김광식", 59);
		gp[14] = new GePanClass(11954, "2020 07 01 Java Platform Standard Edition 8 Documentation ",	"Amor vincit omnia", 29);
		gp[15] = new GePanClass(11640, "2019 01 30 변수, 배열, 객체, 클래스 (기초 문법 간단 요약) ", "박광수", 91);
		gp[16] = new GePanClass(11640, "2019 01 30 변수, 배열, 객체, 클래스 (기초 문법 간단 요약) ", "김우주", 95);
		gp[17] = new GePanClass(11639, "2019 01 30 기본 지식 정리 ", "김우주", 70);

	}
}
