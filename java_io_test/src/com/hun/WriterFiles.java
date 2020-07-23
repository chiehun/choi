package com.hun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterFiles {

	public static void main(String[] args) {
		int data;
		FileInputStream fis;
		FileOutputStream fos;
		String inFname = "src/com/hun/WriterFile.java";
		String outFname ="src/com/hun/WriterFile.back";
				
				try {
					//읽을 파일 이름으로 뢰ㅑ
					fis = new FileInputStream(inFname);
					
					
					// 새로 만들 파일 이름으로 fileOutputStream 생성
					fos = new FileOutputStream(outFname);
										
					// 한 바이트 씩 읽어 FileOutputSTAM
						while ((data= fis.read()) != -1) {
						fos.write(data);
						}
						System.out.println(outFname +": 파일이 생성되었습니다" );
				}catch (IOException e) {
							// TODO Auto-generated catch block
					System.err.println(e);
							
	
			}
	}
}


