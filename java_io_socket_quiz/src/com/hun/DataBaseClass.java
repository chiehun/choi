package com.hun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass { // 상수 선언
	public final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final String server_url = "jdbc:mysql://localhost:3306/";
	public String db_name = "quiz_db";
	public Connection conn = null; // 최종 접속 객체
	public Statement stmt = null; // 전체 조회 select * from ~
	public PreparedStatement pstmt = null; // 테이블에 변수로 데이터 전달
	public ResultSet rs = null;
	private static final int WAITING = 0; // 대기
	private static final int PROBLEM = 1; // 문제
	private static final int ANSWER = 2; // 정답

	private static final int NUMPROBLEMS = 3; // 제공문항 수

	private int state = WAITING; // 상태를 저장하는 변수
									// 초기값은 대기 상태....
	private int currentProblem = 0; // 문항번호 저장 변수
									// 아래의 두가지 배열을 이용하여 문제와 정답을 확인
	// 문제 배열 / 정답 배열

//	private String[] problems = { "네트워크 처리 패키지는 ?", "자바의 안정화된 최신버전은 ?", "인터넷에서 컴퓨터를 식별하는 주소는 ?" };
	//private String[] answers = { "java.net", "1.8", "IP" };

	public DataBaseClass() {
	}// 기본 생성자
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

		// 초기 대기 상태일 경우, client에게 보여줄 내용
		if (state == WAITING) {
			// client 에게 질문
			theQutput = " 퀴즈를 시작합니다 y/n";
			state = PROBLEM;

			// Client가 계속 문제를 진행할지 것인지 여부
		} else if (state == PROBLEM) {

			// Client가 퀴즈 진행을 하겠다고 Y 또는 y를 입력했을 때
			if (thelnput.equalsIgnoreCase("y")) {
				theQutput = problems[currentProblem];
				state = ANSWER; // 상태 값을 ANSWER 변경 대기 상태

			} else {// client가 n N을 입력하엿을경우
				state = WAITING; // n 했을때 대기 상태로
				theQutput = "quit"; // 빠져다갈 수 없는
			}

			// 답이 제출 되었을때
		} else if (state == ANSWER) {
			if (thelnput.equalsIgnoreCase(answers[currentProblem])) {
				theQutput = "정답입니다. 계속하시겠습니까? y,n";
				state = PROBLEM;

			} else {
				state = PROBLEM;
				theQutput = "오답입니다. 계속 하시겠습니까? y/n";
			}

			// client가 퀴즈를 진행하
			currentProblem = (currentProblem + 1) % NUMPROBLEMS; // problem
			// 012012012012012012012 % 반복할때 적용
		}
		return theQutput;
	}
}