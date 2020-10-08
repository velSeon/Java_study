import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	public JDBC_Method_divide_Test() {
		//드라이버 로딩 
		//connection 연결
		try {
			Class.forName(driver);
			System.out.println("로딩성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		
	}		 
	
	public String deptAdata(int deptno) {
		//deptno를 select 하기 위한 sql문 작성
		// 한부서의 정보를 string으로 리턴 
		String data = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql="select deptno from dept where deptno =?";
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1,	deptno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				data = deptno1+"  " + dname +"  "+ loc;
			}
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
		return data;
	}
		
	public int delAdata(int deptno) {
		//부서번호를 가지고 부서 삭제 후 처리한 레코드 갯수 리턴
		int x = 0;
		
		try {	
			con = DriverManager.getConnection(url, userid, passwd);
			String sql= "delete from dept where deptno=?";
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			 x= pstmt.executeUpdate();		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return x;	
	}
	public static void main(String[] args) {
	   //객체생성
		//deptAdata 호출 검색 deptno전송 검색 결과 문자열로 받아서 출력
		JDBC_Method_divide_Test test= new JDBC_Method_divide_Test();
		System.out.println(test.deptAdata(90));
		System.out.println(test.delAdata(90));

	}

}
