package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dao.OracleDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleService {

	OracleDAO dao;//null값이 기본

	public OracleService() {
		dao = new OracleDAO();
	}
	public ArrayList<Dept> select()throws SQLException {
		ArrayList<Dept> list = dao.select();	
		return list;
	}
	
	public void insert(Dept dept) {
		dao.insert(dept);
	
	}
	public void update (Dept dept) throws RecordNotFoundException {
		dao.update(dept);
	}
	public void delete (int deptno) throws RecordNotFoundException {
		dao.delete(deptno);
	}
	
	public void selectbydeptno(int deptno) throws RecordNotFoundException{
		 dao.selectbydeptno(deptno);
	}
	public ArrayList<Dept> selectByNameLoc(HashMap <String,String> map) throws SQLException {
		ArrayList<Dept> list = dao.selectByNameLoc(map);
		return list;
}
}
