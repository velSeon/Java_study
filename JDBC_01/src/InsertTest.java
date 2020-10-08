import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";//6)j.jar파일의 api파일 로딩
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd="tiger";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			//4.sql작성
			int deptno=19;
			String deptname = "개발";
			String loc = "서울";
			String sql ="insert into dept (deptno, dname, loc)"+"values ("+deptno+", '"+deptname+"','"+loc+"')";			
			System.out.println(sql);	
			
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);			
			System.out.println("실행된 레코드 갯수:"+result);
			
			String sql2 = "select * from dept";
			System.out.println(sql2);
			rs = stmt.executeQuery(sql2);
			
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);
				System.out.println(deptno1 + "\t"+ dname1 + "\t"+ loc1);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt !=null)stmt.close();
				if(con != null)con.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
