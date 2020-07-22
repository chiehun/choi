package com.freeflux;

import java.util.Scanner;

import com.freeflux.xls.ExcelReader;

public class MethodClass {

	private static int list = 10;
	private static int pageNo = 1;
	private static int startlndex = 0;

	private static String uri = "c:/filetest/";
	private static String extensoin = ".xls";

	public MethodClass() {
	}

	public static int fromConsole() {// seach

		Scanner scan = new Scanner(System.in);

		System.out.println("일어들일 엑셀파일 입력(예 bank_data");

		String filenamae = scan.next();

		System.out.println("읽어들일 페이지 번호 입력");

		int pageNo = scan.nextInt();

		uri = uri + filenamae + extensoin;
		System.out.println(uri);

		pageNo = pageNo - 1;// RETURN +1
		startlndex = pageNo * list + 1;

		ExcelReader.readExcelFile(uri, startlndex, list);
		return pageNo + 1;

	}

	public static String createTags() {
		String tags = "";

		tags = tags + "<!doctype html>";
		tags = tags + "<html>";
		tags = tags + "<head><title>Bank Data List</title></head>";
		tags = tags + "<body>";

		tags = tags + "<table border='1'>";
		tags = tags + "<tr>";

		String[] headers = { "번호", "나이", "직업", "결혼여부", "학력", "집소유", "대출", "연락방법", "가입월", "가입요일", "기간" };
		// 상단 제목 코드 출력할때
		for (String head : headers) {
			tags = tags + "<th>" + head + "</th>";
		}
		tags = tags + "</tr>";
		// ----------------------------------------------
		for (ObjectClass o : DataClass.banks) {
			tags = tags + "<tr>";

			tags = tags + "<td>";
			tags = tags + o.getAge();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getContact();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getDay_of_week();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getDuration();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getEducation();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getHousing();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getJob();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getLoan();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getMarital();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getMonth();
			tags = tags + "</td>";

			tags = tags + "<td>";
			tags = tags + o.getNo();
			tags = tags + "</td>";

			tags = tags + "</tr>";

		}

		tags = tags + "</table>"; // table 닫기
		tags = tags + "</body>"; // body 닫기
		tags = tags + "</html>"; // html 닫기
		return tags;
		}
	
}
