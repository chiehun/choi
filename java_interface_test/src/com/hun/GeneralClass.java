package com.hun;


// Interface는 일반 클래스에게 상속될 수 없다..
// public class GeneralClass extends InterfaceClass{

// Interface는 일반 클래스에게 구현 가능
// Interface에 선언된 변수 메서드들을 반드시 구현해야 한다.
// 구현 받은 기능들은 재정의 해야 한다
// 일단 클래스는 상속도 받고 인터페이스도 받을수 있다
public class GeneralClass extends AbstractClass implements InterfaceClass, InterfaceClass2{
	// 맴버(인스턴스) 변수 보유 // 메서드 보유

	
	// 생성자 보유
	public GeneralClass() {
	
}

	@Override
	public void avg() { // 추상 클래스(AbstractClass) 내부의 추상 메서드 강제 재정의!!
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum(float f1, float f2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sum(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int avg(float f1, float f2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void avg(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}
}