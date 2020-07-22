package com.freeflux;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodClass {
	public static DataClass dc = null;

	public MethodClass() {
	}

	public static void createBooksObject() {
		dc = new DataClass();// 객체 생성해주는 전용 메서드
	}

	public static void readBooksData(String uri) {// 

		FileReader fr = null;// 파일 읽기
		BufferedReader br = null; // 한줄 씩 읽기
		BookClass o = null;// 생략 가능
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
	// 	int count = 0; 이중 for문이 아니기 때문에 불필요
			String one = "";// 한줄 단위로 저장......
			String[] temp = null; // 한줄을 분리 저장....
			while ((one = br.readLine()) != null) {//readLine// 여기서 출력해서 확인 하는것을 모르겠다
				//
				temp = one.split("__");
				o = new BookClass(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
				 o.testToString();
				dc.books.add(o);
				
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // readBooksData() END

	public static String makeBooksHTML() {
		createBooksObject();
		dc.initInsertBookData();

		int rowCount = dc.books.size();

		String tags = ""; //변수를 누적시켜줄 변수
		tags = tags + "<!doctype>";
		tags = tags + "<html>";
		tags = tags + "<head><title>Book List</title></head>";
		tags = tags + "<body>";
		
		tags = tags + "<table border='1'>";
		tags = tags + "<tr>";
		tags = tags + "<th>책표지</th>";
		tags = tags + "<th>제목</th>";
		tags = tags + "<th>저자</th>";
		tags = tags + "<th>출판사</th>";
		tags = tags + "<th>정가</th>";
		tags = tags + "<th>할인율</th>";
		tags = tags + "</tr>";
		

		for (int n = 0; n < rowCount; n++) { // 10번 행 반복
			tags = tags + "<tr>"; // 행 시작

			tags = tags + "<td>"; // 열 시작
			tags = tags + "<img src='./bookImages/" + dc.books.get(n).getImg() + "' />";
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getTitle();
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getAuthor();
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getPress();
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getPrice()+"원";
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getDiscount()+"%";
			tags = tags + "</td>"; // 열 닫기

			tags = tags + "</tr>"; // 행 닫기
		} // 바깥쪽 : for() END => 행

		tags = tags + "</body>"; // body 닫기
		tags = tags + "</html>"; // html 닫기

		return tags;
	} // makeBooksHTML() END

} // class END
