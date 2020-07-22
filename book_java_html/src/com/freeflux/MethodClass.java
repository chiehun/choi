package com.freeflux;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodClass {
	public static DataClass dc = null;

	public MethodClass() {
	}

	public static void createBooksObject() {
		dc = new DataClass();// ��ü �������ִ� ���� �޼���
	}

	public static void readBooksData(String uri) {// 

		FileReader fr = null;// ���� �б�
		BufferedReader br = null; // ���� �� �б�
		BookClass o = null;// ���� ����
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
	// 	int count = 0; ���� for���� �ƴϱ� ������ ���ʿ�
			String one = "";// ���� ������ ����......
			String[] temp = null; // ������ �и� ����....
			while ((one = br.readLine()) != null) {//readLine// ���⼭ ����ؼ� Ȯ�� �ϴ°��� �𸣰ڴ�
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

		String tags = ""; //������ ���������� ����
		tags = tags + "<!doctype>";
		tags = tags + "<html>";
		tags = tags + "<head><title>Book List</title></head>";
		tags = tags + "<body>";
		
		tags = tags + "<table border='1'>";
		tags = tags + "<tr>";
		tags = tags + "<th>åǥ��</th>";
		tags = tags + "<th>����</th>";
		tags = tags + "<th>����</th>";
		tags = tags + "<th>���ǻ�</th>";
		tags = tags + "<th>����</th>";
		tags = tags + "<th>������</th>";
		tags = tags + "</tr>";
		

		for (int n = 0; n < rowCount; n++) { // 10�� �� �ݺ�
			tags = tags + "<tr>"; // �� ����

			tags = tags + "<td>"; // �� ����
			tags = tags + "<img src='./bookImages/" + dc.books.get(n).getImg() + "' />";
			tags = tags + "</td>"; // �� �ݱ�
			
			tags = tags + "<td>"; // �� ����
			tags = tags + dc.books.get(n).getTitle();
			tags = tags + "</td>"; // �� �ݱ�
			
			tags = tags + "<td>"; // �� ����
			tags = tags + dc.books.get(n).getAuthor();
			tags = tags + "</td>"; // �� �ݱ�
			
			tags = tags + "<td>"; // �� ����
			tags = tags + dc.books.get(n).getPress();
			tags = tags + "</td>"; // �� �ݱ�
			
			tags = tags + "<td>"; // �� ����
			tags = tags + dc.books.get(n).getPrice()+"��";
			tags = tags + "</td>"; // �� �ݱ�
			
			tags = tags + "<td>"; // �� ����
			tags = tags + dc.books.get(n).getDiscount()+"%";
			tags = tags + "</td>"; // �� �ݱ�

			tags = tags + "</tr>"; // �� �ݱ�
		} // �ٱ��� : for() END => ��

		tags = tags + "</body>"; // body �ݱ�
		tags = tags + "</html>"; // html �ݱ�

		return tags;
	} // makeBooksHTML() END

} // class END
