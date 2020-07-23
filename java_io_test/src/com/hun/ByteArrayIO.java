package com.hun;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ByteArrayIO {

	public static void main(String[] args) throws IOException {
		int c;
		byte b [] = {'a', 'b', 'c', 'd'};
		
		//�迭b �� �д� ByteArrayInputStream ��ü�� ����
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);// byte �� �����ڵ�
		ByteArrayOutputStream  bOutput = new ByteArrayOutputStream ();
		System.out.println("���ڸ� �о� �빮�ڷ� ���");
		while ((c = bInput.read()) != -1) {
			System.out.println((char)c);
			
			//��ü ByteArrayOutputStream�� �빮�ڸ� ���
			bOutput.write(Character.toUpperCase(((char)c)));
				}
		System.out.println();
		//��ü ByteArrayOutputStream�� ����ϸ� ��µ� �ڷᰡ �״�� ���
		System.out.println(bOutput);
		
		// �迭 Arrays �޼ҵ� toString() ����Ͽ� ���� �Է� ���� ��� ���� ���
		System.out.println(Arrays.toString(b)); /// �迭 ���� ��� Ȯ���� ������ �ִ� �Լ� 
		System.out.println(Arrays.toString(bOutput.toByteArray()));
	}//main() END

}
