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
		System.out.println("총 합은 :" + sum);
		double avg=(sum*1.0)/n.length;
		System.out.println("평균은 :" +avg);
		String s1="한글";
		String s2="한글";
		if(s1.equals(s2)) {
			System.out.println("같다");
				}else {
// 문자열 비교는 ==는 인터넷과 받아올때 달라질수 있기 때문에 equals로 사용한다
					System.out.println("다른다");
				}
	}
}
// 총 합계 : n[0]+...n[29]
// 평균 : 총합(sum)/갯수(n.length)
//sum =>데이터타입(int)
//n.length = >int
