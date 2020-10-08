import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test04 {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "test";
		String passwd="test";
		
		Connection con= null;
		ResultSet rs= null;
		PreparedStatement pstmt= null;
		 con.setAutoCommit(false);
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "delete from PRODUCT WHERE FACTNO= (select factno from factory where facname like 'CHANGWON %')";
			
			pstmt = con.prepareStatement(sql);
			int num = pstmt.executeUpdate();
			System.out.println("삭제된 행 갯수는 "+num);
			
		} catch (Exception e) {
			e.printStackTrace();

	}finally {
		
	}try {
		if(pstmt != null)pstmt.close();
		if(con != null)con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

}}
