package com.hun;

public class EMPMainClass {

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
		//

		int mcnt = 0;
		for (int idx = 0; idx < gender.length; idx++) {
			if (gender[idx] == 'M') {
				mcnt++;
			}
		}
		System.out.println("���ڻ��" + mcnt);

		int sum = 0;
		for (int idx = 0; idx < gender.length; idx++) {
			if (gender[idx] == 'M') {
				sum = sum + age[idx];
			}
		}
		double avg = (sum * 1.0) / mcnt;
		System.out.println("���� ����� ��� �޿� " + avg);

		int wcnt = 0;
		for (int idx = 0; idx < gender.length; idx++) {
			if (gender[idx] == 'F') {
				wcnt++;
			}
		}
		System.out.println("���ڻ��" + wcnt);

		int sum2 = 0;
		for (int idx = 0; idx < gender.length; idx++) {
			if (gender[idx] == 'F') {
				sum2 = sum2 + age[idx];
			}
		}
		double avg2 = (sum * 1.0) / wcnt;
		System.out.println("���� ����� ��� �޿� " + avg2);
		String stringname = "";
		String stringpone = "";
		String c = "JP";
		for (int idx = 0; idx < code.length; idx++) {
			if (code[idx].equals(c)) {
				stringname = stringname + name[idx] + "";
				stringpone = stringpone + phone[idx] + "";
				
			}
		}
		System.out.println(stringname+stringpone);
	}
}
