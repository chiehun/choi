package com.hun;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class MainClass {

	public static void main(String[] args) {
		String site = "https://www.naver.com//index.html";
		
		URLReader homePage = new URLReader(site);
		//homePage.printConnectiongInfo();//���� 
		
		System.out.println("========");
		
		homePage.printage(); //������ ������ִ� �޼���
		
		URLReader URLR = new URLReader();
		URL site1=URLR.url;
		URLR.printConnectiongInfo(site1);
		
			// �� ��ǻ��
		/**try {
			InetAddress my = InetAddress.getLocalHost();
			MyInetAddress inet =new MyInetAddress(my);
			inet.printInfo();
			
			//www.narer.com
			InetAddress naver = InetAddress.getByName("www.naver.com");
			//naver.�� ����
			inet.setInetAddress(naver); // �����̳��
			inet.printInfo();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}**/

	}

}
