package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO_emp;
import com.dto.Emp;

public class OracleMyBatisService_emp {
	
	OracleMybatisDAO_emp dao;
	
	public OracleMyBatisService_emp() {
		dao = new OracleMybatisDAO_emp();
	}
	public List<Emp> select(){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Emp> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
	}
	
	public Emp selectNo(int empno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		Emp emp = null;
		try {
			emp = dao.selectNo(session, empno);
		} finally {
			session.close();
		}
		return emp;
	}
	
	public void update(Emp emp) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		
		try {
			dao.update(session, emp);
			session.commit();
		} finally {
			session.close();
		}
		
	}
	
	public void delete(int empno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.delete(session, empno);
			session.commit();
		} finally {
			session.close();
		}
		
	}
}
