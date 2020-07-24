package com.hun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MylnputStreamReader {

	public static void main(String[] args) {
		String fname = "src/com/hun/MyInputStreamReader.java";
		String line = null;
		try {
			// 읽을 파일 이름으로 FileInputStream 생성
			FileInputStream fis = new FileInputStream(fname);  //file, buffer에서는 encoding하는 메소드가 없다

			// 파일 입력스트림을 다시 InputStreamReader로 연결
			InputStreamReader isr = new InputStreamReader(fis);

			// InputStreamReader를 다시 BufferedReader로 연결
			BufferedReader br = new BufferedReader(isr);

			// 현재 InputStreamReader의 인코딩 방식 출력
			System.out.println(isr.getEncoding());
			System.out.println();
			// 한 줄 씩 읽어 출력
			while ((line = br.readLine())!= null) {
				System.out.println(line);

			}
			br.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다. : " + fname);

		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println();
	}

}
