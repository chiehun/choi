package com.hun;


// Interface는 객체로 생성 불가능 (상속(일반 클래스) 도 불가능
// Interface 끼리는 한번에 다중 상속 가능.
//일반 클래스는 Interface를 구현(implements) 받을 수 있다.
//일반 클래스는 Interface들을 한번에 여러개 구현 받을 수 있다.
public interface InterfaceClass2 {
	// 상수만 선언 가능
int a=100; //(상수)  // static final int a=100; 상수로 컴파일 됨
// 생성자 보유할 수 없음
	//
	//public interfaceClass() {
//}

//메서드 선언부만 가능( {  } 사용 불가능)
	public void sum();  // 이게 어떤 의미를 가질까?!
	public int sum(float f1, float f2);
	public void sum(int n1, int n2);


}
