package com.hun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {

	public static void main(String[] args) {
	int data;
	//���� ���� �̸� ����
	String fname = "src/com/hun/Readfies.java";
				//���� ���� �̸����� �þ֤��ä�
			try {
				FileInputStream fis = new FileInputStream(fname);
				
				while ((data =fis.read())!= -1){
					char c = (char) data;
					System.out.println(c);
			} 
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("���� ������ �����ϴ�" +fname);
			}//
			// �ѹٵ�Ʈ �� (���� �ڵ� ��) �о� ���ڷ� ��ȯ�Ͽ� ���
			catch (IOException e) {
			System.err.println(e);
			}
	
		
	}
	
	
	}


