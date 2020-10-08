import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	public divide_Test() {
		//드라이버 로딩 
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		 
	
	public String getDeptAdata(int deptno) {
		//deptno를 select 하기 위한 sql문 작성
		// 한부서의 정보를 string으로 리턴 
		String sql="select deptno from dept";
		return sql;
	}
	public int delAdata(int deptno) {
		//부서번호를 가지고 부서 삭제 후 처리한 레코드 갯수 리턴 
		return 0;
	}
	public static void main(String[] args) {
	   //객체생성
		//deptAdata 호출 검색 deptno전송 검색 결과 문자열로 받아서 출력

	}

}
