package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;


public class EmpDAO {
	public ArrayList<EmpDTO> selectAllEmp(Connection con) throws Exception{
		//select 후 psmt, resultset을 jdbcTemplate 넘겨서 close
		
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		String sql = "select empno,ename,job,mgr,to_char(hiredate,'YYYY-MM-DD') hiredate ,"+"sal,comm,deptno from emp order by empno desc";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {			
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			String hiredate = rs.getString("hiredate");
			double sal = rs.getDouble("sal");
			double comm = rs.getDouble("comm");
			int deptno = rs.getInt("deptno");
			
			EmpDTO emp = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			
//			EmpDTO emp = new EmpDTO();
//			emp.setEmpno(rs.getInt(1));
//			emp.setEname(rs.getString(2));
//			emp.setJob(rs.getString(3));
//			emp.setMgr(rs.getInt(4));			
//			emp.setHiredate(rs.getString(5));
//			emp.setSal(rs.getDouble(6));
//			emp.setComm(rs.getDouble(7));
//			emp.setDeptno(rs.getInt(8));
			list.add(emp);
				
		}}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}				
		return list;
	}
	//사원번호로 찾기
	public EmpDTO selectDetailEmp(Connection con, String i) throws DataNotFoundException{
		//select 후 jdbcTemplate 이용 close
		EmpDTO emp = new EmpDTO();
		emp = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select empno,ename,job,mgr,to_char(hiredate,'YYYY-MM-DD') hiredate ,"+"sal,comm,deptno from emp where empno = ? order by empno desc";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(i));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				int empno1 = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");				
				emp = new EmpDTO(empno1, ename, job, mgr, hiredate, sal, comm, deptno);				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return emp;
	}
	
	public void empUpdate(Connection con, EmpDTO empDTO) throws DataNotFoundException{
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql="update emp set job =?,sal =? where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, empDTO.getEmpno());
			pstmt.setString(1, empDTO.getJob());
			pstmt.setDouble(2, empDTO.getSal());
			result = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수: "+ result);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(pstmt);
		}
	}
	
	public void empDelete(Connection con, String empno) throws Exception{
		//delte 후 jdbcTemplate 이용 close
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "delete emp where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(empno));
			result = pstmt.executeUpdate();
			if(result <=0 ) {
				throw new Exception("삭제할 자료가 없습니다.");
			}
			System.out.println("실행된 레코드 갯수: "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {			
			JdbcTemplate.close(pstmt);
		}
		
		
	}
	
}
