package com.hun;

import java.util.ArrayList;

public class DateClass {
	ArrayList<BookstoreClass> book = new ArrayList<BookstoreClass>();

	public DateClass() {
		// TODO Auto-generated constructor stub
	}

	public static  void initBookstoreClass() {
		String uri="c:/filetest/bookdata.txt";
		MethodClass.readbook(uri);
	}
}