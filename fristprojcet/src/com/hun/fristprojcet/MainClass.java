package com.hun.fristprojcet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[30];
		for (int a = 0; a < n.length; a++) {
			n[a] = (a + 1) * 10;
			System.out.println(n[a]);
		}
		int sum = 0;
		for (int idx = 0; idx < n.length; idx++) {
			sum = sum + n[idx];

		}
		System.out.println("�� ���� :" + sum);
		double avg=(sum*1.0)/n.length;
		System.out.println("����� :" +avg);
		String s1="�ѱ�";
		String s2="�ѱ�";
		if(s1.equals(s2)) {
			System.out.println("����");
				}else {
// ���ڿ� �񱳴� ==�� ���ͳݰ� �޾ƿö� �޶����� �ֱ� ������ equals�� ����Ѵ�
					System.out.println("�ٸ���");
				}
	}
}
// �� �հ� : n[0]+...n[29]
// ��� : ����(sum)/����(n.length)
//sum =>������Ÿ��(int)
//n.length = >int
