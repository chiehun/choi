package workdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {// db �ҷ����� Ŭ����
	/**
	 * ���� ���� �����ϱ� String mysql ����̹� ���
	 */
	public	ResultSet rs=null;
	public	Statement stmt = null; 
	public	Connection conn = null;
	public PreparedStatement  pstm = null;
	int c=0;
	public DatabaseClass() {

	}// ������ end
	// 1. ���� �ϱ� jdbc ����̹� �ҷ�����

	public void createDriver() {
	
		String url = "jdbc:mysql://localhost:3306/pass";
		String user = "root";
		String pw = "1234";
		try { 	
			Class.forName("com.mysql.jdbc.Driver");
			// 2. connection ���� db����
			System.out.println("����̹� ���� ����");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("db ���� ����");
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���� :" + e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "���� ����");
		
		}
	}//createDriver()
	
	public void selectAll() {
	// Statement ��ü ���� //
		String query = "select * from workdata ";		
	try {
		this.stmt = this.conn.createStatement();
		System.out.println("Statement ��ü ����");
		this.rs=stmt.executeQuery(query);
		System.out.println("query�� ����");		
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
		System.out.println("table �ҷ����� ����"+e.getMessage());
	}finally {
		
	}
	

}
	
	public void insertMethod(String name ,int  age, int salary, String area, int  worktraing, String employee) {
	// Statement ��ü ���� //
		String query = "insert into workdata (name , age, salary, area, worktraing, employee) values (?, ?, ?, ?, ?, ?)";
	try {
		this.pstm = this.conn.prepareStatement(query);
		//System.out.println("Statement ��ü ����");
			
		this.pstm.setString(1, name);
		this.pstm.setInt(2, age);
		this.pstm.setInt(3, salary);
		this.pstm.setString(4, area);
		this.pstm.setInt(5, worktraing);//5��° ����ǥ,worktraing
		this.pstm.setString(6, employee);//6? ����
		
		this.c = this.pstm.executeUpdate();
			//System.out.println("query�� ����");
	if(c>0) {
		System.out.println("���Կ� �����߽��ϴ�");
	}else
	System.out.println("���� ����");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("table �ҷ����� ����"+e.getMessage());
	}

}
}// class end
	