package com.hun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterFiles {

	public static void main(String[] args) {
		int data;
		FileInputStream fis;
		FileOutputStream fos;
		String inFname = "src/com/hun/WriterFile.java";
		String outFname ="src/com/hun/WriterFile.back";
				
				try {
					//���� ���� �̸����� �ڤ�
					fis = new FileInputStream(inFname);
					
					
					// ���� ���� ���� �̸����� fileOutputStream ����
					fos = new FileOutputStream(outFname);
										
					// �� ����Ʈ �� �о� FileOutputSTAM
						while ((data= fis.read()) != -1) {
						fos.write(data);
						}
						System.out.println(outFname +": ������ �����Ǿ����ϴ�" );
				}catch (IOException e) {
							// TODO Auto-generated catch block
					System.err.println(e);
							
	
			}
	}
}


