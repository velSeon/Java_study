package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		//<select id="selectAll"
		List<Dept>	list= session.selectList("selectAll"); 
		return list;
	}
	
//	public List<Dept> selectBydeptno(SqlSession session) {
//		//<select id="selectAll"
//		List<Dept> list= session.selectList("selectBydeptno");
//		return list;
//	}

	public Dept selectBydeptno(SqlSession session) {
		//<select id="selectAll"
		Dept dept= session.selectOne("selectBydeptno");
		return dept;
	}
	
	
	public Dept selectByDeptnoUse(SqlSession session, int deptno) {
		Dept dept = session.selectOne("selectByDeptnoUse",deptno);
		return dept;
	}
}
