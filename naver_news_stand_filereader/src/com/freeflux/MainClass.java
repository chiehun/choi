package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		String tags=MethodClass.createHTML();//���ڿ��� ��ȯ �����ش�.
		System.out.println(tags);
		PrintClass.makeHTML(tags);// Ȯ�� �����ִ� 
	}

}

