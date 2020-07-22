package hun.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadClass {

	public FileReadClass() {
		
	}//생성자
	public void readFiles() {
		//Fill-> 파일 또는 폴더(디렉토리) 검색
		File f= new File("C:/hun/exetended_test/src/hun/com/FileReadClass");
		System.out.println(f.length());// 파일 크크
		System.out.println(f.isFile());
		System.out.println(f.canRead());
		System.out.println(f.lastModified()); //마비작 수정일 :10진수
		f.list();// c폴더 안에 있는 파일명을 문자배열로 변환해 주는
		// 197-.1.11 0.0.0 현재까지 의 시간
		String [] files=f.list();
		//for(String name : files) {
		//	System.out.println(name);
		}
		
//	}
	/** c://filetest의 memo.txt 파일을 읽는 메서드 
	 * **/
	public void readFile()  {
		// 1. 파일 경로 명 설정
		String uri ="C:/hun/exetended_test/src/hun/com/FileRead";//c:\ => c;/
		//2. 경로명을 이용하여 해당 파일 읽기
		// FileReader f =new FileReader("경로명");// 경로명은 무조건 문자열
		FileReader fr= null;// import 안했을때 오류
		
		//3. 파일 내용을 줄 단위로 읽어들일 수 있는 클래스(객체) :
		// BuffereadReader.class(java.io 패키지)
		//BuffereadReader br= new BuffereadReader(FileReader 객체 :)
		//BuffereadReader의 readLine()를 이용...
		BufferedReader br=null;
		
		try {
			fr=new FileReader(uri);
			System.out.println("읽기 성공");
			
			br = new BufferedReader(fr);
			//String line = br.readLine();
			//System.out.println(line);
			String sline =null;
			while ((sline=br.readLine())!=null) {
				System.out.println(sline);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 오류 예외 처리 안햇을대
	}

}
