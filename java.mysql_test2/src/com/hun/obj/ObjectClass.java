package com.hun.obj;

public class ObjectClass {
	private int no =0;
	private String id=null;
	private String pw=null;
	
	public ObjectClass() {
		}
	public ObjectClass(int no, String id, String pw) {
		this.no= no;
		this.id=id;
		this.pw=pw;	
		}
	public int getNo() {
		return no;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}

}
