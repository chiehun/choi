package hun.com;

import hun.com.Date.DateClass;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("main() ����");

		DateClass dc=new DateClass();
		TestClass tc=new TestClass("771201", "123456");
		//Object o=new Object();// ��� Ŭ������ ����
		System.out.println(tc.age);
		System.out.println("main() ����");
	}

}
