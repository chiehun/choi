package com.freeflux.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.freeflux.util.ChangeEncoding;

public class DataBaseClass {
	/** ��� ���� **/
	public final String DRIVER = "com.mysql.jdbc.Driver"; // ����̹� ��
	// ����̹� ���� ��ǰ���� �ٸ�
	// �ش� ��ǰ ����Ʈ���� ����
	public final String DBURL = "jdbc:mysql://localhost:3306/"; // �⺻ URL
	// localhost �� ip : 127.0.0.1 ( ���� Ŭ���̾�Ʈ �ּҷ� ����)
	// 3307 : mySQL�� ������ ����� ���� ��Ʈ��ȣ
	// ���� ��Ʈ��ȣ�� ��ǰ���� �ٸ� !!(����Ŭ�� 8080�� �⺻ ��Ʈ ��ȣ)

	public final String DBID = "root"; // ������ ID
	// mySQL 5.1 �� "root"�� ����
	// ����Ŭ������ ����� ����( �� DB��) ���� �����.
	// ���� : �ұԸ� ��ü�� APM�� �ַ� ��� (Apache/ PHP/ MySQL)

	/** DB ���� ��ü **/
	// java.sql ��Ű�� ���� Ŭ���� ��..
	public String dbname = null; // ����� ������ ���̽���
	public Connection conn = null; // ���� ���� ��ü
	public Statement stmt = null; // ��ü ��ȸ select * from~
	public PreparedStatement pstmt = null; // ���̺� ������ ������ ����
	public ResultSet rs = null; // select�� ��� ��ü ����
	public int result = 0; // insert/update/delete ��� ����

	public DataBaseClass() {
	}

	/** ����̹� �ε� �� �����ͺ��̽� ���� **/
	public void connectMYSQL(String db_name) {
		this.dbname = db_name;
		String url = this.DBURL + this.dbname;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// "com.mysql.jdbc.Driver" : ��Ű�� ��
			// Driver : Driver.class
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver err : " + e.getMessage());
			// getConnection (" ���� URL+DB��', " ������ ID", "������ PW")

		}
		try {
			this.conn = DriverManager.getConnection(url, this.DBID, "1234");
			// getConnection()sms db���� null�ƴ� �̻�,
			// db���� ��� ���ӿ� ������ �� �ֱ� ������ ���� �߻� ����!!
			// ��, db���� ���� ���, ��, �߸� �Է����� ��쿡�� ���� �߻�!!
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection errr" + e.getMessage());
		}

	}

	/** ��ȸ �޼��� (��ü ��ȸ : select * from ���̺� ��) **/

	public void selectAll(String table_name) {
		String query = "select sum(sale *24), max(sale), min(sale) from " + table_name + " where sale>200";// +" order
																											// by job
																											// asc limit
																											// 0,5";//asc
																											// ������������
		try {
			this.stmt = this.conn.createStatement();
			// createStatement()�� ��ü ������, query ���� ���� ����!!!
			this.rs = this.stmt.executeQuery(query);
			this.rs.next();
			System.out.print(rs.getInt(1) + " : ");
			System.out.print(rs.getInt(2) + " : ");
			System.out.println(rs.getInt(3));
			/**
			 * while (rs.next()) { String name = rs.getString("empName"); String job =
			 * rs.getString("job");
			 * 
			 * System.out.println(ChangeEncoding.toUnicode(name));// �ѱ۷� ���ڵ� �Ѱ�
			 * System.out.println(ChangeEncoding.toUnicode(job)); //
			 * System.out.println(rs.getString("empName")); }
			 **/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("selectAll() ERR : " + e.getMessage());
		}
	}

	/** ���̺� ������ �߰� (����)�ϴ� �޼��� **/
	public void insertRecord() {
		// insert into employee(empNo, empName, job, mgr, hireDate, sale, commission,
		// deptNo)
		// values (1001, '����', '���', 13, '2007-03-01', 300, 0, 20);
		// ? ? ? ? ? ? ? ?
		// PRI key ���� �ߺ����� ������ �ʴ´�
		// �ڵ����� �����ϴ� ������ ����Ҷ�
		String query = "insert into employee (empNo, empName, job, mgr, hireDate, sale, commission, deptNo)";
		query = query + " values (?, ?, ?, ?, ?, ?, ?, ?)";
		// empNO SMS primary key �̱� ������ �ߺ����� �߰� �� �� ����!!!

		try {
			this.pstmt = this.conn.prepareStatement(query);
			// preparStatement()�� ��ü ������, query ���� ���� �����ؾ� �Ѵ�.

			// query�� ���ο� ? �� ���� ���.
			// �ݵ�� ?�� �ش��ϴ� ���� ����
			// ���� ���� ?�� ���� ��� ?�� 1�� ����.....
			// ?�� �������� ���� �� �Ǵ� ���� ���� ������ ��� ���� �߻�!!
			// ���� �ش� �ʵ�� Ÿ���� ���� ���� ��쿡�� ���� �߻�!!
			this.pstmt.setInt(1, 1016); //
			this.pstmt.setString(2, ChangeEncoding.toLatin("����"));
			this.pstmt.setString(3, ChangeEncoding.toLatin("������"));
			this.pstmt.setInt(4, 12);
			this.pstmt.setString(5, "2020-07-21");
			this.pstmt.setInt(6, 100);
			this.pstmt.setInt(7, 0);
			this.pstmt.setInt(8, 20);

			this.result = this.pstmt.executeUpdate();
			// ��ü ������ �̸� query ���� �������� ������
			// ����� query �� ���� ���� ����!!!
			// executeUpdate()�� ������ ��� ���� ������ ��ȯ
			// ������ ������ ���� ��쿡�� 0�� ��ȯ..
			// ��� ���� �̿��ϸ� ���� ���θ� Ȯ���� �� ����!
			System.out.println(this.result + "���� �Ǿ����ϴ�");

		} catch (SQLException e) {
			System.out.println("insertRecord err" + e.getMessage());
		}
	}

	public void searchWord(String table_name) {
		String query = "select empName, job from ";
		query = query + table_name + " where empName like CONCAT('%', ?, '%')";

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("��"));
			this.rs = this.pstmt.executeQuery();

			while (rs.next()) {
				String temp = "";
				temp = rs.getString(1);
				System.out.println(ChangeEncoding.toUnicode(temp + " : "));
				temp = rs.getString(2);
				System.out.println(ChangeEncoding.toUnicode(temp));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + "���ڵ� ����");
		}

	}

	public void p1(String table_name) {
		String query = "select empName, sale, hireDate from employee";
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("empName");
				// �ѱ۷� ���ڵ� �Ѱ�
				int temp = 0;
				temp = rs.getInt("sale");

				String a = rs.getString("hireDate");
				System.out.println(ChangeEncoding.toUnicode(name) + "  :  " + temp + " : " + a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + "���ڵ� ����");
		}
		}

	public void p3(String table_name) {
		//select * from member where sex='M' and score>30;( ������ �����̸鼭 ������ 30�̻��λ��)
		//select name, addr from member where sex='M' and score>30;(
		//empNo, empName, job, mgr, hireDate, sale, commission, deptNo
	
		String query =" select * from employee where sale>200";
			try {
			this.pstmt=this.conn.prepareStatement(query);
			this.rs = this.pstmt.executeQuery();
		
			
			while(rs.next()) {				
				int a1=rs.getInt("empNo");
				String temp= ChangeEncoding.toUnicode(rs.getString("empName"));
				int sale=rs.getInt("sale");
				System.out.println(a1+" : "+temp+" : "+sale);
				//System.out.println(rs.getString("job"));
				//System.out.println(rs.getInt("mgr"));
				//System.out.println(rs.getString("hireDate"));
				//System.out.println(rs.getInt("sale"));
				//System.out.println(rs.getInt("commission"));
				//System.out.println(rs.getInt("deptNo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+" ���ڵ� ����");
		}
		
	}

	public void p4(String table_name) {
		//empNo, empName, job, mgr, hireDate, sale, commission, deptNo
		String query = "select empNo, empName, sale from ";
		query = query + table_name + " where empName like CONCAT('%', ?, '%')";
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("��"));
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				String temp = "";
				temp = rs.getString(1);
				System.out.println(ChangeEncoding.toUnicode(temp + " : "));
				temp = rs.getString(2);
				System.out.println(ChangeEncoding.toUnicode(temp));
				temp = rs.getString(3);
				System.out.println(ChangeEncoding.toUnicode(temp));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + "���ڵ� ����");
		}

	}

	public void p5(String table_name) {
	}
	
		
	}

