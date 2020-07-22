package com.hun;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;





public class MethodClass {

	public static DateClass book = null;

	public MethodClass() {
		// TODO Auto-generated constructor stub
	}// 생성자

	public static void CreatedMethod() {
		book= new DateClass();
	}
	public static void ReadbookData(String uri) {
		
		FileReader read=null;
		BufferedReader br=null;
		BookstoreClass store= null;
		
		try {
			read = new FileReader(uri);// 경로는 저장하는 메소드
			br=new BufferedReader(read);	// 
			store =null; //변수 값을 저장 하는
			
			String S="";
			String [] temp=null;
			
			while ((S=br.readLine()) != null) {
				temp=S.split("_ _");// temp
				store=new BookstoreClass(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
				book.book.add(store);
				
							}			
		}catch (IOException e) {// 읽기 때문에 예외 처리가 생김
				System.out.println(e.getMessage());//확인해 보기 
	}
	
	}
	public static String createHTML() {//메인 메서드에서도 실행해야 하기 때문에 STATIC
		CreatedMethod();
		book.initBookstoreClass();

		int n=4; // 행의 갯수
		int m=6;    // 열의 갯수
		
		String tags="";
		tags=tags+"<!doctype>";
		tags=tags+"<html>";
		tags=tags+"<head><title>News Stand</title></head>";
		tags=tags+"<body>";

		int count=0;
			for(int nTR=0; nTR<n; nTR++) { 	// 10번 행 반복
				tags=tags+"<tr>";			// 행 시작
				
				for(int nTD=0; nTD<m; nTD++) { 	// 8번 열 반복
					tags=tags+"<td>";		// 열 시작
					tags=tags+"<img src=' ./bookImages/"+book.book.get(count).getCodenumber()+"  ' />";
					tags=tags+"</a>";
					tags=tags+"</td>";
					tags=tags+book.book.get(count).getLmg();
					tags=tags+"</a>";
					tags=tags+"</td>";
					tags=tags+book.book.get(count).getBookname();
					tags=tags+"</a>";
					tags=tags+"</td>";
					tags=tags+book.book.get(count).getCompany();
					tags=tags+"</a>";
					tags=tags+"</td>";
					tags=tags+book.book.get(count).getPay();
					tags=tags+"</a>";
					tags=tags+"</td>";
					tags=tags+book.book.get(count).getDiscount();
					//				html 실행문/이미지파일 위치+실제 데이터+" />"
					tags=tags+"</a>";
					tags=tags+"</td>";	// 열 닫기
					count++;
				} // 안쪽 : for() END => 열
				
				tags=tags+"</tr>";		// 행 닫기
			} // 바깥쪽 : for() END => 행
			
			tags=tags+"</body>";		// body 닫기
			tags=tags+"</html>";		// html  닫기
			return tags;
				}

}

