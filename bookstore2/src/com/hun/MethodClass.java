package com.hun;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodClass {
	public static DateClass dc = null;

	public MethodClass() {
	}// ������

	public static void CreatBook() {// ������ Ŭ���� ���� ������ �ҷ����� ���ؼ�
		dc = new DateClass();
	}
	// ���� �о���� (fileread , bufferedreader ����ؼ� try catch

public static void readbook(String uri) {
		
		FileReader fr=null;
		BufferedReader df=null;
		BookstoreClass  o=null;	
	try {		
		fr = new FileReader(uri);// Date Class ���� uri �̰� �Էµȴ�
		df= new BufferedReader(fr);
		String one ="";
		String [] temp=null;
		
		while ((one=df.readLine())!=null) {// �߰��� �׽�Ʈ �� ����� ������?			
			temp=one.split("__");
			System.out.println(temp[0]);// �� �ȵɱ�? - Date Ŭ���� static ���� ���� �ʾҴ�
			o= new BookstoreClass (temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
			o.test();
			
			}
		}catch(IOException e){
			System.out.println(e.getMessage());//  ���� ���ϰ�?!
		}
	}
}

