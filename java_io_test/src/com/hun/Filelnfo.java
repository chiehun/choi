package com.hun;

import java.io.File;
import java.sql.Date;

public class Filelnfo {
// ���� ���õ� �� ������ �ϱ�
	public static void main(String[] args) {
		String fname = "src/com/hun/FileInfo.java";
		// ��ü ����
		File f = new File(fname);
		System.out.println("����" + f.getName() + "����"); //���� ����
		System.out.println();
		System.out.println("\t�н� : " + f.getPath());// ��� ���
		System.out.println("\t�����н� : "+f.getAbsolutePath()); //���� ���(����̺� //���ʿ��� ���� ���)
		System.out.println("\t�θ�: " + f.getParent()); // �θ� �ּ� 
		System.out.println("\t���� ���� : "+ f.canWrite()); // ���� ���� ������ ���� ���� ture/false
		System.out.println("\t�б� ���� : "+f.canRead()); //���� �б� ������ ���� ���� ture/false
		System.out.println("\t���� ���� : " + f.isFile()); //������ ������ �����̸� ture/false
		System.out.println("\t���� ���� : "+ f.isDirectory());
		System.out.println("\t������ : " + new Date(f.lastModified())); // ���� ������ ��¥ // ������ ��ü�� ���� ��¥
		System.out.println("\t����ũ�� : " +f.length()); // ������ ũ��  
		
		// new Date ������ ��¥�� �ٲ��ִ� �Լ�
		

	}

}
