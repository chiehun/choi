package com.hun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hun.db.DateBaseClass;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		/** 1. JDBC Driver Load **/
		DateBaseClass dbc = new DateBaseClass("test_db");// DateBaseClassr ��ü ����
		dbc.connet_db(); // jdbc �� ���� �������ִ� �޼���
		dbc.selectAll();
	//	dbc.countRecord();
		dbc.duplicateID("bbb");
		dbc.duplicateID("aaa");
		//dbc.InsertTable('asdfasd", "12345");
		dbc.updateTable("aaa", "1111", 5);
		dbc.deleteRecord(3);
		dbc.userClose();
	}

	/** 3. table�� �� ���ڵ� �� Ȯ�� �޼��� ����**/
	
}
