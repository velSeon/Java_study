package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		//<select id="selectAll"
		List<Dept> list=  session.selectList("selectAll");
		
		return list;
	}
	
	public void insert(SqlSession session,Dept dept) {
		//<select id="selectAll"
		int num = session.insert("deptInsert",dept);
		System.out.println("추가된 레코드 ===="+ num);
		
		
	}
	

}
