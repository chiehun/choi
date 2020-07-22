package com.hun;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Interface는 생성자가 없기 때문에 객체 생성 불가능!!!
	
		GeneralClass gc= new GeneralClass() ;
		gc.avg(); // 강제 재정의 된 메서드
		gc.max(); // 상속 받은 일반 메서드
		
		// 추상 클래스는 생성자를 보유하지만 new 로 객체 생성 불가능!!!
//		AbstractClass as = new AbstractClass();
	}

}
