package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		String tags=MethodClass.createHTML();//문자열을 반환 시켜준다.
		System.out.println(tags);
		PrintClass.makeHTML(tags);// 확인 시켜주는 
	}

}

