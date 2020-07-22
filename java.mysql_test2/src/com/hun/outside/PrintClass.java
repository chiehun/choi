package com.hun.outside;

import java.io.FileWriter;
import java.io.IOException;

public class PrintClass {

	public PrintClass() {	
	}
	
	/**태그들을 .html 파일로 저장하는 메서드 선언 **/
	public static void createHTML(String tags) {
		// 1. 생성할 파일의 경로 및 파일 명
		String fileName="c:/filetest/list.html";
		// 2. 파일 쓰기 객체 생성
		try {
			FileWriter fw= new FileWriter(fileName);
			fw.write(tags);
			fw.close();
		} catch (IOException e) {
			System.out.println("Write ERR :"+e.getMessage());	
		}
		
	}//createHTML() END
}//class end
