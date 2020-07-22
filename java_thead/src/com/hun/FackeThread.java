package com.hun;

public class FackeThread {
	private String name;
	public FackeThread(String s) {
		this.name=s;
		} //»ı¼ºÀÚ end
	public void strat() {
		this.run();
	}
	
	public void run() {
		int i=0;
		while(i<50) {
			System.out.println(this.getName());
			i++;
		}
	}// run() end
	
	public String getName() {
		return this.name;
	}

}
