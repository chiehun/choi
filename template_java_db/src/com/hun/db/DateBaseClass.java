package com.hun.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DateBaseClass {
/** 상수 선언**/
	//드라이버 경로
	//public final String DRIVER = "com.mysql.jdbc.Driver"
	public final String DBdriver ="com.mysql.jdbc.Driver";
	//url
	public final String DBurl = "jdbc:mysql://localhost:3306/";
	
	public String dbname = null; // 사용할 데이터 베이스명
	public Connection conn = null; // 최종 접속 객체
	public Statement stmt = null; // 전체 조회 select * from~
	public PreparedStatement pstmt = null; // 테이블에 변수로 데이터 전달
	public ResultSet rs = null; // select의 결과 객체 저장
	public int result = 0; // insert/update/delete 결과 저장
	
	public DateBaseClass() {
	}//생성자//

	public void CreatDriver(String db_name) {
		db_name=this.dbname;
		String url = this.DBurl+dbname;
		try {
			Class.forName(DBdriver);
		} catch (ClassNotFoundException e) {
			System.out.println("driver err : "+e.getMessage());
		}
		try {
			this.conn=DriverManager.getConnection(url, "root", "1234");
		} catch (SQLException e) {
			System.out.println("connection err : "+e.getMessage());
		}
	}

}
