package com.hun.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hun.obj.DataClass;
import com.hun.obj.ObjectClass;

public class DateBaseClass {
	/** database ���� ��� ���� **/
	// 1. mySQL ����̹� �̸�
	public final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	// 2. mySQL Server URL
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	// 3. mySQL Admin ID
	public final String ADMIN_ID = "root";
	// 3. mySQL Admin Password
	public final String ADMIN_PW = "1234";

	/** database ���� ��ü ���� **/
	// ������ ���̽� ����
	public Connection conn = null;

	// 2. query ���� ��ü
	public Statement stmt = null;
	public PreparedStatement pstmt = null;// (?)
	// 3. selcet ��� ���� ��ü
	public ResultSet rs = null;
	// 4. insert/ delete/ update ��� ���� ����
	int r = 0;

	/** �׿� �ʿ��� ��ü ���� ���� **/
	public String db_name = null;

	public DateBaseClass() {
	}// �⺻ ������

	public DateBaseClass(String db_name) { // main()���� ���� DB�̸� ���� �޴� ������
		this.db_name = db_name;
	}

	/** 1. mySQL server�� �����ϴ� �޼��� ���� **/
	public void connet_db() {
		// 1. mySQL ����̹� �ε�
		try {
			Class.forName(this.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("errr" + e.getMessage());
		}
		// 2. ����� �����ͺ��̽��� ����
		try {
			String url = this.DB_URL + this.db_name;
			this.conn = DriverManager.getConnection(url, this.ADMIN_ID, this.ADMIN_PW);
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "errr");
		} // connect_db END
			// 3.

	}

	/** 2. table�� ��ü ���ڵ� ��ȸ �޼��� ���� **/
	public void selectAll() {// ����//
		// 1. query ����
		String query = "select * from member";
		try {
			// 2. stmtment ��ü ����
			this.stmt = this.conn.createStatement();

			// 3. query ����
			this.rs = this.stmt.executeQuery(query);

			// 4. ResultSet ��ü ���� ������ ��ȸ
			
			while (rs.next()) {
					System.out.println(rs.getInt(1) + "_");
				System.out.println(rs.getInt(1) + "_");
				System.out.println(rs.getString(3) + "_");
			}
		} catch (SQLException e) {

			System.out.println("STATEMENT ERR" + e.getMessage());
		} finally {
						this.userClose(this.rs, this.stmt);
				}
	}

	public void countRecord() {
		// 1. query ����
		String query = "select count (*) from member";
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			this.rs.next();
			// System.out.println();
		} catch (SQLException e) {
			System.out.println("STATEMENT ERR" + e.getMessage());
		} finally {
			try { // �ڿ� ���� try => finally / try => catch() => finally
				this.rs.close();
				this.stmt.close();
			} catch (SQLException e) {
				System.out.println("select close err" + e.getMessage());
			}
		}
	}

	// 4 . �ߺ� ���̵� Ȯ�� �޼��� ����
	public void duplicateID(String id) {
		// 1. query ����
		// member ���̺�� ���� ���޵� id�� �ִ��� Ȯ�� ��, �ش� id ����Ʈ�� ��ȯ
		String query = "select id from member where id =?";
		try {
			this.pstmt = conn.prepareStatement(query);
			this.pstmt.setString(1, id); // ù ��° ? �� ���޹��� �Ű� ���� ���� ����.
			this.rs = this.pstmt.executeQuery(); // ����� query ����
			if (rs.next()) {
				System.out.println("�ߺ��� ���̵� �Դϴ�");
			} else {
				System.out.println("��� ������ ���̵� �Դϴ�");
			}
		} catch (SQLException e) {
			System.out.println("duplicateID() ERR :" + e.getMessage());
		} finally {
			this.userClose(this.rs, this.pstmt);
		}
	}// duplicateID end

	// 5.
	public void InsertTable(String id, String pw) {
		// 1. query ����

		String query = "insert into member (id, pw) values(?, ?)";// ? ����

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.r = this.pstmt.executeUpdate();
			if (r > 0) {
				System.out.println("���������� ���� �Ǿ����ϴ�");
			} else {
				System.out.println("���� �����Ͽ����ϴ�");
			}
		} catch (SQLException e) {
			System.out.println("InsertTable() err" + e.getMessage());
		} finally {
			this.userClose(this.pstmt);
				}
	}

	// 6 no �ʵ尪�� �̿��Ͽ� id, pw �ʵ��� ���� �����ϴ� �޼��� ����
	public void updateTable(String id, String pw, int no) {
		// 1. query ����
		String query = "update member set id=?, pw=? where no=?" ;
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.pstmt.setInt(3, no);
			this.r = this.pstmt.executeUpdate();
			if (r > 0) {
				System.out.println("��������");
			} else {
				System.out.println("���� ����");// ������Ʈ �Ҷ��� ������Ʈ�� �� �Ǿ����� Ȯ���ϱ� ���ؼ� Ȯ�� �ڵ带 �־��ش�
			}
		} catch (SQLException e) {
			System.out.println("updateTalbe err " + e.getMessage());
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				System.out.println("updateTalbe CLOSE err " + e.getMessage());
			}
		}

	}

	public void deleteRecord(int no) {
		String query = "delete from member where no=?";

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setInt(1, no);
			this.r = this.pstmt.executeUpdate();
			if (this.r > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����!");
			}
		} catch (SQLException e) {
			System.out.println("deleteRecord() err" + e.getMessage());
		}finally {
		try {
			this.pstmt.close();
		} catch (SQLException e) {
			System.out.println("deleteRecord() CLOSE err" + e.getMessage());		
		}
	}
}
	
	/**�� �ڿ����� �����ϴ� �޼��� OVERLOADING**/
	public void userClose(ResultSet rs, Statement stmt) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ResultSET, Statement CLOSE ERR : "+ e.getMessage());
		}				
	}//userclose
	
	public void userClose(ResultSet rs, PreparedStatement pstmt) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ResultSET, Statement CLOSE ERR : "+ e.getMessage());
		}				
	}//userclose
	
	public void userClose( PreparedStatement pstmt) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ResultSET, Statement CLOSE ERR : "+ e.getMessage());
		}				
	}//userclose
	
	public void userClose() {
		try {
		this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("conn,  CLOSE ERR : "+ e.getMessage());
		}				
	}//userclose
}// class