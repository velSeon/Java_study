package ncstest03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class OracelDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	 Connection con  = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	
	 public OracelDAO() {
		 try {
			 Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	public void insertDept(Dept dept) {
	
		 int num = 0;
	 try {
		 
		 con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept(deptno, dname, loc)"+"values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			num = pstmt.executeUpdate();
			System.out.println("추가된 자료의 갯수	"+ num);		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(con != null)con.close();
		} catch (Exception e) {
			e.printStackTrace();
	}
	}
	 
	}
	
//	
}
	

	

