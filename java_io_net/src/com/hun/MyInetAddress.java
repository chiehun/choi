package com.hun;

import java.net.InetAddress;

public class MyInetAddress {
	public InetAddress ip; // ������ �ּ�
	public MyInetAddress() {
		}// �⺻ ������ END

	public MyInetAddress(InetAddress ip) {//www.  ~~~.com
	this.ip = ip;		//���� ���� ���� �ְ� �޼���ε� ������ �ִ�
		}
	
	public void setInetAddress(InetAddress ip) {
		this.ip = ip;
	}
// setinetAddress() end

	public void printInfo() {
		System.out.println("printInfo()= >" + ip.getHostName()); // ������ ���� ��ȯ �����ִ� �޼���
		System.out.println("printInfo()= >" + ip.getHostAddress()); //���� IP �ּҷ� ��ȯ �����ش� �޼���
		System.out.println("printInfo()= >" + ip.toString()); // �����θ��
		System.out.println();
	}
}
