package com.freeflux;

import java.io.FileWriter;
import java.io.IOException;

/** �۾��� ���� �޼���� : Ŭ������.�޼���() **/
public class MethodClass {
	
	/** ��ü News ������ ���� ��ü **/
	private static DataClass newsDatas=null;
	
	public MethodClass() { // �⺻ ������
	} // ������ END
	
	/** ��ü News ������ ���� ��ü ���� �޼��� **/
	public static void createNewsObject() {
		newsDatas=new DataClass();
	} // createNewsObject() END

	/** FileWriter Ŭ������ �̿��Ͽ� HTML ������ �����ϴ� �޼��� **/
	public static void createHTML() {
		createNewsObject();
		newsDatas.initInsertNewsData();

		int nRow=10; // ���� ����
		int nCol=8;    // ���� ����
		String  uri="c:/filetest/news.html";	// ���� ��� �� ����.html
		
		FileWriter fw=null;	// ����.html ���ο� HTML �±׸� ���� ���� ��ü ����  
		
		try {
			fw=new FileWriter(uri); 	// ���� ���� ��ü ����
			fw.write("<!doctype html>"); 	// HTML5 ����
			fw.write("<html>"); 		// html ����
			fw.write("<head><title>News Stand</title></head>");
			fw.write("<body>");			// body ����
			fw.write("<table>");
			
			int count=0; // �ε��� ��ȣ�� ��� �� �� ���� ������ ���ο� ������ �������
			for(int nTR=0; nTR<nRow; nTR++) { 	// 10�� �� �ݺ�
				fw.write("<tr>");			// �� ����
				
				for(int nTD=0; nTD<nCol; nTD++) { 	// 8�� �� �ݺ�
					fw.write("<td>");		// �� ����
					fw.write("<a href=http://"+newsDatas.news.get(count).getUrl() +">");
					fw.write("<img src=./newsImages/"+newsDatas.news.get(count).getImg() +" />");
					fw.write("</a>");
					fw.write("</td>");	// �� �ݱ�
					count++;
				} // ���� : for() END => ��
				
				fw.write("</tr>");		// �� �ݱ�
			} // �ٱ��� : for() END => ��
			fw.write("</table>");
			fw.write("</body>");		// body �ݱ�
			fw.write("</html>");		// html  �ݱ�
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // createHTML() END
	
	
} // class END
