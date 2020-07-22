package com.hun;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodClass {
	public static DateClass dc = null;

	public MethodClass() {
	}// 생성자

	public static void CreatBook() {// 데이터 클래스 선언 정보를 불러오기 위해서
		dc = new DateClass();
	}
	// 파일 읽어오기 (fileread , bufferedreader 사용해서 try catch

public static void readbook(String uri) {
		
		FileReader fr=null;
		BufferedReader df=null;
		BookstoreClass  o=null;	
	try {		
		fr = new FileReader(uri);// Date Class 에서 uri 이가 입력된다
		df= new BufferedReader(fr);
		String one ="";
		String [] temp=null;
		
		while ((one=df.readLine())!=null) {// 중간에 테스트 할 방법은 없을까?			
			temp=one.split("__");
			System.out.println(temp[0]);// 왜 안될까? - Date 클래스 static 선언 되지 않았다
			o= new BookstoreClass (temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
			o.test();
			
			}
		}catch(IOException e){
			System.out.println(e.getMessage());//  무슨 뜻일가?!
		}
	}
}

