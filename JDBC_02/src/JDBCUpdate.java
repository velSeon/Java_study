import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUpdate {

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
			
//			String sql = "update dept set dname=?,loc=? where deptno =?";
//			pstmt = con.prepareStatement(sql);
//			
//			pstmt.setString(1, "영업");
//			pstmt.setString(2, "제주");
//			pstmt.setInt(3, 90);
//			
//			int num = pstmt.executeUpdate();
//			System.out.println("실행된 레코드 갯수: "+num);
//			
//			String sql2 = "select * from dept where deptno = ?";
//			pstmt = con.prepareStatement(sql2);
//			pstmt.setInt(1, 90);
//			rs = pstmt.executeQuery();
//			System.out.println(sql2);
//
//			
//			String sql4 = "select deptno from dept where dname in(?,?)";
//			pstmt = con.prepareStatement(sql4);
//			pstmt.setString(1, "영업");
//			pstmt.setString(2, "개발");
//			rs = pstmt.executeQuery();
//			System.out.println(sql4);
			
//			String sql5 = "select * from dept order by deptno";
//			pstmt = con.prepareStatement(sql5);
//			rs = pstmt.executeQuery();
//			System.out.println(sql5);
			
			
			
//			String sql7 = "select loc from dept where deptno >= 20";
//			pstmt = con.prepareStatement(sql7);			
//			rs = pstmt.executeQuery();
//			System.out.println(sql7);	
			
//			String sql8 = "select dname, loc from dept where dname like 'A%'";
//			pstmt = con.prepareStatement(sql8);			
//			rs = pstmt.executeQuery();
//			System.out.println(sql8);
			
//			String sql9 = "select dname from dept where deptno = (select max(deptno) from dept)";
//			pstmt = con.prepareStatement(sql9);
//			rs = pstmt.executeQuery();
//			System.out.println(sql9);
			
//			String sql10 ="insert into dept (deptno, dname, loc)" + "values(?,?,?)";
//			pstmt = con.prepareStatement(sql10);
//			pstmt.setInt(1, 99);
//			pstmt.setString(2, "개발");
//			pstmt.setString(3, "서울");
//			rs = pstmt.executeQuery();
//			System.out.println(sql10);
			
//			String sql12 = "update dept set loc = '제주' where deptno =99";
//			pstmt = con.prepareStatement(sql12);
//			rs=pstmt.executeQuery();
//			System.out.println(sql12);
//			int num = pstmt.executeUpdate();
//			System.out.println("실행된 레코드 갯수: "+num);
			
//			String sql11 = "select deptno, loc from dept where deptno =99";
//			pstmt = con.prepareStatement(sql11);
//			rs = pstmt.executeQuery();
//			System.out.println(sql11);
			
			
			
//			while(rs.next()) {
//				int deptno1 = rs.getInt(1);
//				String dname1 = rs.getString(1);
//			String loc1 = rs.getString(2);
//				System.out.println(dname1);
				//+"\t"+dname1+"\t"+loc1
		
//		} 
		}catch (ClassNotFoundException e) {
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
