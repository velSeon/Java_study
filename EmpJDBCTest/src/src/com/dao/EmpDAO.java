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
	public ArrayList<EmpDTO> selectAllEmp(Connection con){
		//select 후 jdbcTemplate 이용 close
		return list;
	}
	//사원번호로 찾기
	public EmpDTO selectDetailEmp(Connection con, String eno) throws DataNotFoundException{
		//select 후 jdbcTemplate 이용 close
	}
	public void empDelete(Connection con, String empno) throws DataNotFoundException{
		//delte 후 jdbcTemplate 이용 close
	}
}
