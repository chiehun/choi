package com.hun;

public class EMPMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		int[] pay = { 460, 200, 250, 300, 300, 200, 350, 200, 400, 440 };
		String[] code = { "JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE", "KR" };
		// ������ �ٹ��ϴ� �ο���
		// code �迭/�ο���(int count=0)
		// �ο� �� : code�迭�� ���� �� "KR"�� ���� ���� ��
		// �� : if(){}
		// if(code[0].equals("KR")){count++}
		int count = 0;
		for (int idx = 0; idx < code.length; idx++) {
			// count++; //count=count+1
			if (code[idx].equals("KR")) {
				count++;
			}
		}
		System.out.println("���� �ٹ��ڼ� : " + count);
		// ���� �ٹ����� �޿���
		// �ʿ� �ڿ� : code �迭/ pay �迭
		// �ʿ� ���� : for(){}/if(){}
		// �ʿ� ���� : int sum=0;
		// �� ���ϱ� : sum=sum+pay[idx]
		int sum = 0;
		String c = "KR";
		for (int idx = 0; idx < code.length; idx++) {
			if (code[idx].equals(c)) {
				sum = sum + pay[idx];
			}
			System.out.println("���� �ٹ��� �޿� �� :" + sum);
			double avg = (sum * 1.0) / count;
			System.out.println("���� �ٹ����� ��ձ޿� : " + avg);

			String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
			// ���� �ٹ����� ������ ����Ͻÿ�
			// �ش� ������ �̿��Ͽ� �ٸ� ���� �߰��� �� ��
			// ��� ���� : LSD, LKO
			// �ʿ� �ڿ� : name �迭/ code �迭
			// ���� : for(){}/if(){}

			// �ʿ� ���� String sumName="";
			// �� ���ϱ� : sumName=sumName+name[idx] + ",";
			String c2 = "KR";
			for (int f = 0; f < code.length; f++) {
				if (code[f].equals(c2)) {
					System.out.print(name[f] + ",");
				}
			}
		}
		String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
		String c3 = "KR";
		String sumName = "";
		for (int i = 0; i < code.length; i++) {
			if (code[i].equals(c3)) {
				sumName = sumName + name[i] + ",";

			}

		}
		System.out.println("���� �ٹ��� ���� :" + sumName);
		String[] names = sumName.split(",");
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		String content = ""
				+ "��Ⳳ�ΰ���û ���纻�δ� 2�� ����ȸ���� ���� ������ ��� ���� �������� ��ǥ�ߴ�. �� �ڸ����� ������ �����簡 14���� ���ΰ� 9���� ���� ����� ������ ������ Ȯ���ߴٸ鼭 �����簡 (����) �屸�� Ǯ�� ���� ������ ������ ���� ������ �� ������ Ȯ���ߴٰ� ������."
				+ "" + "" + "" + ""
				+ "������ ȭ�� ������λ�� �� �����簡 ���� ���� �� ���˴� 2006�� 4�� 2���� �������� ���ҽ�ȿ�� ��� ����ƴ�. �� ������ �����翡 ���� ����ó���� �Ұ����ϴ�. " + ""
				+ "" + "" + ""
				+ "������ �������Ϸ� ��� ���� ���� ������ �ɸ��� �м��� ��� �����簡 �������� ���İ� ���뿡 ���� �������� ���ϰ� �ִٸ� �ڽ��� ����� ���簨�� �����ϰ� Ÿ���� ������ �������� �ϴ� �� �������н� ������ ��Ÿ���ٰ� �ߴ�. "
				+ "" + "" + "" + ""
				+ "�̹� ������ ��ǥ�� ������ ������ ������� ���Ź��� ���� DNA ������ �Ƿ���, �����縦 �������� Ư������ 1�� ���� ���Դ�. ������� �ٸ� ���� ��ǿ� ����� ����¡���� �����ް� �λ걳���ҿ� �������̾���. ���� �����簡 ȭ�� ������λ�� 10��(1986~1991�� �߻�)�� ����, ������ ������ ���� 14���� ���λ���� �߰��� �ڹ��ߴ�. "
				+ "" + "" + "" + ""
				+ "���� ��� ���� ��� ������ �νǼ���� ���м��絵 Ȯ�εƴ�. �̳� ������ 32���� ����������� ȭ�� 8�� ����� �������� ���𾾸� ����, ���ӿ��� �ߺ� ���� 3�ϰ� �δ��ϰ� ������ ����� �����ߴ�. �� ����� ��⵵ ȭ���� �¾��� ���ȸ����� 13�� �ڸ���� �ڽ��� ������ �������� ���� �� ���� ���� ���ص� ����̴�. ���𾾴� ���� ������ ���� ����¡���� �����ް�, �����ƴٰ� 20�Ⱓ ����� �����̸� �� �� 2009�� ������ƴ�. "
				+ "" + "" + "" + "" + "������ ��, ���� �������� ���� ������ ���� �����ڹ�� ���� ������ �ۼ��� ������ ��� � Ȯ���ߴٰ� ������. " + "" + "" + ""
				+ ""
				+ "����� ��Ⳳ�ΰ���û���� �������� ���� 20�Ⱓ ����� �����̸� �� ���𾾿� ����, ��� ������ ������ ����� ���� ���ظ� ���� ��� �е鲲�� �Ӹ����� ���˵帰�ٰ� ������."
				+  "";
		System.out.println(content);
		String[] words = content.split(" ");
		System.out.println(words.length);
		int cnt=0;
				for(int idx=0; idx < words.length; idx++) {
					if(words[idx].contains("������")) {
						cnt++;
					}
				}
				System.out.println("����Ƚ�� : "+cnt);
	}//main() END
}//class END

// ���� �ٹ����� ��� �޿�
// �ʿ� �ڿ� : code �迭/ pay �迭
// �ʿ� ���� :