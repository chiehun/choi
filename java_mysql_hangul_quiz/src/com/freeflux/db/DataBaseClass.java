package com.freeflux.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.freeflux.util.ChangeEncoding;
import com.freeflux.util.MethodClass;

public class DataBaseClass {

	public final String DRIVER_NAME="com.mysql.jdbc.Driver";		// 접속할 데이터베이스 드라이버
	public final String DB_URL="jdbc:mysql://localhost:3306/";		// 접속할 데이터베이스 서버 주소
	public final String DB_ADMIN_ID="root";							// 접속할 데이터베이스 관리자 비밀번호
	
	public String db_name=null;  				// 사용할 데이터베이스명
	public String db_admin_pw=null; 			// 접속할 데이터베이스 관리자 비밀번호
	public Connection conn=null;				// 최종 접속 객체
	public Statement stmt=null;					// 전체 조회 select * from ~
	public PreparedStatement pstmt=null;	// 테이블에 변수로 데이터 전달
	public ResultSet rs=null;						// select의 결과 객체 저장
	public int result_update=0;					// insert/update/delete  결과 저장
	
	public DataBaseClass() {
	}
	
	/** 드라이버 로드 및 데이터베이스 접속 메서드 **/
	public void connectMySQL(String db_name, String db_admin_pw) {
		this.db_name=db_name;
		try {
			Class.forName(this.DRIVER_NAME);

			String url=this.DB_URL+this.db_name;
			conn=DriverManager.getConnection(url, this.DB_ADMIN_ID, "1234");
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER LOAD ERR : "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("CONNECTION ERR : "+e.getMessage());
		}
	} // connectMySQL() END
	
	
	/** 조회된 레코드의 필드명들을 추출 메서드 **/
	private String[] getFieldNames(ResultSet rs) { 
		try {
			
			ResultSetMetaData rsmd=rs.getMetaData(); //rs.getMetaData()= resultset() 데이터
			int column_count=rsmd.getColumnCount(); // 반복 시켜야 한다 Coulumn의 개수를 알려 달라
			
			String[] columns=new String[column_count]; // [0], String idx번호는 0부터 시작 //column 1부터
			
			for(int idx=0; idx<columns.length; idx++) {
				columns[idx]=rsmd.getColumnName(idx+1); //getColumnName Column의 이름은 반환시켜주는 
				System.out.println(columns[idx]); //columns 명 확인 메서드
			}
			return columns; // 3개의 필드명을 원래 위치로 돌려 주기 위해서 
		} catch (SQLException e) {
			System.out.println("getColumnNames() ERR : "+e.getMessage());
			return null; //  try 쪽에서 return 하게 되면 catch 쪽에서도 return을 줘야 한다 리
		}
	}
	/** 1. 사원의 이름과 급여와 입사일자만을 출력하기 **/
	// select empName, sale, hiredate from employee;
	public String quiz1(String table_name) {
		String query="select empName, sale, hiredate from ";// 한칸 띄어 쓰기 infom 에러
		query=query+table_name;
		
		try {
			this.stmt=this.conn.createStatement(); //메서드 내부에 query 넣지 않는데 실행 할때 query를 받는다
			this.rs=this.stmt.executeQuery(query); // 데이터 값을 반환 시켜주는 값이 resultset 데이터 타입
			
			String[] fieldNames=this.getFieldNames(this.rs);// resultset 메서드가 가지고 있는 값을 전달받는다 
			//getFieldNames= columns 데이터를 받는다
			String resultTags=MethodClass.makeTagsQ1(rs, fieldNames); // 제목 부문 //empNmae. sale , 
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz1() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.stmt);
		}
		return null;		
	} // quiz1() END
	
	
	/** 2. 직급이 중복되지 않고 한 번씩 나열하기 **/
	// select distinct job from employee; distinct 지정한 필드에 대한 중복값을 제거해주는 
	public String quiz2(String table_name) {
		String query="select distinct job hiredate from ";
		query=query+table_name;
		
		try {
			this.stmt=this.conn.createStatement();
			this.rs=this.stmt.executeQuery(query);
			
			String[] fieldNames=this.getFieldNames(this.rs);
			
			String resultTags=MethodClass.makeTagsQ2(rs, fieldNames); 
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz2() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.stmt);
		}
		return null;	
	} // quiz2() END
	
	
	/** 3. 급여가 300 이하인 사원의 사원번호, 사원 이름, 급여를 출력하기 **/
	// select empNo, empName, sale from employee where sale<=300;
	public String quiz3(String table_name, int sale) {
		String query="select empNo, empName, sale from ";
		query=query+table_name;
		query=query+"  where sale<=?"; // sale 값이 외부에서 들어 주는 것이 때문에
		
		try {
			this.pstmt=this.conn.prepareStatement(query); // prestatement는 query 문 들어가 있어야 한다 statement는 물음표 못함
			this.pstmt.setInt(1, sale);
			this.rs=this.pstmt.executeQuery();//query 문 넣으면 안된다. 실행 할때 query 문을 가지고 있기 때문이다
			
			String[] fieldNames=this.getFieldNames(this.rs); // 필드 이름 (empName, ~~)
			
			String resultTags=MethodClass.makeTagsQ3(rs, fieldNames);
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz3() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.pstmt);
		}
		return null;	
	} // quiz3() END
	
	
	/** 4. 이름이 “오지호”인 사원의 사원번호, 사원명, 급여를 출력하기 **/
	// select empNo, empName, sale from employee where empName='오지호';
	public String quiz4(String table_name, String emp_name) { // 동일 2인이 있을 수 있다
		String query="select empNo, empName, sale from ";
		query=query+table_name;
		query=query+"  where empName=?";

		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.javaTomySQL(emp_name)); // 한글로 바꾸는 인코딩
			this.rs=this.pstmt.executeQuery();

			String[] fieldNames=this.getFieldNames(this.rs);

			String resultTags=MethodClass.makeTagsQ4(rs, fieldNames);
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz4() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.pstmt);
		}
		return null;	
	} // quiz4() END
	
	
	/** 5. 급여가 250, 300, 500인 사원들의 사원 번호와 사원명과 급여를 검색하기 **/
	// select empNo, empName, sale from employee where sale=250 or sale=300 or sale=500;
	// 또는 
	// select empNo, empName, sale from employee where sale IN (250, 300, 500);
	// mysql 안에 in 함수 오라클 내부에서도 사용( 지정된 값이 있는지 없는지 확인해주는 함수)
	public String quiz5(String table_name, int s1, int s2, int s3) {
		String query="select empNo, empName, sale from ";
		query=query+table_name;
		query=query+"  where sale=? or sale=? or sale=?";

		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setInt(1, s1);
			this.pstmt.setInt(2, s2);
			this.pstmt.setInt(3, s3);
			this.rs=this.pstmt.executeQuery();
			
			String[] fieldNames=this.getFieldNames(this.rs);

			String resultTags=MethodClass.makeTagsQ5(rs, fieldNames);
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz5() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.pstmt);
		}
		return null;	
	} // quiz5() END
	
	
	/** 6. 급여가 250, 300, 500이 아닌 사원들을 검색하기 **/
	// select empNo, empName, sale from employee where sale<>250 and sale<>300 and sale<>500;
	// 또는
	// select empNo, empName, sale from employee where sale not IN (250, 300, 500);
	// ~와 다르다 <>, in ~ 안에 있는 값들을 출력하는 함수 
	public String quiz6(String table_name, int s1, int s2, int s3) {
		String query="select empNo, empName, sale from ";
		query=query+table_name;
		query=query+"  where sale<>? and sale<>? and sale<>?";

		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setInt(1, s1);
			this.pstmt.setInt(2, s2);
			this.pstmt.setInt(3, s3);
			this.rs=this.pstmt.executeQuery();
			
			String[] fieldNames=this.getFieldNames(this.rs);

			String resultTags=MethodClass.makeTagsQ6(rs, fieldNames);
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz6() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.pstmt);
		}
		return null;	
	} // quiz6() END
	
	
	/** 7. LIKE를 사용하여 사원들 중에서 이름이 “김”으로 시작하는 사람과 
	 * 이름 중에 “기”를 포함하는 사원의 사원번호와 사원이름을 출력하기 **/
	// select empNo, empName from employee where empName like '김%' or empName like '%기%';
	// where empName like CONCAT(?, '%') or empName like CONCAT('%', ?, '%')""
	public String quiz7(String table_name, String s1, String s2) {
		String query="select empNo, empName, sale from ";
		query=query+table_name;
		query=query+" where empName like CONCAT(?, '%') or empName like CONCAT('%', ?, '%')";
				// 자바에서  CONCAT으로 연결 시켜주야 한다.
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.javaTomySQL(s1)); //1번째 물음표 s1 =김
			this.pstmt.setString(2, ChangeEncoding.javaTomySQL(s2)); // 2번째 물음표 s2=기
			this.rs=this.pstmt.executeQuery();
			
			String[] fieldNames=this.getFieldNames(this.rs);

			String resultTags=MethodClass.makeTagsQ7(rs, fieldNames);
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz7() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.pstmt);
		}
		return null;	
	} // quiz7() END
	
	
	
	/** 8. 사원 테이블에서 최근 입사한 직원 순으로 사원번호, 사원명, 직급, 입사일 컬럼만 출력하기 **/
	// select empNo, empName, job, hiredate from employee order by hiredate desc;
	// desc 역순 정렬
	public String quiz8(String table_name) {
		String query="select empNo, empName, job, hiredate from ";
		query=query+table_name;
		query=query+" order by hiredate desc";

		try {
			this.stmt=this.conn.createStatement();
			this.rs=this.stmt.executeQuery(query); // 물음표가 없기 때문에 일반 statement 로 처리
			
			String[] fieldNames=this.getFieldNames(this.rs);

			String resultTags=MethodClass.makeTagsQ8(rs, fieldNames);
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz8() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.stmt);
		}
		return null;	
	} // quiz8() END
	
	
	/** 9. 부서 번호가 빠른 사원부터 출력하되 같은 부서내의 사원을 출력할 경우, 
	 * 입사한지 가장 오래된 사원부터 출력하기 **/ 
	// select deptno, empNo, empName, job, hiredate from employee order by deptno asc, hiredate asc;
	public String quiz9(String table_name) {
		String query="select deptno, empNo, empName, job, hiredate from ";
		query=query+table_name;
		query=query+" order by deptno asc, hiredate asc";

		try {
			this.stmt=this.conn.createStatement();
			this.rs=this.stmt.executeQuery(query);
			
			String[] fieldNames=this.getFieldNames(this.rs);

			String resultTags=MethodClass.makeTagsQ9(rs, fieldNames);
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz9() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.stmt);
		}
		return null;	
	} // quiz9() END
	
	
	/** 아래는 상황별 자원 해제 메서드들 선언 OverLoading **/
	public void userClose(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			System.out.println("ResultSet, Statement CLOSE ERR : "+e.getMessage());
		}
	}
	
	public void userClose(ResultSet rs, Statement stmt) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("ResultSet, Statement CLOSE ERR : "+e.getMessage());
		}
	}
	
	public void userClose(ResultSet rs, PreparedStatement pstmt) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("ResultSet, PreparedStatement CLOSE ERR : "+e.getMessage());
		}
	}
	
	public void userClose() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection CLOSE ERR : "+e.getMessage());
		}
	}
	
	public void userClose(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			System.out.println("ResultSet, Statement CLOSE ERR : "+e.getMessage());
		}
	}
	
	public void userClose(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("ResultSet, PreparedStatement CLOSE ERR : "+e.getMessage());
		}
	}
}
