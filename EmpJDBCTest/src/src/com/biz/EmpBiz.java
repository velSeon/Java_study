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
		//dao����
	}
	public ArrayList<EmpDTO> selectAllEmp(){
		// JdbcTemplate.getConnection()���� con ���
		//dao.selectAllEmp(con); ȣ��
		//dbcTemplate �̿� close
		return null;
	}
	public EmpDTO selectDetailEmp( String eno) throws DataNotFoundException{
	// JdbcTemplate.getConnection()���� con ���
		//dao.selectDetailEmp(con); ȣ��
		//dbcTemplate �̿� close
		return null;
	}
	public void empUpdate( EmpDTO empDTO) throws DataNotFoundException{
		
	}
	public void empDelete( String empno) throws DataNotFoundException{
	
	}
}
