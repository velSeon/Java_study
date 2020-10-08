package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

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
	
	public void insert() {}
	public void update() {}
	public void delete() {}
	
}



