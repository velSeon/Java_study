package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMybatisDAO dao;
	
	public OracleMyBatisService() {
		dao = new OracleMybatisDAO();
	}
	
	public List<Dept> select() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Dept> list = null;
		 
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
		}
			
	public void insert(Dept dept) {
		//<select id="selectAll"
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			dao.insert(session, dept);
		} finally {
			session.close();
			
		}
		
		
	}
	}// end class



