package com.hun;

public class MyThread extends Thread {

	public MyThread() {
		System.out.println("mythread�� ������");
	}		// TODO Auto-generated constructor stub
		/**public class Thread implements Runnable{
		 * public Thread(){
		 * 
		 * @override
		 * public void run(){ // �������̽��� ���� �޴� ���� ������ �����Ǹ� �� �� �ִ�
		 * }		 
*	} // ���� �־����� main
*	public class MyThread extends Thread{
	*	public void run(){~~~~~~}
*		public void start(){        }
*	
*

		*/
public void run() {
	int i=0;
	while(i<100) {
		System.out.println("run() ����, ������ ���۵�");
		i++;
	}
	
}
}