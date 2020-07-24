package com.hun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass { // ��� ����
	public final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final String server_url = "jdbc:mysql://localhost:3306/";
	public String db_name = "quiz_db";
	public Connection conn = null; // ���� ���� ��ü
	public Statement stmt = null; // ��ü ��ȸ select * from ~
	public PreparedStatement pstmt = null; // ���̺� ������ ������ ����
	public ResultSet rs = null;
	private static final int WAITING = 0; // ���
	private static final int PROBLEM = 1; // ����
	private static final int ANSWER = 2; // ����

	private static final int NUMPROBLEMS = 3; // �������� ��

	private int state = WAITING; // ���¸� �����ϴ� ����
									// �ʱⰪ�� ��� ����....
	private int currentProblem = 0; // ���׹�ȣ ���� ����
									// �Ʒ��� �ΰ��� �迭�� �̿��Ͽ� ������ ������ Ȯ��
	// ���� �迭 / ���� �迭

//	private String[] problems = { "��Ʈ��ũ ó�� ��Ű���� ?", "�ڹ��� ����ȭ�� �ֽŹ����� ?", "���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ� ?" };
	//private String[] answers = { "java.net", "1.8", "IP" };

	public DataBaseClass() {
	}// �⺻ ������
String problems [] =null;
String answers [] = null;

	public void CreateDriver() {
		try {
			String servername=null;
			servername = this.server_url+db_name;
			Class.forName(DRIVER_NAME);
			this.conn=DriverManager.getConnection(servername, "root", "1234");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public  void query1(String table_name, int no) {		

		String query = "select question, answer from";
		query = query + table_name;
		query = query + " where no='currentProblem'";
		try {
			this.pstmt = conn.prepareStatement(query);
			this.pstmt.setInt(1, no);
			this.rs=this.pstmt.executeQuery();
			while(rs.next()) {
				for(int idx=0; idx<4;) {
	problems[idx] = this.rs.getString("question");
	answers[idx]= this.rs.getString("answer");
	}			
		}			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public String preocess(String thelnput) {
		String theQutput = null;

		// �ʱ� ��� ������ ���, client���� ������ ����
		if (state == WAITING) {
			// client ���� ����
			theQutput = " ��� �����մϴ� y/n";
			state = PROBLEM;

			// Client�� ��� ������ �������� ������ ����
		} else if (state == PROBLEM) {

			// Client�� ���� ������ �ϰڴٰ� Y �Ǵ� y�� �Է����� ��
			if (thelnput.equalsIgnoreCase("y")) {
				theQutput = problems[currentProblem];
				state = ANSWER; // ���� ���� ANSWER ���� ��� ����

			} else {// client�� n N�� �Է��Ͽ������
				state = WAITING; // n ������ ��� ���·�
				theQutput = "quit"; // �����ٰ� �� ����
			}

			// ���� ���� �Ǿ�����
		} else if (state == ANSWER) {
			if (thelnput.equalsIgnoreCase(answers[currentProblem])) {
				theQutput = "�����Դϴ�. ����Ͻðڽ��ϱ�? y,n";
				state = PROBLEM;

			} else {
				state = PROBLEM;
				theQutput = "�����Դϴ�. ��� �Ͻðڽ��ϱ�? y/n";
			}

			// client�� ��� ������
			currentProblem = (currentProblem + 1) % NUMPROBLEMS; // problem
			// 012012012012012012012 % �ݺ��Ҷ� ����
		}
		return theQutput;
	}
}