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

	public final String DRIVER_NAME="com.mysql.jdbc.Driver";		// ������ �����ͺ��̽� ����̹�
	public final String DB_URL="jdbc:mysql://localhost:3306/";		// ������ �����ͺ��̽� ���� �ּ�
	public final String DB_ADMIN_ID="root";							// ������ �����ͺ��̽� ������ ��й�ȣ
	
	public String db_name=null;  				// ����� �����ͺ��̽���
	public String db_admin_pw=null; 			// ������ �����ͺ��̽� ������ ��й�ȣ
	public Connection conn=null;				// ���� ���� ��ü
	public Statement stmt=null;					// ��ü ��ȸ select * from ~
	public PreparedStatement pstmt=null;	// ���̺� ������ ������ ����
	public ResultSet rs=null;						// select�� ��� ��ü ����
	public int result_update=0;					// insert/update/delete  ��� ����
	
	public DataBaseClass() {
	}
	
	/** ����̹� �ε� �� �����ͺ��̽� ���� �޼��� **/
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
	
	
	/** ��ȸ�� ���ڵ��� �ʵ����� ���� �޼��� **/
	private String[] getFieldNames(ResultSet rs) { 
		try {
			
			ResultSetMetaData rsmd=rs.getMetaData(); //rs.getMetaData()= resultset() ������
			int column_count=rsmd.getColumnCount(); // �ݺ� ���Ѿ� �Ѵ� Coulumn�� ������ �˷� �޶�
			
			String[] columns=new String[column_count]; // [0], String idx��ȣ�� 0���� ���� //column 1����
			
			for(int idx=0; idx<columns.length; idx++) {
				columns[idx]=rsmd.getColumnName(idx+1); //getColumnName Column�� �̸��� ��ȯ�����ִ� 
				System.out.println(columns[idx]); //columns �� Ȯ�� �޼���
			}
			return columns; // 3���� �ʵ���� ���� ��ġ�� ���� �ֱ� ���ؼ� 
		} catch (SQLException e) {
			System.out.println("getColumnNames() ERR : "+e.getMessage());
			return null; //  try �ʿ��� return �ϰ� �Ǹ� catch �ʿ����� return�� ��� �Ѵ� ��
		}
	}
	/** 1. ����� �̸��� �޿��� �Ի����ڸ��� ����ϱ� **/
	// select empName, sale, hiredate from employee;
	public String quiz1(String table_name) {
		String query="select empName, sale, hiredate from ";// ��ĭ ��� ���� infom ����
		query=query+table_name;
		
		try {
			this.stmt=this.conn.createStatement(); //�޼��� ���ο� query ���� �ʴµ� ���� �Ҷ� query�� �޴´�
			this.rs=this.stmt.executeQuery(query); // ������ ���� ��ȯ �����ִ� ���� resultset ������ Ÿ��
			
			String[] fieldNames=this.getFieldNames(this.rs);// resultset �޼��尡 ������ �ִ� ���� ���޹޴´� 
			//getFieldNames= columns �����͸� �޴´�
			String resultTags=MethodClass.makeTagsQ1(rs, fieldNames); // ���� �ι� //empNmae. sale , 
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz1() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.stmt);
		}
		return null;		
	} // quiz1() END
	
	
	/** 2. ������ �ߺ����� �ʰ� �� ���� �����ϱ� **/
	// select distinct job from employee; distinct ������ �ʵ忡 ���� �ߺ����� �������ִ� 
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
	
	
	/** 3. �޿��� 300 ������ ����� �����ȣ, ��� �̸�, �޿��� ����ϱ� **/
	// select empNo, empName, sale from employee where sale<=300;
	public String quiz3(String table_name, int sale) {
		String query="select empNo, empName, sale from ";
		query=query+table_name;
		query=query+"  where sale<=?"; // sale ���� �ܺο��� ��� �ִ� ���� ������
		
		try {
			this.pstmt=this.conn.prepareStatement(query); // prestatement�� query �� �� �־�� �Ѵ� statement�� ����ǥ ����
			this.pstmt.setInt(1, sale);
			this.rs=this.pstmt.executeQuery();//query �� ������ �ȵȴ�. ���� �Ҷ� query ���� ������ �ֱ� �����̴�
			
			String[] fieldNames=this.getFieldNames(this.rs); // �ʵ� �̸� (empName, ~~)
			
			String resultTags=MethodClass.makeTagsQ3(rs, fieldNames);
			return resultTags;
		} catch (SQLException e) {
			System.out.println("quiz3() ERR : "+e.getMessage());
		} finally {
			this.userClose(this.rs, this.pstmt);
		}
		return null;	
	} // quiz3() END
	
	
	/** 4. �̸��� ������ȣ���� ����� �����ȣ, �����, �޿��� ����ϱ� **/
	// select empNo, empName, sale from employee where empName='����ȣ';
	public String quiz4(String table_name, String emp_name) { // ���� 2���� ���� �� �ִ�
		String query="select empNo, empName, sale from ";
		query=query+table_name;
		query=query+"  where empName=?";

		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.javaTomySQL(emp_name)); // �ѱ۷� �ٲٴ� ���ڵ�
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
	
	
	/** 5. �޿��� 250, 300, 500�� ������� ��� ��ȣ�� ������ �޿��� �˻��ϱ� **/
	// select empNo, empName, sale from employee where sale=250 or sale=300 or sale=500;
	// �Ǵ� 
	// select empNo, empName, sale from employee where sale IN (250, 300, 500);
	// mysql �ȿ� in �Լ� ����Ŭ ���ο����� ���( ������ ���� �ִ��� ������ Ȯ�����ִ� �Լ�)
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
	
	
	/** 6. �޿��� 250, 300, 500�� �ƴ� ������� �˻��ϱ� **/
	// select empNo, empName, sale from employee where sale<>250 and sale<>300 and sale<>500;
	// �Ǵ�
	// select empNo, empName, sale from employee where sale not IN (250, 300, 500);
	// ~�� �ٸ��� <>, in ~ �ȿ� �ִ� ������ ����ϴ� �Լ� 
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
	
	
	/** 7. LIKE�� ����Ͽ� ����� �߿��� �̸��� ���衱���� �����ϴ� ����� 
	 * �̸� �߿� ���⡱�� �����ϴ� ����� �����ȣ�� ����̸��� ����ϱ� **/
	// select empNo, empName from employee where empName like '��%' or empName like '%��%';
	// where empName like CONCAT(?, '%') or empName like CONCAT('%', ?, '%')""
	public String quiz7(String table_name, String s1, String s2) {
		String query="select empNo, empName, sale from ";
		query=query+table_name;
		query=query+" where empName like CONCAT(?, '%') or empName like CONCAT('%', ?, '%')";
				// �ڹٿ���  CONCAT���� ���� �����־� �Ѵ�.
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.javaTomySQL(s1)); //1��° ����ǥ s1 =��
			this.pstmt.setString(2, ChangeEncoding.javaTomySQL(s2)); // 2��° ����ǥ s2=��
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
	
	
	
	/** 8. ��� ���̺��� �ֱ� �Ի��� ���� ������ �����ȣ, �����, ����, �Ի��� �÷��� ����ϱ� **/
	// select empNo, empName, job, hiredate from employee order by hiredate desc;
	// desc ���� ����
	public String quiz8(String table_name) {
		String query="select empNo, empName, job, hiredate from ";
		query=query+table_name;
		query=query+" order by hiredate desc";

		try {
			this.stmt=this.conn.createStatement();
			this.rs=this.stmt.executeQuery(query); // ����ǥ�� ���� ������ �Ϲ� statement �� ó��
			
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
	
	
	/** 9. �μ� ��ȣ�� ���� ������� ����ϵ� ���� �μ����� ����� ����� ���, 
	 * �Ի����� ���� ������ ������� ����ϱ� **/ 
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
	
	
	/** �Ʒ��� ��Ȳ�� �ڿ� ���� �޼���� ���� OverLoading **/
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
