package com.hun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {

	public DatabaseClass() {
	}// 생성자

	public void creatdatabase() {// jdc 드라이브 설치하는 메서드
		Connection conn = null; // import java.squl// 기억
		Statement stmt = null;
		String Query= "select * from present";
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("성공");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fristproject", "root", "1234");
			System.out.println("연결 성공");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "연결 실패");
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
			System.out.println("selert 성공");
			System.out.println(rs.getInt("num"));//  번호 값
			System.out.println(rs.getString("food")); // 음식값
			System.out.println(rs.getString("action"));}// 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}// 클래스
// 각 메서드로 어떻게 분리 시킬까?