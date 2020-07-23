package com.hun;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainClass {

	public static void main(String[] args) {
		String site = "https://www.naver.com//index.html";
		
		URLReader homePage = new URLReader(site);
		homePage.printConnectiongInfo();//정보 
		
		System.out.println("========");
		
		homePage.printage(); //페이지 출력해주는 메서드
			// 내 컴퓨터
		/**try {
			InetAddress my = InetAddress.getLocalHost();
			MyInetAddress inet =new MyInetAddress(my);
			inet.printInfo();
			
			//www.narer.com
			InetAddress naver = InetAddress.getByName("www.narer.com");
			//naver.로 부터
			inet.setInetAddress(naver); // 도메이놋녀
			inet.printInfo();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}**/

	}

}
