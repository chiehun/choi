package com.hun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QuizDB {
	/**1. 상수 선언**/
	
	public ArrayList<Quiz> quiz_list=new ArrayList<Quiz>();
	private final String DB_DRIVER_NAME ="com.mysql.jdbc.Driver";
	private final String DB_URL ="jdbc:mysql://localhost:3306/";
	
	private final String DB_ID = "root";
	private final String DB_PW="1234";
	
	
	private Connection connect=null;				// 최종 접속 객체
	private Statement stmt=null;					// 전체 조회 select * from ~
	private PreparedStatement pstmt=null;	// 테이블에 변수로 데이터 전달
	private ResultSet rs=null;		
	private String db_url_name = null;
	
	
	public QuizDB() {	
	}//생성자

	public QuizDB(String dbName) {
		this.db_url_name=DB_URL+dbName;
	}

	//connent() 메서드 선언 시작 : quiz_db 접속
	
	public void connect() {
		try {
			Class.forName(DB_DRIVER_NAME);
			this.connect=DriverManager.getConnection(this.db_url_name, this.DB_ID, this.DB_PW);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 err"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 ERR! : "+ e.getMessage());
		}
		
		
		}// connect() 메서드 선언 종료 : quiz_db 접속
	public void quizInsert() { // mysql에 삽입해주기 위해서 만든 메서드
		String [] problems = {"네트워크 처리 패키지는 ?", "자바의 안정화된 최신버전은 ?", "인터넷에서 컴퓨터를 식별하는 주소는 ?" };
		 String [] answers = {"java.net", "1.8", "IP" };
		 
		 String sql_insert = "INSERT INTO quiz table (question , answer ) VALUES (?,?) ";// query
		 int result=0; //삽입되어 있는지 확인하는 
		 try {
			this.pstmt= this.connect.prepareStatement(sql_insert);
			for(int idx=0; idx<problems.length; idx++) {
				this.pstmt.setString(1, ChangeEncoding.javaTomySQL(problems[idx]));
				//문제들 [네트워크 처리 패키지는 ?", "자바의 안정화된 최신버전은 ?", "인터넷에서 컴퓨터를 식별하는 주소는 ?]
				this.pstmt.setString(2 ,ChangeEncoding.javaTomySQL(answers[idx]));  //답들["java.net", "1.8", "IP"]
				result=this.pstmt.executeUpdate();//이건 왜 여기 쓰이는 걸까?! 삽입해주기 위해서
				System.out.println("for = > result : "+result +" "+idx); // 확인 하는 메서드 
			}
		} catch (SQLException e) {
			System.out.println("INSERT SQL ERR! : " + e.getMessage());
		}
	}
	
	/** quizSelect() 메서드 선언 시작 : quiz_db 의 quiz_table에 문제와 정답 조회**/
	public void quizSelect() {
		this.stmt=null;
		this.rs=null;
		
		String sql_select = "SELECT * FROM quiz_table";
		
		try {
			this.stmt = this.connect.createStatement();
			this.rs=this.stmt.executeQuery(sql_select);
			Quiz quiz_object=null; //데이터가 많아 지면 바깥에 선언하는게 좋다 why 불필요한 데이터가 늘어나기 때문에
			while(rs.next()) {
				quiz_object=new Quiz();
				quiz_object.setQuizNO(rs.getInt("no"));
				quiz_object.setQuizQuestion(ChangeEncoding.mySQLToJava(rs.getString("question")));
				quiz_object.setQuizAnswer(ChangeEncoding.mySQLToJava("answer"));
				quiz_list.add(quiz_object);
				quiz_object=null; // 초기화하지 않으면 계속 쌓이게 된다,
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
			}
	
	
	public void dbClose() {
		try {
		if(this.rs != null) { //객체가 없을때 계속 돌아가기 때문에 오류 방지해 놓기 위해서
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
		System.out.println("자원 해제"+e.getMessage());
			}

}
	}

