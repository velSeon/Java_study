import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "test";
		String passwd="test";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			
			String sql = "select p.pdname, p.pdsubname,f.facname, s.stoname, s.stamount  \r\n" + 
					"from product p join factory f using(factno) join store s using(pdno)\r\n" + 
					"where f.facloc = 'SEOUL' and (s.stamount=0 or s.stamount=null)";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("제품카테고리 \t 제품명 \t 공장명\t  판매점명 \t 판매점재고수량");
			System.out.println("=============");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"    \t"+rs.getString(3)+"\t"+
				rs.getString(4)+"\t"+rs.getInt(5));
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
