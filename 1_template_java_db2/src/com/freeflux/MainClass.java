package com.freeflux;

import com.freeflux.db.DataBaseClass;

public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc=new DataBaseClass();
		dbc.connectMYSQL("test");//�����ͺ��̽��� test
		//dbc.selectAll("employee");
		//dbc.insertRecord();
		//dbc.searchWord("employee");
		//dbc.p1("employee");
		//dbc.p3("employee");
		dbc.p4("employee");
	}

}
