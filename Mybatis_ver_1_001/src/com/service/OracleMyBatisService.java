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
	}// end class

//	public List<Dept> selectBydeptno() {
//		SqlSession session = MySqlSessionFactory.getSession();
//		List<Dept> list = null;
//		
//		try {
//			 list = dao.selectBydeptno(session);
//		} finally {
//			session.close();
//		}
//		return list;
//	}
	public Dept selectBydeptno() {
		SqlSession session = MySqlSessionFactory.getSession();
		Dept dept = null;
		
		try {
			dept = dao.selectBydeptno(session);
		} finally {
			session.close();
		}
		return dept;
	}
	
	public Dept selectByDeptnoUse(int deptno) {
		SqlSession session = MySqlSessionFactory.getSession();
		Dept dept = null;
		try {
			dept = dao.selectByDeptnoUse(session, deptno);
		} finally {
			session.close();
		}
		return dept;
	}
	
}
