package com.hun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {

	public DatabaseClass() {
	}// ������

	public void creatdatabase() {// jdc ����̺� ��ġ�ϴ� �޼���
		Connection conn = null; // import java.squl// ���
		Statement stmt = null;
		String Query= "select * from present";
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fristproject", "root", "1234");
			System.out.println("���� ����");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "���� ����");
		}	
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			rs=stmt.executeQuery(Query);
			while(rs.next()) {
			System.out.println("selert ����");
			System.out.println(rs.getInt("num"));//  ��ȣ ��
			System.out.println(rs.getString("food")); // ���İ�
			System.out.println(rs.getString("action"));}// 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}// Ŭ����
// �� �޼���� ��� �и� ��ų��?