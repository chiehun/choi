package com.hun;

public class ThreadTest {

	public static void main(String[] args) {//main thread
		
		SleepThread st=new SleepThread();
		st.start();
		// ��� ��� 1.
		// Thread �� ��� �ް�, run() {    } ���θ� ������
		// ��ü ����
		// strat() �� ȣ�������ν� �����尡 �۵� ����.
		
		// ��� ��� 2.
		// Runnalbe�� ���� �ް�, run(){    } ���θ� ������
		// ��ü ����.
		// �ݵ�� Thread Ŭ������ ���� ��ü ����.
		// ��ü ������, Runnable�� ���� ���� ��ü�� �����ڿ� ����,
		// Thread ��ü ������ start() �޼��带 ȣ�������ν� �۵� ����.!!@!
		
		//public class Thread implements Runnalbe{
		//public interface Runnable { public void run();
		//Thread
		// currentThread() : ���� ���� ���� ������ ��ȯ
		// sleep() : �����带 �Ͻ� ���� �޼���
		
		// getName() : ������ �̸� ��ȯ
		// setName() :  ������ �̸� ����
		// getPriority() : ������ �ڿ� �Ҵ� �޼���
		// join() : �ٸ� �����尡 ���� �� �� ���� ���
		// run() : ���� ������ �޼��� ( ���� ������)
		
		// @Overrride
		// public void run() {   } : ���� ������ �޼��� ( ���� ������)
		
		// start() : �����带 ����(����)��Ű�� �޼���
		
		
	}

}
