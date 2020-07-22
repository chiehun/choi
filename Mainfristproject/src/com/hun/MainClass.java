package com.hun;

public class MainClass {
	static DatabaseClass db= null;// main이 먼저 실행되기 때문에 static이 붙어야 한다.
	public static void main(String[] args) {
		db= new DatabaseClass();
			db.creatdatabase();
		}

}
