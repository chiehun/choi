package com.hun;
// 솔루션 만들때 주라 사용되는 코드 잘 정해 주바자
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderWriter {

	public static void main(String[] args) {
		int data;
		String InFname = "src/com/hun/MyFileReaderWriter.java";
		String outFname="src/com/hun/MyFileReaderWriter.back";
		
	
			//읽을 파일 이름으로 FileReader 생성
			FileReader fr;
			try {
				fr = new FileReader(InFname);
				//다시 출력할 파일 이름으로 FileWriter 생성
				FileWriter fw = new FileWriter(outFname);
				
				//한 문자씩 읽어 콘솔과 파일에 출력
				while ((data = fr.read()) != -1) {
					System.out.println((char) data);
					fw.write(data);
				}
				fr.close();
				fw.close();
				System.out.println();
				System.out.println("위 파일이 생성 되었습니다. : " + outFname);;
			} catch (FileNotFoundException e) {
						System.err.println("다음 파일이 없습니다. : "+ InFname);
			}catch(IOException	 e) {
							System.out.println(e.getMessage());
		
			}
		}
	}

