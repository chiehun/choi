package hun.com;

public class TestClass {// MainClass���� ��ġ
	float f = 110.2f;
	int d = 11;
	// 0123456[idx��ȣ]
	String n1 = "770405"; // �ֹ� �� ��ȣ
	String n2 = "123456"; // �ֹ� �� ��ȣ

	int age = 0; // ���̸� ��� =>String.substring(0,2)
					// => Interger.parselent("12")

	public TestClass(String string1, String string2) {
		System.out.println("TestClass ������ ����");
		System.out.println("age() ����(ȣ��) ����");
		age(string1,string2);
		System.out.println("TestClass ������ ����");

	}

	public void age(String s) {// s= String n1
		System.out.println("age() ����");
		System.out.println("age() �� �� ���� :" + s);
		String n = s.substring(0, 2);
		System.out.println("������ ���� :" + n);
		age = Integer.parseInt(n); // a:77
		System.out.println("���ڿ��� ���ڷ� :" + age);
		System.out.println("age() ����");

	}

	// String s : �ֹ� ���ڸ� / String s1 : �ֹ� ���ڸ�
	public void age(String s, String s1) {
		String nfront = s.substring(0, 2); // �ֹ� ���ڸ� �� ��ó�� 2�ڸ�
		int temp = Integer.parseInt(nfront);

		String nback = s1.substring(0, 1); // �ֹ� ���ڸ� �� ��ó�� 1�ڸ�
		if (nback.equals("1") || nback.equals("2")) {
			age = 2020 - (temp + 1900);
		} else {
			age = 2020 - (temp + 2000);
		}
	}

}
