package com.hun; // ���� ��α׿� ������ ����  // file class 7.23

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedStream { // ���� �۾��� ������ �̸� �ְ� ���� ������ ó�� �ӵ��� ������ ������ ���

	/**
	 * Buffered~~~~ : ó�� �ӵ��� ������ �ϱ� ����!!! BufferedReader : FileReader /
	 * BufferedWriter : FileWriter
	 * 
	 * ~~~~Stream : ����Ʈ�ڵ� ������ �����... ����Ʈ�ڵ��(�� ���� ������ ������ ����) �ַ� ���ͳ� ����(������)�� ����
	 * ����¿��� ��� BufferedInputStream / BufferedOutputStream FileInputStream /
	 * FileOutputStream
	 */
	public static void main(String[] args) {
		FileOutputStream fos; // ���� ��������
		BufferedInputStream bis; // byte ������ �о��
		BufferedOutputStream bos; // ������ ��������
		String fname = "src/com/hun/test.buff";
		/**
		 * .bak ��� ���� / .db �����ͺ��̽� ����/ .dat ������ ���� .js �ڹ� ��ũ��Ʈ ���� / .css ��Ÿ�Ͻ�Ʈ .jsp JSP
		 * ���� / *buff , .bff ��������
		 */

		try {
			// ���� ���� ���� �̸����� FileOutputStream ����
			fos = new FileOutputStream(fname);  // 1. FileOutputStream ���� �б� 
			// �Ǵ� fos = new FileOutputStream���� ���. ��, test.buff�� ����

			bos = new BufferedOutputStream(fos); //���� ���� buff�� ������
			byte data[] = { 'A', 'B', 'C', 'D', 'E' };// 5���� ��....
			// data => [65, 66, 67 68 69
			System.out.println(Arrays.toString(data));
			// �� ����Ʈ �� �о� FileOutputStream ���� ���, ��, test.buff�� ����
			bos.write(data, 0, 5);  //bos ������ byte �ۿ� ���޴´�  byte[] /data ���° �ε������� ������ ����� ����, ����
			//byte [], startIndex, length(����)
			bos.close();
			
			bos.close();
			System.out.println(fname + " :  ������ �����Ǿ����ϴ�");
			
			bis = new BufferedInputStream(new FileInputStream(fname));
			
			data = new byte[10];  //5�� (a,b,c,d,e)=> 10��
			bis.read(data, 0, 10); //byte[], startindex, (����)
			bis.close();
			
			// bis���ο� �ִ� �����͸� data �迭�� 0�� �ε��� ���� ä���� �Ѵ� 10����
			
		System.out.println(Arrays.toString(data));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//����Ʈ ������ ����Ǿ��⶧����
	}
}
