package com.freeflux;

import java.io.BufferedReader;
import java.io.FileReader;
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
	
	
	/** FileReader�� BufferedReader�� �̿��Ͽ� txt ������ �о���̴� �޼��� **/
	public static void readNewsData(String uri) {
		// ("����Ź�", "nsd16500796.gif", "newsstand.naver.com/032",  "������"));
		FileReader fr=null;// �о��ִ� FileReader
		BufferedReader br=null; //  ���� �� �б� ���ؼ� FileReader�� ���� ��
		NewsClass o=null; /** ���߿� ������ �����ϱ� ���ؼ�**/
		try {
			fr=new FileReader(uri);
			br=new BufferedReader(fr);//BufferedReader �տ� FileReader �� �־�� �Ѵ�,
			
			o=null;// newClass ��ü ����
			String one="";// realine ����// ���� �� ���� �����͸� �����ϱ� ���� ����
			String[] temp=null;// ���ڿ��� �ɰ��� ���� �� ����
			while((one=br.readLine()) != null) {// ù��°�� �б�//
				temp=one.split("\", \"");
				o=new NewsClass(temp[1], temp[2]);//������ �ֱ�//temp[1] �̹��� temp[2] �ּ�
				DataClass.news.add(o);
			}
		} catch (IOException e) {// �б� ������ ���� ó���� ����
			System.out.println(e.getMessage());//
		}
	}
	

	/** String�� �̿��Ͽ� HTML �±׵��� �����ϴ� �޼��� **/
	public static String createHTML() {//���� �޼��忡���� �����ؾ� �ϱ� ������ STATIC
		createNewsObject();
		newsDatas.initInsertNewsData();

		int nRow=10; // ���� ����
		int nCol=8;    // ���� ����
		
		String tags="";
		tags=tags+"<!doctype>";
		tags=tags+"<html>";
		tags=tags+"<head><title>News Stand</title></head>";
		tags=tags+"<body>";

		int count=0;
			for(int nTR=0; nTR<nRow; nTR++) { 	// 10�� �� �ݺ�
				tags=tags+"<tr>";			// �� ����
				
				for(int nTD=0; nTD<nCol; nTD++) { 	// 8�� �� �ݺ�
					tags=tags+"<td>";		// �� ����
					tags=tags+"<a href='http:// "+newsDatas.news.get(count).getUrl() +" '>";
					tags=tags+"<img src=' ./newsImages/"+newsDatas.news.get(count).getImg() +"  ' />";
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
	} // createHTML() END
	
	
} // class END
