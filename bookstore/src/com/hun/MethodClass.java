package com.hun;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;





public class MethodClass {

	public static DateClass book = null;

	public MethodClass() {
		// TODO Auto-generated constructor stub
	}// ������

	public static void CreatedMethod() {
		book= new DateClass();
	}
	public static void ReadbookData(String uri) {
		
		FileReader read=null;
		BufferedReader br=null;
		BookstoreClass store= null;
		
		try {
			read = new FileReader(uri);// ��δ� �����ϴ� �޼ҵ�
			br=new BufferedReader(read);	// 
			store =null; //���� ���� ���� �ϴ�
			
			String S="";
			String [] temp=null;
			
			while ((S=br.readLine()) != null) {
				temp=S.split("_ _");// temp
				store=new BookstoreClass(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
				book.book.add(store);
				
							}			
		}catch (IOException e) {// �б� ������ ���� ó���� ����
				System.out.println(e.getMessage());//Ȯ���� ���� 
	}
	
	}
	public static String createHTML() {//���� �޼��忡���� �����ؾ� �ϱ� ������ STATIC
		CreatedMethod();
		book.initBookstoreClass();

		int n=4; // ���� ����
		int m=6;    // ���� ����
		
		String tags="";
		tags=tags+"<!doctype>";
		tags=tags+"<html>";
		tags=tags+"<head><title>News Stand</title></head>";
		tags=tags+"<body>";

		int count=0;
			for(int nTR=0; nTR<n; nTR++) { 	// 10�� �� �ݺ�
				tags=tags+"<tr>";			// �� ����
				
				for(int nTD=0; nTD<m; nTD++) { 	// 8�� �� �ݺ�
					tags=tags+"<td>";		// �� ����
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
					//				html ���๮/�̹������� ��ġ+���� ������+" />"
					tags=tags+"</a>";
					tags=tags+"</td>";	// �� �ݱ�
					count++;
				} // ���� : for() END => ��
				
				tags=tags+"</tr>";		// �� �ݱ�
			} // �ٱ��� : for() END => ��
			
			tags=tags+"</body>";		// body �ݱ�
			tags=tags+"</html>";		// html  �ݱ�
			return tags;
				}

}

