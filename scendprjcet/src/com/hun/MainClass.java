package com.hun;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
		String[] phone = { "010-8532-0537", "010-9672-5257", "010-9932-4536", "010-4117-0975", "011-8975-7892",
				"010-6251-6976", "010-9482-6059", "010-4845-0105", "010-6283-4849", "010-4510-1609" };

		char[] gender = { 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M' };

		int[] pay = { 460, 200, 250, 300, 300, 200, 350, 200, 400, 440 };

		String[] code = { "JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE", "KR" };
		// ���� ����� ��� ���� ���ϱ�
		// �ʿ� �ڿ� : char[],age[]/���ڻ���� ������ ��/���ڻ����(int mcnt=0
		// ���� ����� ��� �޿� ���ϱ�
		// �Ϻ��� �ٹ��ϴ� ������� �̸��� ����ó�� ����Ͻÿ�
		// ��� ���� :
		// �̸�, ����ó
		
	}// main

	public static int  age(int sumAge){
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		char[] gender = { 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M' };
		int sumAge1= 0;
		int countAge=0;
		char c='M';
		for (int idx = 0; idx < gender.length; idx++) {
			if (gender[idx] == 'c') {
				sumAge1= sumAge1+age[idx];
				countAge++;						
			}
			return(sumAge1/countAge);
		}
		return c;
		}

	public static double avg(int a, int c) {
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		char[] gender = { 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M' };
		int sumAge= 0;
		int countAge=0;
		char c2='F';
		for (int idx = 0; idx < gender.length; idx++) {
			if (gender[idx] == 'F') {
				sumAge= sumAge+age[idx];
				countAge++;					
}
		}
		return c2;
		
	}
	
}// class
