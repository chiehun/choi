package com.hun; // 오늘 블로그에 정리해 놓기  // file class 7.23

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedStream { // 내가 작업할 내용을 미리 넣고 쓰기 때문에 처리 속도가 빠르기 때문에 사용

	/**
	 * Buffered~~~~ : 처리 속도를 빠르게 하기 위함!!! BufferedReader : FileReader /
	 * BufferedWriter : FileWriter
	 * 
	 * ~~~~Stream : 바이트코드 단위로 입출력... 바이트코드란(두 개의 정수로 구성된 문자) 주로 인터넷 라인(유무선)을 통한
	 * 입출력에서 사용 BufferedInputStream / BufferedOutputStream FileInputStream /
	 * FileOutputStream
	 */
	public static void main(String[] args) {
		FileOutputStream fos; // 파일 내보내기
		BufferedInputStream bis; // byte 파일을 읽어낸다
		BufferedOutputStream bos; // 파일을 내보낸다
		String fname = "src/com/hun/test.buff";
		/**
		 * .bak 백업 파일 / .db 데이터베이스 파일/ .dat 데이터 파일 .js 자바 스크립트 파일 / .css 스타일시트 .jsp JSP
		 * 파일 / *buff , .bff 버퍼파일
		 */

		try {
			// 새로 만들 파일 이름으로 FileOutputStream 생성
			fos = new FileOutputStream(fname);  // 1. FileOutputStream 파일 읽기 
			// 또는 fos = new FileOutputStream으로 출력. 즉, test.buff에 쓰기

			bos = new BufferedOutputStream(fos); //읽은 파일 buff에 보내기
			byte data[] = { 'A', 'B', 'C', 'D', 'E' };// 5개의 방....
			// data => [65, 66, 67 68 69
			System.out.println(Arrays.toString(data));
			// 한 바이트 씩 읽어 FileOutputStream 으로 출력, 즉, test.buff에 쓰기
			bos.write(data, 0, 5);  //bos 무조건 byte 밖에 못받는다  byte[] /data 몇번째 인덱스부터 꺼내서 사용할 건지, 갯수
			//byte [], startIndex, length(갯수)
			bos.close();
			
			bos.close();
			System.out.println(fname + " :  파일이 생성되었습니다");
			
			bis = new BufferedInputStream(new FileInputStream(fname));
			
			data = new byte[10];  //5개 (a,b,c,d,e)=> 10개
			bis.read(data, 0, 10); //byte[], startindex, (갯수)
			bis.close();
			
			// bis내부에 있는 데이터를 data 배열의 0번 인덱스 부터 채워야 한다 10개를
			
		System.out.println(Arrays.toString(data));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//바이트 값으로 저장되었기때문에
	}
}
