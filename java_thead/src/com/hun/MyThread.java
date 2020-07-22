package com.hun;

public class MyThread extends Thread {

	public MyThread() {
		System.out.println("mythread의 생성장");
	}		// TODO Auto-generated constructor stub
		/**public class Thread implements Runnable{
		 * public Thread(){
		 * 
		 * @override
		 * public void run(){ // 인터페이스를 구현 받는 직계 가족만 재정의를 할 수 있다
		 * }		 
*	} // 원래 주어지는 main
*	public class MyThread extends Thread{
	*	public void run(){~~~~~~}
*		public void start(){        }
*	
*

		*/
public void run() {
	int i=0;
	while(i<100) {
		System.out.println("run() 내부, 스레드 시작됨");
		i++;
	}
	
}
}