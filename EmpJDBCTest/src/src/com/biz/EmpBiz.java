package com.biz;

import java.sql.Connection;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {

	EmpDAO dao;
	
	public EmpBiz() {
		//dao생성
	}
	public ArrayList<EmpDTO> selectAllEmp(){
		// JdbcTemplate.getConnection()에서 con 얻기
		//dao.selectAllEmp(con); 호출
		//dbcTemplate 이용 close
		return null;
	}
	public EmpDTO selectDetailEmp( String eno) throws DataNotFoundException{
	// JdbcTemplate.getConnection()에서 con 얻기
		//dao.selectDetailEmp(con); 호출
		//dbcTemplate 이용 close
		return null;
	}
	public void empUpdate( EmpDTO empDTO) throws DataNotFoundException{
		
	}
	public void empDelete( String empno) throws DataNotFoundException{
	
	}
}
