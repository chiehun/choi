package hun.com;

public class TestClass {// MainClass동일 위치
	float f = 110.2f;
	int d = 11;
	// 0123456[idx번호]
	String n1 = "770405"; // 주민 앞 번호
	String n2 = "123456"; // 주민 뒷 번호

	int age = 0; // 나이를 계산 =>String.substring(0,2)
					// => Interger.parselent("12")

	public TestClass(String string1, String string2) {
		System.out.println("TestClass 생성자 시작");
		System.out.println("age() 시작(호출) 직전");
		age(string1,string2);
		System.out.println("TestClass 생성자 종료");

	}

	public void age(String s) {// s= String n1
		System.out.println("age() 시작");
		System.out.println("age() 에 값 전달 :" + s);
		String n = s.substring(0, 2);
		System.out.println("연도만 추출 :" + n);
		age = Integer.parseInt(n); // a:77
		System.out.println("문자열을 숫자로 :" + age);
		System.out.println("age() 종료");

	}

	// String s : 주민 앞자리 / String s1 : 주민 뒷자리
	public void age(String s, String s1) {
		String nfront = s.substring(0, 2); // 주민 앞자리 중 맨처음 2자리
		int temp = Integer.parseInt(nfront);

		String nback = s1.substring(0, 1); // 주민 뒷자리 중 맨처음 1자리
		if (nback.equals("1") || nback.equals("2")) {
			age = 2020 - (temp + 1900);
		} else {
			age = 2020 - (temp + 2000);
		}
	}

}
