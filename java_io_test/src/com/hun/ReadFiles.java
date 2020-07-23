package com.hun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {

	public static void main(String[] args) {
	int data;
	//읽을 파일 이름 지정
	String fname = "src/com/hun/Readfies.java";
				//읽을 파일 이름으로 시애ㅐㅓㅇ
			try {
				FileInputStream fis = new FileInputStream(fname);
				
				while ((data =fis.read())!= -1){
					char c = (char) data;
					System.out.println(c);
			} 
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("다음 파일이 없습니다" +fname);
			}//
			// 한바디트 씩 (유니 코드 값) 읽어 문자로 변환하여 출력
			catch (IOException e) {
			System.err.println(e);
			}
	
		
	}
	
	
	}


