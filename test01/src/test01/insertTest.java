package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class insertTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";//6)j.jar파일의 api파일 로딩
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd="tiger";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			
			String sql="insert into dept(deptno, dname, loc)"+"values(?,?,?)";
			
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, 89);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "제주");
			
			int num = pstmt.executeUpdate();
			System.out.println(num);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
