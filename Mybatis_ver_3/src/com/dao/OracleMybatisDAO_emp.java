package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.emp.Emp;

public class OracleMybatisDAO_emp {
	
	public OracleMybatisDAO_emp() {}
	
	public List<Emp> selectAll(SqlSession session){
		List<Emp> list = session.selectList("selectAll");
		return list;
	}
	
	public Emp selectNo(SqlSession session, int empno) {
		Emp emp = session.selectOne("selectNo", empno);
		return emp;
	}
	
	public void update(SqlSession session, Emp emp) {
		System.out.println("update실행");
		int num = session.update("updateEmp", emp);
		System.out.println("수정된 갯수 ==="+num);
	}
	
	public void delete(SqlSession session, int empno) {
		System.out.println("delete 실행");
		int num = session.delete("deleteEmp",empno);
		System.out.println("삭제된 갯수 ==="+num);
	}

}
