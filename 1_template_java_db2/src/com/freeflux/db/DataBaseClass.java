package com.freeflux.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.freeflux.util.ChangeEncoding;

public class DataBaseClass {
	/** 상수 선언 **/
	public final String DRIVER = "com.mysql.jdbc.Driver"; // 드라이버 명
	// 드라이버 명은 제품마다 다름
	// 해당 제품 사이트에서 제공
	public final String DBURL = "jdbc:mysql://localhost:3306/"; // 기본 URL
	// localhost 의 ip : 127.0.0.1 ( 추후 클라이언트 주소로 변경)
	// 3307 : mySQL의 데이터 입출력 지원 포트번호
	// 위의 포트번호는 제품마다 다름 !!(오라클은 8080이 기본 포트 번호)

	public final String DBID = "root"; // 관리자 ID
	// mySQL 5.1 은 "root"로 고정
	// 오라클에서는 사용자 계정( 즉 DB명) 으로 변경됨.
	// 참고 : 소규모 업체는 APM을 주로 사용 (Apache/ PHP/ MySQL)

	/** DB 관련 객체 **/
	// java.sql 패키지 내의 클래스 들..
	public String dbname = null; // 사용할 데이터 베이스명
	public Connection conn = null; // 최종 접속 객체
	public Statement stmt = null; // 전체 조회 select * from~
	public PreparedStatement pstmt = null; // 테이블에 변수로 데이터 전달
	public ResultSet rs = null; // select의 결과 객체 저장
	public int result = 0; // insert/update/delete 결과 저장

	public DataBaseClass() {
	}

	/** 드라이버 로드 및 데이터베이스 접속 **/
	public void connectMYSQL(String db_name) {
		this.dbname = db_name;
		String url = this.DBURL + this.dbname;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// "com.mysql.jdbc.Driver" : 패키지 명
			// Driver : Driver.class
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver err : " + e.getMessage());
			// getConnection (" 접속 URL+DB명', " 관리자 ID", "관리자 PW")

		}
		try {
			this.conn = DriverManager.getConnection(url, this.DBID, "1234");
			// getConnection()sms db명이 null아닌 이상,
			// db명이 없어도 접속에 성공할 수 있기 때문에 오류 발생 안함!!
			// 단, db명이 있을 경우, 즉, 잘못 입력했을 경우에는 오류 발생!!
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection errr" + e.getMessage());
		}

	}

	/** 조회 메서드 (전체 조회 : select * from 테이블 명) **/

	public void selectAll(String table_name) {
		String query = "select sum(sale *24), max(sale), min(sale) from " + table_name + " where sale>200";// +" order
																											// by job
																											// asc limit
																											// 0,5";//asc
																											// 오름차순정렬
		try {
			this.stmt = this.conn.createStatement();
			// createStatement()는 객체 생성시, query 문을 갖지 못함!!!
			this.rs = this.stmt.executeQuery(query);
			this.rs.next();
			System.out.print(rs.getInt(1) + " : ");
			System.out.print(rs.getInt(2) + " : ");
			System.out.println(rs.getInt(3));
			/**
			 * while (rs.next()) { String name = rs.getString("empName"); String job =
			 * rs.getString("job");
			 * 
			 * System.out.println(ChangeEncoding.toUnicode(name));// 한글로 인코딩 한값
			 * System.out.println(ChangeEncoding.toUnicode(job)); //
			 * System.out.println(rs.getString("empName")); }
			 **/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("selectAll() ERR : " + e.getMessage());
		}
	}

	/** 테이블에 데이터 추가 (삽입)하는 메서드 **/
	public void insertRecord() {
		// insert into employee(empNo, empName, job, mgr, hireDate, sale, commission,
		// deptNo)
		// values (1001, '김사랑', '사원', 13, '2007-03-01', 300, 0, 20);
		// ? ? ? ? ? ? ? ?
		// PRI key 때는 중복값이 허용되지 않는다
		// 자동으로 증가하는 구문은 사용할때
		String query = "insert into employee (empNo, empName, job, mgr, hireDate, sale, commission, deptNo)";
		query = query + " values (?, ?, ?, ?, ?, ?, ?, ?)";
		// empNO SMS primary key 이기 때문에 중복값이 추가 될 수 없다!!!

		try {
			this.pstmt = this.conn.prepareStatement(query);
			// preparStatement()는 객체 생성시, query 문을 먼저 전달해야 한다.

			// query문 내부에 ? 가 있을 경우.
			// 반드시 ?에 해당하는 값을 설정
			// 여러 개의 ?가 있을 경우 ?는 1퉈 지정.....
			// ?의 갯수보다 많은 값 또는 적은 값을 설정할 경우 오류 발생!!
			// 또한 해당 필드와 타입이 맞지 않을 경우에도 오류 발생!!
			this.pstmt.setInt(1, 1016); //
			this.pstmt.setString(2, ChangeEncoding.toLatin("최훈"));
			this.pstmt.setString(3, ChangeEncoding.toLatin("개발자"));
			this.pstmt.setInt(4, 12);
			this.pstmt.setString(5, "2020-07-21");
			this.pstmt.setInt(6, 100);
			this.pstmt.setInt(7, 0);
			this.pstmt.setInt(8, 20);

			this.result = this.pstmt.executeUpdate();
			// 객체 생성시 미리 query 문을 전달했지 때문에
			// 실행시 query 문 전달 하지 않음!!!
			// executeUpdate()는 실행후 결과 값을 정수로 반환
			// 실행한 내용이 없을 경우에는 0을 반환..
			// 결과 값을 이용하면 실행 여부를 확인할 수 있음!
			System.out.println(this.result + "개가 되었습니다");

		} catch (SQLException e) {
			System.out.println("insertRecord err" + e.getMessage());
		}
	}

	public void searchWord(String table_name) {
		String query = "select empName, job from ";
		query = query + table_name + " where empName like CONCAT('%', ?, '%')";

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("이"));
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
			System.out.println(e.getMessage() + "인코딩 실패");
		}

	}

	public void p1(String table_name) {
		String query = "select empName, sale, hireDate from employee";
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("empName");
				// 한글로 인코딩 한값
				int temp = 0;
				temp = rs.getInt("sale");

				String a = rs.getString("hireDate");
				System.out.println(ChangeEncoding.toUnicode(name) + "  :  " + temp + " : " + a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + "인코딩 실패");
		}
		}

	public void p3(String table_name) {
		//select * from member where sex='M' and score>30;( 성별이 남자이면서 점수가 30이상인사람)
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
			System.out.println(e.getMessage()+" 인코딩 실패");
		}
		
	}

	public void p4(String table_name) {
		//empNo, empName, job, mgr, hireDate, sale, commission, deptNo
		String query = "select empNo, empName, sale from ";
		query = query + table_name + " where empName like CONCAT('%', ?, '%')";
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("오"));
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
			System.out.println(e.getMessage() + "인코딩 실패");
		}

	}

	public void p5(String table_name) {
	}
	
		
	}

