package test01;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	
	public JDBC_Method_divide_Test() {
		try {
			Class.forName(driver);
			System.out.println("로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	public String getAllDept(){
		//부서전체 select 
		//결과를 메인으로 리턴 메인에서 전체 데이터 출력 
		
		String result = "";
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			int deptno = 0;
			String dname =null;
			String loc =null;
			
			String sql = "select * from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);
				System.out.println(deptno1 + "\t"+ dname1 + "\t"+ loc1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	public int insertDept(String dname, String loc, int deptno){
		//부서하나 추가후 
		//insert 결과 갯수 리턴
		int result = 0;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql="insert into dept(dname, loc, deptno)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			
			result = pstmt.executeUpdate();	
			System.out.println("실행된 레코드 갯수:"+result);
			
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null)rs.close();
				if( pstmt != null)pstmt.close();
				if( con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	return result;
		
	}
	
	public int insertDept(DeptDTO dept){
		int result = 0;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql="insert into dept(dname, loc, deptno)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());			
			result = pstmt.executeUpdate();	
			System.out.println("실행된 레코드 갯수:"+result);
			
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null)rs.close();
				if( pstmt != null)pstmt.close();
				if( con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	return result;
		
	}
	
	public static void main(String[] args) {
		
		JDBC_Method_divide_Test test= new JDBC_Method_divide_Test();

		test.insertDept(new DeptDTO(88,"심사","서울"));
}}
