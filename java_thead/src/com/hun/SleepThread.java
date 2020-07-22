package com.hun;

public class SleepThread extends Thread {

	public SleepThread() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		System.out.println("sleep start!");
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("sleep end!");
	}

}
