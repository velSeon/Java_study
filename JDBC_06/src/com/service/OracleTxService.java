package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";

	OracleTxDAO dao;

	public OracleTxService() throws Exception {
		//드라이버 로딩
		//dao생성	
		dao = new OracleTxDAO();
		try {
			Class.forName(driver);
					
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
	}// end OracleDAO

	public ArrayList<Dept> select() throws SQLException {
		//db연결
		//selec호출 - con을 인자로 넘김.
		//connection 끊기
		//메인으로 결과 리턴
		Connection con = null;

//		PreparedStatement pstmt = null;
		ArrayList<Dept> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);		
			list = dao.select(con);	//select 에 넘겨줌
			
		} finally {
			if(con != null)con.close();
		}
		
		return list;
	}// end select

	public void insert(Dept xx) throws Exception {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.insert(con, xx);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(con != null)con.close();
		} 		
	}// end insert

	
	public void delete(int xx) throws Exception {		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.delete(con, xx);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(con != null)con.close();
		}
		
	}

	public void update(Dept xx2)throws Exception {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.update(con, xx2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(con != null)con.close();
		}
	

	}//end deletes
	
	public void insertDelete(Dept dept,int i) throws Exception {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			//기본적으로 자동 commit됨  con.setAutocommit(false)//con.setAutoCommet(true) true가 default됨.
			//insert와 delete를 하나의 tx으로 묶음 tx의 시작
			con.setAutoCommit(false);
			dao.insert(con, dept);
			dao.delete(con, i);
			con.commit();//tx완료시			
		}catch(SQLException e) {
			System.out.println("rollback실행");
			con.rollback();//문제 발생 시 
			System.out.println(e.getMessage());
		}finally{
			try {
			if(con != null)con.close();
		}catch(SQLException e) {
	
			System.out.println(e.getMessage());
		}
	
		}}
}



