package com.hun;

public class MainClass {
	static DatabaseClass db= null;// main�� ���� ����Ǳ� ������ static�� �پ�� �Ѵ�.
	public static void main(String[] args) {
		db= new DatabaseClass();
			db.creatdatabase();
		}

}
