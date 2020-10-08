import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test02 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "test";
		String passwd="test";
		Connection con= null;
		ResultSet rs= null;
		PreparedStatement pstmt= null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			String sql ="select pdsubname, pdcost, pdprice from product where pdcost > (select min(pdcost) from product\r\n" + 
					"where pdname = 'TV') and pdcost < (select max(pdcost) from product where pdname = 'CELLPHONE')" ;
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("제품명   제품원가   제품가격");
			System.out.println("==========");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3));
				
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
