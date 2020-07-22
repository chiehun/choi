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
	/** database 관련 상수 선언 **/
	// 1. mySQL 드라이버 이름
	public final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	// 2. mySQL Server URL
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	// 3. mySQL Admin ID
	public final String ADMIN_ID = "root";
	// 3. mySQL Admin Password
	public final String ADMIN_PW = "1234";

	/** database 관련 객체 선언 **/
	// 데이터 베이스 접속
	public Connection conn = null;

	// 2. query 실행 객체
	public Statement stmt = null;
	public PreparedStatement pstmt = null;// (?)
	// 3. selcet 결과 저장 객체
	public ResultSet rs = null;
	// 4. insert/ delete/ update 결과 저장 변수
	int r = 0;

	/** 그외 필요한 객체 변수 선언 **/
	public String db_name = null;

	public DateBaseClass() {
	}// 기본 생성자

	public DateBaseClass(String db_name) { // main()으로 부터 DB이름 전달 받는 생성자
		this.db_name = db_name;
	}

	/** 1. mySQL server에 접속하는 메서드 선언 **/
	public void connet_db() {
		// 1. mySQL 드라이버 로드
		try {
			Class.forName(this.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("errr" + e.getMessage());
		}
		// 2. 사용할 데이터베이스에 접속
		try {
			String url = this.DB_URL + this.db_name;
			this.conn = DriverManager.getConnection(url, this.ADMIN_ID, this.ADMIN_PW);
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "errr");
		} // connect_db END
			// 3.

	}

	/** 2. table의 전체 레코드 조회 메서드 선언 **/
	public void selectAll() {// 수정//
		// 1. query 생성
		String query = "select * from member";
		try {
			// 2. stmtment 객체 생성
			this.stmt = this.conn.createStatement();

			// 3. query 실행
			this.rs = this.stmt.executeQuery(query);

			// 4. ResultSet 객체 내부 데이터 조회
			
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
		// 1. query 선언
		String query = "select count (*) from member";
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			this.rs.next();
			// System.out.println();
		} catch (SQLException e) {
			System.out.println("STATEMENT ERR" + e.getMessage());
		} finally {
			try { // 자원 해제 try => finally / try => catch() => finally
				this.rs.close();
				this.stmt.close();
			} catch (SQLException e) {
				System.out.println("select close err" + e.getMessage());
			}
		}
	}

	// 4 . 중복 아이디 확인 메서드 선언
	public void duplicateID(String id) {
		// 1. query 선언
		// member 테이블로 부터 전달된 id가 있는지 확인 후, 해당 id 리스트를 반환
		String query = "select id from member where id =?";
		try {
			this.pstmt = conn.prepareStatement(query);
			this.pstmt.setString(1, id); // 첫 번째 ? 에 전달받은 매개 변수 값을 전달.
			this.rs = this.pstmt.executeQuery(); // 실행시 query 없음
			if (rs.next()) {
				System.out.println("중복된 아이디 입니다");
			} else {
				System.out.println("사용 가능한 아이디 입니다");
			}
		} catch (SQLException e) {
			System.out.println("duplicateID() ERR :" + e.getMessage());
		} finally {
			this.userClose(this.rs, this.pstmt);
		}
	}// duplicateID end

	// 5.
	public void InsertTable(String id, String pw) {
		// 1. query 선언

		String query = "insert into member (id, pw) values(?, ?)";// ? 변수

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.r = this.pstmt.executeUpdate();
			if (r > 0) {
				System.out.println("성공적으로 삽입 되었습니다");
			} else {
				System.out.println("삽입 실패하였습니다");
			}
		} catch (SQLException e) {
			System.out.println("InsertTable() err" + e.getMessage());
		} finally {
			this.userClose(this.pstmt);
				}
	}

	// 6 no 필드값을 이용하여 id, pw 필드의 값을 수정하는 메서드 선언
	public void updateTable(String id, String pw, int no) {
		// 1. query 선언
		String query = "update member set id=?, pw=? where no=?" ;
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.pstmt.setInt(3, no);
			this.r = this.pstmt.executeUpdate();
			if (r > 0) {
				System.out.println("수정성공");
			} else {
				System.out.println("수정 실패");// 업데이트 할때는 업데이트가 잘 되었는지 확인하기 위해서 확인 코드를 넣어준다
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
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패!");
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
	
	/**각 자원들을 해제하는 메서드 OVERLOADING**/
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