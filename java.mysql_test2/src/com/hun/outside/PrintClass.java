package com.hun.outside;

import java.io.FileWriter;
import java.io.IOException;

public class PrintClass {

	public PrintClass() {	
	}
	
	/**�±׵��� .html ���Ϸ� �����ϴ� �޼��� ���� **/
	public static void createHTML(String tags) {
		// 1. ������ ������ ��� �� ���� ��
		String fileName="c:/filetest/list.html";
		// 2. ���� ���� ��ü ����
		try {
			FileWriter fw= new FileWriter(fileName);
			fw.write(tags);
			fw.close();
		} catch (IOException e) {
			System.out.println("Write ERR :"+e.getMessage());	
		}
		
	}//createHTML() END
}//class end
