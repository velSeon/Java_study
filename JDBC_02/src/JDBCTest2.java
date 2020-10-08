import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2 {
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
			con = DriverManager.getConnection(url,userid, passwd);
//			String sql = "insert into dept(deptno, dname, loc)"+
//			"values (?,?,?)";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, 14);
//			pstmt.setString(2, "개발");
//			pstmt.setString(3, "서울");
//			int num = pstmt.executeUpdate();
//			System.out.println("실행된 레코드 갯수: "+num);
			
			
			String sql2="select * from dept where deptno=?";
//			pstmt.setInt(1, 12);
			pstmt = con.prepareStatement(sql2);
			rs = pstmt.executeQuery(sql2);
			System.out.println(sql2);
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);
				System.out.println(deptno1+"\t"+dname1+"\t"+loc1);
			}			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
