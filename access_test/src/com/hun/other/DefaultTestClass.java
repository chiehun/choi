package com.hun.other;

import com.hun.DefaultClass;

public class DefaultTestClass {

	public DefaultTestClass() {
		// TODO Auto-generated constructor stub
		//DefaultClass defaultC= new DefaultClass();
		//DefaultTestClass와 DefaultClass 다른 패키지...
		//DefaultClass의 클랫 선어부가 default...
		// 다른 패키지에서 클래스 찾지 못함
		
		//DefaultClass defaultC= new DefaultClass();		
		// 클래스 선언부는 public 이지만, 생성자는 default.이기때문에
		//다른 패키지에서 클래스는 로드 되지만 
		//객체 생성은 불가!!
		
		DefaultClass defaultC= new DefaultClass();
		//클래스 선언부, 생성자는 public이지만
		// n 변수는 default
		// 객체는 생성되지만 객체 내부변수 사용 불가!!!
	}

}
