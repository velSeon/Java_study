
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test {

	public static void main(String[] args) {
		//0. oracle_jar파일 buildPath에추가
		//1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";//6)j.jar파일의 api파일 로딩
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd="tiger";
		
		//2. 드라이버 생성
		Connection con = null;
		//Connetcion con = null;//db connect 객체
		//PreparedStatement pstmt = null;
		Statement stmt = null;//connect를 이용해 sql명령을 실행하는 객체
		ResultSet rs = null; //sql실행 후 select결과를 저장하는 객체			
		
		try { 
			Class.forName(driver);//1. 드라이버 로딩
			System.out.println("드라이버 로딩 성공");
		//2. 오라클 연결( Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("접속 성공");
		//3. sql 작성
		String sql="select deptno, dname, loc from dept"; // ;제거		
		
		//4. SQL 준비=>Statement, PreparedStatement, CallableStatment(PL/SQL)
		//connetcion에서 명령을 실행해줄 Statiement객체를 하나 얻어옴
		stmt = con.createStatement();
			
		//5.Statement를 이용해 실행 select-executeQuery(),DML-executeUpdate()
		rs = stmt.executeQuery(sql);//Select 결과를 ResultSet으로 받음.
		while(rs.next()) { //한레코드의 자료를 컬럼으로 접근 출력
			int deptno = rs.getInt("deptno"); //number값을 정수로 주면서 column이름을 줌.
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno +"\t"+dname+"\t"+loc);
		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//6. 자원반납 반대순서로 실행 					
	}//end main
}
// end class
