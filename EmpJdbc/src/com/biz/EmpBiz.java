package com.biz;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {//service 클래스 /con만들지 않고

	EmpDAO dao;
	
	public EmpBiz() {
		//dao생성
		dao = new EmpDAO();
				
	}
	public ArrayList<EmpDTO> selectAllEmp() throws Exception{
		Connection con = JdbcTemplate.getConnection();
		ArrayList<EmpDTO> list =dao.selectAllEmp(con);
		JdbcTemplate.close(con);
		// JdbcTemplate.getConnection()에서 con얻기
		//dao.selectAllEmp(con); 호출 conn전달
		//dbcTemplate 이용 close(con)으로 컨넥션 끊기 / public static void close(Connection conn)
//		Connection con = null;
//		PreparedStatement pstmt= null;
//		ResultSet rset = null;
//		ArrayList<EmpDTO> list = null;
//		try {
//			
//			
//		
//		}finally {
//		
//			try {
//				
//				
//				JdbcTemplate.close(pstmt);
//				JdbcTemplate.close(rset);
//			
//			} catch (Exception e) {
//				
//				e.printStackTrace();
//				
//			}
//		}
	
		return list;
	}
	public EmpDTO selectDetailEmp(String i) throws DataNotFoundException{
	// JdbcTemplate.getConnection()에서 con 얻기
		//dao.selectDetailEmp(con); 호출
		//dbcTemplate 이용 close
		Connection con = null;
		EmpDTO dto = null;
		try {
			con = JdbcTemplate.getConnection();
			dto =dao.selectDetailEmp(con,i);
			JdbcTemplate.close(con);
			return dto;
		} catch (Exception e) {
			JdbcTemplate.rollback(con);
			System.out.println("rollback");
		}finally {
			JdbcTemplate.close(con);
			return dto;
		}
		
		
		
		
	}
	public void empUpdate( EmpDTO empDTO) throws DataNotFoundException{
		Connection con = null;
		try {
			con = JdbcTemplate.getConnection();
			dao.empUpdate(con, empDTO);
			JdbcTemplate.commit(con);
		} catch (Exception e) {
			JdbcTemplate.rollback(con);
			System.out.println("rollback");
		}finally {
			
		}
		
		
	}
	
	public void empDelete(String empno) throws Exception{
		Connection con = null;
		try {			
			con = JdbcTemplate.getConnection();
			dao.empDelete(con, empno);
			JdbcTemplate.commit(con);
			
		} catch (Exception e) {
			JdbcTemplate.rollback(con);
			System.out.println("rollback");
		}finally {
			JdbcTemplate.close(con);
		}
		
	}
}
