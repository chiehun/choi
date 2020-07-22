package com.freeflux;

/**
 * 연산을 하는 메서들만 보유하는 클래스
 * 
 * @param dc
 *            : 전체 데이터들 보유 객체
 **/
public class MethodClass {
	public static DataClass dc = null;

	public MethodClass() { // 기본 생성자
	} // 생성자 END

	/** 전체 데이터를 보유하는 객체 생성 메서드 선언 **/
	public static void createObject() {
		dc = new DataClass();
	}

	/**
	 * 합을 구하고 반환하는 메서드 선언
	 * @return 
	 * 
	 * @return : 조회수 합 반환
	 **/
	public static int sum() {
		dc.initBoards();
		int temp = 0; // 합을 누적
		for (int idx = 0; idx<dc.boardList.length; idx++) {
			temp = temp + dc.boardList[idx].getHit();
		}
		return temp;
	}

	/** 평균구하고 반환하는 메서드 선언 **/

	public static double mean(int totalHit) {
		return (float) totalHit / dc.boardList.length;
	}

	/** 출력하는 메서드 선언 **/
	public static void printResult(double avgHit) {
		String t="조회수";
		int n = 10;
		System.out.printf("평균 조회수 %s : %.2f =>%d", t  ,avgHit , n);
		
	}

	/** 중복값을 제거하여 반환하는 메서드 선언 **/
	public static void unique() {

	}
}
