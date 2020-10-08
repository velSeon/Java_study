import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test003 {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	public test003() {
		try {
			Class.forName(driver);
			System.out.println("로딩성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public String deptAdata(int deptno) {
		String data = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "Select deptno from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				data = deptno1+"  " + dname +"  "+ loc;
			}
		} catch (SQLException	 e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return data;
		}
	}
	public int delAdata(int deptno) {
		int x= 0;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "delete from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			x=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return x;
	}
	public static void main(String[] args) {
		test003 test = new test003();
		
		System.out.println(test.deptAdata(90));
		System.out.println(test.delAdata(90));
		
		
	}

}
