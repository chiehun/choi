package workdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {// db 불러오는 클래스
	/**
	 * 공통 변수 선언하기 String mysql 드라이버 경로
	 */
	public	ResultSet rs=null;
	public	Statement stmt = null; 
	public	Connection conn = null;
	public PreparedStatement  pstm = null;
	int c=0;
	public DatabaseClass() {

	}// 생성자 end
	// 1. 참조 하기 jdbc 드라이버 불러오기

	public void createDriver() {
	
		String url = "jdbc:mysql://localhost:3306/pass";
		String user = "root";
		String pw = "1234";
		try { 	
			Class.forName("com.mysql.jdbc.Driver");
			// 2. connection 에서 db접속
			System.out.println("드라이버 연결 성공");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("db 접속 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 실패 :" + e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "접촉 실패");
		
		}
	}//createDriver()
	
	public void selectAll() {
	// Statement 객체 생성 //
		String query = "select * from workdata ";		
	try {
		this.stmt = this.conn.createStatement();
		System.out.println("Statement 객체 생성");
		this.rs=stmt.executeQuery(query);
		System.out.println("query문 생성");		
		while(rs.next()) {			
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age"));
			System.out.println(rs.getInt("salary"));
			System.out.println(rs.getString("area"));
			System.out.println(rs.getInt("worktraing"));
			System.out.println(rs.getString("employee"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("table 불러오기 실패"+e.getMessage());
	}finally {
		
	}
	

}
	
	public void insertMethod(String name ,int  age, int salary, String area, int  worktraing, String employee) {
	// Statement 객체 생성 //
		String query = "insert into workdata (name , age, salary, area, worktraing, employee) values (?, ?, ?, ?, ?, ?)";
	try {
		this.pstm = this.conn.prepareStatement(query);
		//System.out.println("Statement 객체 생성");
			
		this.pstm.setString(1, name);
		this.pstm.setInt(2, age);
		this.pstm.setInt(3, salary);
		this.pstm.setString(4, area);
		this.pstm.setInt(5, worktraing);//5번째 물음표,worktraing
		this.pstm.setString(6, employee);//6? 순서
		
		this.c = this.pstm.executeUpdate();
			//System.out.println("query문 생성");
	if(c>0) {
		System.out.println("삽입에 성공했습니다");
	}else
	System.out.println("삽입 실패");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("table 불러오기 실패"+e.getMessage());
	}

}
}// class end
	