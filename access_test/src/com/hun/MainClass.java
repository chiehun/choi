package com.hun;

import java.util.ArrayList;

import com.hun.other.PublicClass;

public class MainClass {

	public static void main(String[] args) {
		DefaultClass defaultC= new DefaultClass();
		
		System.out.println(defaultC.n);
//MainClass와 DefaultClass 같은 패키지 안에 있음
		//TestClass t= new TestClass();
	
		//System.out.println(t.getP());;
		//t.p=100;
		//TestClass 내부 변수 P는 private 이기 때문에 사용 불가!!!
		//com.hun.other.PublicClass pc=new com.hun.other.PublicClass();	
		//PublicClass pcc=new PublicClass();
		//pcc.b=100;
		ArrayList<PublicClass> a=new ArrayList<PublicClass>();
	
		int n=a.get(0).b;
		System.out.println(a.get(0));//com.hun.other.PublicC
		System.out.println(a.get(0).b);
		System.out.println(a.get(0).getP());
		a.get(0).setP(10000);
		System.out.println(a.get(0).getP());
	}
}
