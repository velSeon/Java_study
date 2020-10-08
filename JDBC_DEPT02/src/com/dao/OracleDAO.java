package com.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	public OracleDAO() {
	try {
		Class.forName(driver);
		System.out.println("로딩 성공");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	}//end OracleDAO
	
	public ArrayList<Dept> select()throws SQLException {
		ArrayList<Dept> list = new ArrayList<Dept>();		
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select * from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2)); 
				dept.setLoc(rs.getString(3)); 			
				list.add(dept);
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
	}//end select
	public ArrayList<Dept> selectByNameLoc(HashMap<String,String> map) throws SQLException {
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql="select deptno x, dname, loc from dept where dname =? and loc =?";
			pstmt = con.prepareStatement(sql);
			Dept dept = new Dept();
			pstmt.setString(1, map.get("dname"));
			pstmt.setString(2, map.get("loc"));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				Dept dto = new Dept(deptno, dname, loc);
				list.add(dto);
				System.out.println(list);
			}
		}catch (SQLException e) {
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
		return list;
		}
	public String selectbydeptno(int deptno) throws RecordNotFoundException  {
		String result = "";
		try {
			
			con=DriverManager.getConnection(url,userid,passwd);
			String sql ="select * from dept where deptno =?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,deptno);
			rs = pstmt.executeQuery();	
			while(rs.next()) {
				Dept dept = new Dept();
				result= rs.getInt(1) + "   "+ rs.getString(2)+ "    "+rs.getString(3);
//			result = dept.getDeptno()+" "+dept.getDname()+"  "+dept.getLoc();
				System.out.println(result);
//				if(result == 0) {
//					throw new RecordNotFoundException("자료가 없습니다.");}
//			}
			
		}} catch (Exception e) {
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
	
	public void insert(Dept dept)  {
		int result =0;
		try {
			con= DriverManager.getConnection(url,userid,passwd);
			String sql = "insert into dept(deptno,dname, loc ) "+"values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());			
			result = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수: "+result);
			
			
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
		
	}
	
	
	
		
		
	
	public void update(Dept dept) throws RecordNotFoundException{
	int result =0;
	try {
		con = DriverManager.getConnection(url,userid,passwd);
		String sql = "update dept set dname =?, loc=? where deptno = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dept.getDname());
		pstmt.setString(2, dept.getLoc());
		pstmt.setInt(3, dept.getDeptno());
		result = pstmt.executeUpdate();
		System.out.println("실행된 레코드 갯수: "+ result);
		if(result ==0) {
			throw new RecordNotFoundException("업데이트할 자료가 없습니다.");}
		
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if( rs != null)rs.close();
			if( pstmt != null)pstmt.close();
			if( con != null)con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}}
	
	public void delete(int deptno) throws RecordNotFoundException{
		int result = 0;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "delete from dept where deptno=? ";
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, deptno);
			result = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수: "+ result);
			if(result <= 0) {
				throw new RecordNotFoundException("삭제할 자료가 없습니다.");}
			
		}catch (SQLException e) {
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
	}
}
	



