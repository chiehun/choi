package com.hun;

public class ThreadName extends Thread{

	public ThreadName() {
			}
	public ThreadName(String s) {
		super(s);
	}
	public void run() {
		System.out.println("run  thread ³»ºÎ");
	}
}
