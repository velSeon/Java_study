package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.print.attribute.standard.PresentationDirection;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxDAO {
	public void update(Connection con,Dept xx)throws RecordNotFoundException {		
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		Dept dept = new Dept();
		try {			
			String sql = "update dept set dname =?, loc=? where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, xx.getDname());
			pstmt.setString(2, xx.getLoc());
			pstmt.setInt(3, xx.getDeptno());
			int result = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수: "+ result);
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
//				if( rs != null)rs.close();
				if( pstmt != null)pstmt.close();
//				if( con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		
	}

	public void delete(Connection con,int i)  {
		int result = 0;
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		Dept dept = new Dept();
		try {
			
			String sql = "del from dept where deptno=? ";
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, i);
			result = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수: "+ result);
			
			
		}catch (SQLException e) {
			try {
				System.out.println("rollback 실행");
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
//				if( rs != null)rs.close();
				if( pstmt != null)pstmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	}
	public void insert(Connection con,Dept xx) {
		int result = 0;
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		Dept dept = new Dept();
		try {			
			String sql = "insert into dept(deptno,dname, loc ) "+"values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, xx.getDeptno());
			pstmt.setString(2, xx.getDname());
			pstmt.setString(3, xx.getLoc());		
			result = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수: "+result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
//				if( rs != null)rs.close();
				if( pstmt != null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
			}
		
	}//end insert
	
	
	
public ArrayList<Dept> select(Connection con)throws SQLException {//con빠지고 service에서 받아서 만들어줌.
	//con사용
	//psts, rs만 close
	
	ArrayList<Dept> list = new ArrayList<Dept>();
	PreparedStatement pstmt = null;	
	ResultSet rs = null;
	String sql = "select deptno, dname, loc from dept";
	pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
			Dept dept = new Dept();
			dept.setDeptno(rs.getInt(1));
			dept.setDname(rs.getString(2)); 
			dept.setLoc(rs.getString(3)); 
			list.add(dept);	
	} 
		
			if( rs != null) rs.close();
			if( pstmt != null) pstmt.close();
		
			
	return list;
	
	}//end select
}
