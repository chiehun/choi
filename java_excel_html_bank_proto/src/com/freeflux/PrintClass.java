package com.freeflux;

import java.io.FileWriter;
import java.io.IOException;

public class PrintClass {

	/** �⺻ ������ **/
	public PrintClass() {
	}

	/** 
	 * �ܺ�(MainClass�� main()�κ��� 
	 * ���޵� ���ڿ��� �̿��Ͽ�
	 *  html ������ �����ϴ� �޼���
	 **/
	public static void makeHTML(String tags, int pageNo) {
		String uri ="c:/filetest/";
		String filename="bank";
		String extension=".html";
		
		uri=uri+filename+pageNo+extension;
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(uri);
			fw.write(tags);
			fw.close();
			System.out.println("html ���� ���� �� ����");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // makeHTML() END
	}
