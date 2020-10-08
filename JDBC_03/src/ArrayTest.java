import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArrayTest {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	public ArrayTest() {
		try {
			Class.forName(driver);
			System.out.println("로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<String> getdeptAdata(int deptno) {
		ArrayList<String>list = new ArrayList<String>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql ="select deptno from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String result ="";
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);	
				result = deptno1 + "\t"+ dname1 + "\t"+ loc1;
				list.add(result);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
		return list;
	}
	
	public ArrayList<String> getdeptAdata(int deptno) {
		ArrayList<String>list = new ArrayList<String>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql ="select deptno from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String result ="";
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);	
				result = deptno1 + "\t"+ dname1 + "\t"+ loc1;
				list.add(result);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
		return list;
	}
	public ArrayList<String> searchDeptByName(String dname) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from dept where dname =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String result = "";
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);	
				result = deptno1 + "\t"+ dname1 + "\t"+ loc1;
				list.add(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<DeptDTO> getAllDept() {
	ArrayList<DeptDTO>list = new ArrayList<DeptDTO>();
	
	try {
		con = DriverManager.getConnection(url,userid,passwd);
		String sql = "select * from dept";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			DeptDTO dept = new DeptDTO();
			dept.setDeptno(rs.getInt(1));
			dept.setDname(rs.getString(2));
			dept.setLoc(rs.getString(3));
			list.add(dept);
			
//			int deptno1 = rs.getInt(1);			
//			String dname1 = rs.getString(2);
//			String loc1 = rs.getString(3);	
//			result = deptno1 + "\t"+ dname1 + "\t"+ loc1;
//			list.add(result);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if( rs != null) rs.close();
			if( pstmt != null) pstmt.close();
			if( con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return list;
}
	
	public ArrayList<String> getAllDept() {
		ArrayList<String>list = new ArrayList<String>();
		
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select * from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String result ="";
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);	
				result = deptno1 + "\t"+ dname1 + "\t"+ loc1;
				list.add(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		ArrayTest test= new ArrayTest();
		
		ArrayList<String> list = test.getAllDept();
//		ArrayList<String> list = test.searchDeptByName("개발");
//		ArrayList<String> list = test.getdeptAdata(50);
		for (String x : list) {
			System.out.println(x);
		}

		
		ArrayList<DeptDTO> list = test.getAllDept();
		for (DeptDTO deptDTO : list) {
			System.out.println(deptDTO.getDname());
		}

		
	}

}
