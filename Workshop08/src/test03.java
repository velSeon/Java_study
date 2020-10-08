import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test03 {

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
			String sql = "update DISCARDED_PRODUCT set DISCARDED_date = sysdate ";
			
			pstmt = con.prepareStatement(sql);
			int num = pstmt.executeUpdate();
			System.out.println("삽입된 행 갯수는 "+num);
			
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
