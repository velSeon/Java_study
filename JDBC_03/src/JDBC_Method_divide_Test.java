import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	public JDBC_Method_divide_Test() {
		try {
			Class.forName(driver);
			System.out.println("로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String search(String loc, String dname) {
	//지역만 넘어온 경우 지역만 검색 결과 리턴
	//이름만 넘오온 경우 이름만 검색 결과 리턴
	//이름, 지역이 넘어온 경우 두 가지를 이용 검색 결과 리턴
	//sql 하나로 result set 하나. 지역이름, null, or null, 지역이름.
		String result = "";
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql="select * from dept where ";
			if(dname != null && loc == null) {
				sql += "dname = ?";	
				pstmt = con.prepareStatement(sql);			
				pstmt.setString(1, dname);
				
				
			}if(loc != null && dname == null) {
				sql += "loc =?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, loc);
				
				
				
			}if(loc != null && dname !=null ) {
				sql += " loc =? and dname = ? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, loc);
				pstmt.setString(2, dname);
				
				
			}
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);
				result = deptno1+"  " + dname1 +"  "+ loc1;
				System.out.println(result);
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
		}}
		return result;
	}
	public String getAllDept(){
		//부서전체 select 
		//결과를 메인으로 리턴 메인에서 전체 데이터 출력 
		
		String result = "";
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			int deptno = 0;
			String dname =null;
			String loc =null;
			
			String sql = "select * from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc1 = rs.getString(3);
				System.out.println(deptno1 + "\t"+ dname1 + "\t"+ loc1);
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
		return result;
	}
	public  String searchDeptByLoc(String loc){
		//주소로 select 
		//검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력 
		 String sql = "select * from dept where loc =?";
		 String result = "";
		 try {
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, loc);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt(1) + "   "+ rs.getString(2)+ "    "+rs.getString(3);
				System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		 return result;
	}
	
	public  String searchDeptByName(String dname){
		//부서이름으로로 select 
		//검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력 
		//한부서당 한줄씩,,, 여러개 결과 나오면,,collection에 담아서 메인으로 리턴할지
		//String 한뒤 ArrayList로도 시도해보기
		String sql = "select * from dept where dname =?";
		String result ="";
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt(1) + "   "+ rs.getString(2)+ "    "+rs.getString(3);
				System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;}
	public ArrayList<String> searchDeptByName(String dname) {	
		ArrayList<String> list= new ArrayList<String>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept where ";
			sql = sql + "dname =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dname);			
			rs = pstmt.executeQuery();			
			while (rs.next()) {				

				String addResult= "";
				addResult += rs.getInt(1);
				addResult += rs.getString(2);
				addResult += rs.getString(3);				
				list.add(addResult);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}finally {
			
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
		
		return list;
	}
	
		List<String> data = new ArrayList<String>();
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select * from dept where dname =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname1 = rs.getString(2);
				String loc = rs.getString(3);
				data.add(dname1);
				data.add(loc);												
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
	
	public int updateDept(String dname, String loc, int deptno){
		//부서번호로 dname, loc업데이트 후 
		//업데이트 결과 갯수 리턴
	 int result = 0;
	 try {
		con = DriverManager.getConnection(url,userid,passwd);
		String sql = "update dept set dname =? , loc=? where deptno =?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dname);
		pstmt.setString(2, loc);
		pstmt.setInt(3,deptno);
		
		result = pstmt.executeUpdate();
		System.out.println("실행된 레코드 갯수:" +result);
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
//			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 return result;
	}
		
	
	public int insertDept(String dname, String loc, int deptno){
		//부서하나 추가후 
		//insert 결과 갯수 리턴
		int result = 0;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql="insert into dept(dname, loc, deptno)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			
			result = pstmt.executeUpdate();	
			System.out.println("실행된 레코드 갯수:"+result);
			
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null)rs.close();
				if( pstmt != null)pstmt.close();
				if( con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	return result;
		
	}
	
	public String getdeptAdata(int deptno) {
		//부서번호로 select 
		//검색 결과가 없을 경우 사용자 정의 Exception 발생(RecordNotFoundException-메세지
		//찾는 부서 번호가 없습니다.
		//검색한 내용을 문자열로 리턴
		String data = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select deptno from dept where deptno = ?";
			pstmt = con.prepareCall(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				data = deptno1+"  " + dname +"  "+ loc;					
			}
		} catch (SQLException e) {
			System.out.println("찾는 부서 번호가 없습니다.");
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return data;
			}
	public int updateDept(DeptDTO dept){

 int result = 0;
 try {
	con = DriverManager.getConnection(url,userid,passwd);
	String sql = "update dept set dname =? , loc=? where deptno =?";
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, dept.getDname());
	pstmt.setString(2, dept.getLoc());
	pstmt.setInt(3,dept.getDeptno());
	
	result = pstmt.executeUpdate();
	System.out.println("실행된 레코드 갯수:" +result);
	
} catch (SQLException e) {
	e.printStackTrace();
}finally {
	try {
//		rs.close();
		pstmt.close();
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
 return result;
}
	public int insertDept(DeptDTO dept){
		int result = 0;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql="insert into dept(dname, loc, deptno)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());			
			result = pstmt.executeUpdate();	
			System.out.println("실행된 레코드 갯수:"+result);
			
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null)rs.close();
				if( pstmt != null)pstmt.close();
				if( con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	return result;
		
	}
	public DeptDTO getdeptAdata(int deptno) {
		
		DeptDTO dept = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select * from dept where deptno = ?";
			pstmt = con.prepareCall(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dept = new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
				
			}
		} catch (SQLException e) {
			System.out.println("찾는 부서 번호가 없습니다.");
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(pstmt!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return dept;
			}
	
	public static void main(String[] args) {
		
		JDBC_Method_divide_Test test= new JDBC_Method_divide_Test();
//		DeptDTO list = test.getdeptAdata(90);
		System.out.println(test.getdeptAdata(50));
		
		//System.out.println(test.getdeptAdata(15));
		//System.out.println(test.delAdata(90));	}

}}
