package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
			int pageNo=MethodClass.fromConsole(); //?? �� int �ϱ�??
			String htmltags = MethodClass.createTags();
			System.out.println(htmltags);			
			PrintClass.makeHTML(htmltags, pageNo);
			
	}

}





