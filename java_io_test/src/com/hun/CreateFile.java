package com.hun;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// ���� ���� �̸� ����
		String fname = "src/com/hun/newfile.txt";
		// file ��ü ����
		File f = new File(fname);

		// ���� newfile.txt ���� ���� ���� Ȯ��
		if (!f.exists()) {/// ���� �������� �ʴ´ٸ�
			// ó�� �����ϸ� ������ �����Ƿ� �����
			System.out.println("���� ������ ã�� �� �����ϴ�. : " + fname);
			//������ ������ ����� ���ڿ��� ����
			try {
				f.createNewFile();
				if(f.exists()) {// File ��ü.exists() sms ����(ture)
					System.out.println("���� ������ �ֽ��ϴ� : "+fname);
				} //byte �ڵ�� ������ �ȴ�.
				
				FileWriter fr = new FileWriter(f);
				fr.write("���� ������ ���ϴ�.");
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	 }//main () end

} //class end
