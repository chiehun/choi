package com.hun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QuizDB {
	/**1. ��� ����**/
	
	public ArrayList<Quiz> quiz_list=new ArrayList<Quiz>();
	private final String DB_DRIVER_NAME ="com.mysql.jdbc.Driver";
	private final String DB_URL ="jdbc:mysql://localhost:3306/";
	
	private final String DB_ID = "root";
	private final String DB_PW="1234";
	
	
	private Connection connect=null;				// ���� ���� ��ü
	private Statement stmt=null;					// ��ü ��ȸ select * from ~
	private PreparedStatement pstmt=null;	// ���̺� ������ ������ ����
	private ResultSet rs=null;		
	private String db_url_name = null;
	
	
	public QuizDB() {	
	}//������

	public QuizDB(String dbName) {
		this.db_url_name=DB_URL+dbName;
	}

	//connent() �޼��� ���� ���� : quiz_db ����
	
	public void connect() {
		try {
			Class.forName(DB_DRIVER_NAME);
			this.connect=DriverManager.getConnection(this.db_url_name, this.DB_ID, this.DB_PW);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� err"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� ERR! : "+ e.getMessage());
		}
		
		
		}// connect() �޼��� ���� ���� : quiz_db ����
	public void quizInsert() { // mysql�� �������ֱ� ���ؼ� ���� �޼���
		String [] problems = {"��Ʈ��ũ ó�� ��Ű���� ?", "�ڹ��� ����ȭ�� �ֽŹ����� ?", "���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ� ?" };
		 String [] answers = {"java.net", "1.8", "IP" };
		 
		 String sql_insert = "INSERT INTO quiz table (question , answer ) VALUES (?,?) ";// query
		 int result=0; //���ԵǾ� �ִ��� Ȯ���ϴ� 
		 try {
			this.pstmt= this.connect.prepareStatement(sql_insert);
			for(int idx=0; idx<problems.length; idx++) {
				this.pstmt.setString(1, ChangeEncoding.javaTomySQL(problems[idx]));
				//������ [��Ʈ��ũ ó�� ��Ű���� ?", "�ڹ��� ����ȭ�� �ֽŹ����� ?", "���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ� ?]
				this.pstmt.setString(2 ,ChangeEncoding.javaTomySQL(answers[idx]));  //���["java.net", "1.8", "IP"]
				result=this.pstmt.executeUpdate();//�̰� �� ���� ���̴� �ɱ�?! �������ֱ� ���ؼ�
				System.out.println("for = > result : "+result +" "+idx); // Ȯ�� �ϴ� �޼��� 
			}
		} catch (SQLException e) {
			System.out.println("INSERT SQL ERR! : " + e.getMessage());
		}
	}
	
	/** quizSelect() �޼��� ���� ���� : quiz_db �� quiz_table�� ������ ���� ��ȸ**/
	public void quizSelect() {
		this.stmt=null;
		this.rs=null;
		
		String sql_select = "SELECT * FROM quiz_table";
		
		try {
			this.stmt = this.connect.createStatement();
			this.rs=this.stmt.executeQuery(sql_select);
			Quiz quiz_object=null; //�����Ͱ� ���� ���� �ٱ��� �����ϴ°� ���� why ���ʿ��� �����Ͱ� �þ�� ������
			while(rs.next()) {
				quiz_object=new Quiz();
				quiz_object.setQuizNO(rs.getInt("no"));
				quiz_object.setQuizQuestion(ChangeEncoding.mySQLToJava(rs.getString("question")));
				quiz_object.setQuizAnswer(ChangeEncoding.mySQLToJava("answer"));
				quiz_list.add(quiz_object);
				quiz_object=null; // �ʱ�ȭ���� ������ ��� ���̰� �ȴ�,
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
			}
	
	
	public void dbClose() {
		try {
		if(this.rs != null) { //��ü�� ������ ��� ���ư��� ������ ���� ������ ���� ���ؼ�
			this.rs.close();
		}	
		if(this.pstmt != null) {
			this.pstmt.close();
		}	
		if(this.stmt != null) {
			this.stmt.close();
		}
		if(this.connect != null) {
			this.connect.close();
		}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		System.out.println("�ڿ� ����"+e.getMessage());
			}

}
	}

