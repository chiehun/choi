package com.freeflux;

import java.io.FileWriter;
import java.io.IOException;

/** 작업을 위한 메서드들 : 클래스명.메서드() **/
public class MethodClass {
	
	/** 전체 News 데이터 보유 객체 **/
	private static DataClass newsDatas=null;
	
	public MethodClass() { // 기본 생성자
	} // 생성자 END
	
	/** 전체 News 데이터 보유 객체 생성 메서드 **/
	public static void createNewsObject() {
		newsDatas=new DataClass();
	} // createNewsObject() END

	/** FileWriter 클래스를 이용하여 HTML 파일을 생성하는 메서드 **/
	public static void createHTML() {
		createNewsObject();
		newsDatas.initInsertNewsData();

		int nRow=10; // 행의 갯수
		int nCol=8;    // 열의 갯수
		String  uri="c:/filetest/news.html";	// 저장 경로 및 파일.html
		
		FileWriter fw=null;	// 파일.html 내부에 HTML 태그를 쓰기 위한 객체 저장  
		
		try {
			fw=new FileWriter(uri); 	// 파일 쓰기 객체 생성
			fw.write("<!doctype html>"); 	// HTML5 선언
			fw.write("<html>"); 		// html 시작
			fw.write("<head><title>News Stand</title></head>");
			fw.write("<body>");			// body 시작
			fw.write("<table>");
			
			int count=0; // 인덱스 번호를 사용 할 수 없지 때문에 새로운 변수를 사용했음
			for(int nTR=0; nTR<nRow; nTR++) { 	// 10번 행 반복
				fw.write("<tr>");			// 행 시작
				
				for(int nTD=0; nTD<nCol; nTD++) { 	// 8번 열 반복
					fw.write("<td>");		// 열 시작
					fw.write("<a href=http://"+newsDatas.news.get(count).getUrl() +">");
					fw.write("<img src=./newsImages/"+newsDatas.news.get(count).getImg() +" />");
					fw.write("</a>");
					fw.write("</td>");	// 열 닫기
					count++;
				} // 안쪽 : for() END => 열
				
				fw.write("</tr>");		// 행 닫기
			} // 바깥쪽 : for() END => 행
			fw.write("</table>");
			fw.write("</body>");		// body 닫기
			fw.write("</html>");		// html  닫기
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // createHTML() END
	
	
} // class END
