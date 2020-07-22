package com.hun;

public class ThreadTest {

	public static void main(String[] args) {//main thread
		
		SleepThread st=new SleepThread();
		st.start();
		// 사용 방법 1.
		// Thread 를 상속 받고, run() {    } 내부를 재정의
		// 객체 생성
		// strat() 를 호출함으로써 스레드가 작동 시작.
		
		// 사용 방법 2.
		// Runnalbe를 구현 받고, run(){    } 내부를 재정의
		// 객체 생성.
		// 반드시 Thread 클래스에 대한 객체 생성.
		// 객체 생성시, Runnable을 구현 받은 객체를 생성자에 전달,
		// Thread 객체 내부의 start() 메서드를 호출함으로써 작동 시작.!!@!
		
		//public class Thread implements Runnalbe{
		//public interface Runnable { public void run();
		//Thread
		// currentThread() : 현재 구동 중인 스레드 반환
		// sleep() : 스레드를 일시 재우는 메서드
		
		// getName() : 스레드 이름 반환
		// setName() :  스레드 이름 설정
		// getPriority() : 스레드 자원 할당 메서드
		// join() : 다른 스레드가 종료 될 때 까지 대기
		// run() : 강제 재정의 메서드 ( 실제 스레드)
		
		// @Overrride
		// public void run() {   } : 강제 재정의 메서드 ( 실제 스레드)
		
		// start() : 스레드를 구동(시작)시키는 메서드
		
		
	}

}
