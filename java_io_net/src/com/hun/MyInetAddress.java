package com.hun;

import java.net.InetAddress;

public class MyInetAddress {
	public InetAddress ip; // 도메인 주소
	public MyInetAddress() {
		}// 기본 생성자 END

	public MyInetAddress(InetAddress ip) {//www.  ~~~.com
	this.ip = ip;		//직접 받을 수도 있고 메서드로도 받으룻 있다
		}
	
	public void setInetAddress(InetAddress ip) {
		this.ip = ip;
	}
// setinetAddress() end

	public void printInfo() {
		System.out.println("printInfo()= >" + ip.getHostName()); // 도메인 명을 반환 시켜주는 메서드
		System.out.println("printInfo()= >" + ip.getHostAddress()); //실제 IP 주소로 반환 시켜준느 메서드
		System.out.println("printInfo()= >" + ip.toString()); // 도메인명과
		System.out.println();
	}
}
