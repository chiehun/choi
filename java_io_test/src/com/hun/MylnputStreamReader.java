package com.hun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MylnputStreamReader {

	public static void main(String[] args) {
		String fname = "src/com/hun/MyInputStreamReader.java";
		String line = null;
		try {
			// ���� ���� �̸����� FileInputStream ����
			FileInputStream fis = new FileInputStream(fname);  //file, buffer������ encoding�ϴ� �޼ҵ尡 ����

			// ���� �Է½�Ʈ���� �ٽ� InputStreamReader�� ����
			InputStreamReader isr = new InputStreamReader(fis);

			// InputStreamReader�� �ٽ� BufferedReader�� ����
			BufferedReader br = new BufferedReader(isr);

			// ���� InputStreamReader�� ���ڵ� ��� ���
			System.out.println(isr.getEncoding());
			System.out.println();
			// �� �� �� �о� ���
			while ((line = br.readLine())!= null) {
				System.out.println(line);

			}
			br.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("���� ������ �����ϴ�. : " + fname);

		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println();
	}

}
