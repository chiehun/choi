package com.freeflux;

import java.io.FileWriter;
import java.io.IOException;

public class PrintClass {

	/** 기본 생성자 **/
	public PrintClass() {
	}

	/** 
	 * 외부(MainClass의 main()로부터 
	 * 전달된 문자열을 이용하여
	 *  html 파일을 생성하는 메서드
	 **/
	public static void makeHTML(String tags, int pageNo) {
		String uri ="c:/filetest/";
		String filename="bank";
		String extension=".html";
		
		uri=uri+filename+pageNo+extension;
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(uri);
			fw.write(tags);
			fw.close();
			System.out.println("html 파일 생성 및 저장");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // makeHTML() END
	}

