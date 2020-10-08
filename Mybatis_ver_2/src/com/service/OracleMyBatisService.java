package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();}
	public HashMap selsectByDeptnoHashMap(int deptno) {
		//deptno을 이용하여 부서, 정보를 하나 select 후 hashmap에 담아
		//메인에서 출력 - 단 부서이름만 출력 할 것.
		SqlSession session= MySqlSessionFactory.getSqlSession();
		HashMap map = null;
		try {
			map = dao.selectByDeptnoHashMap(session, deptno);
			session.commit();
		} finally {
			session.close();
		}
		
		return map;
	}
	
	public List<Dept> selectBydeptNoIn(HashMap<String,Integer> map){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectBydeptNoIn(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Dept> selectByHashMap(HashMap<String,Integer> map){
		//select deptno ~~ between a and b
		//main에서 hashmap 생성 a, b 값 설정 service => dao로 인자로 넘김
		//sql에서 key를 이용 a,b 값을 설정 (parameterType = hashmap)
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectByHashMap(session, map);
			session.commit();
		} finally {
			session.close();
			
		
		}
	
	return list;
	}
	
//	public HashMap selectByDeptnoHashMap(int deptno) {
//		
//		return map;
//	}
	
	public Dept selectByname(String dname) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		Dept dept =null;
		try {
			dept = dao.selectByname(session,dname);
		} finally {
			session.close();
		}
		return dept;
	}
	public Dept selectByDeptno(int deptno) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		Dept dept=null;
		try {
		 dept=	dao.selectByDeptno(session, deptno);
		}finally {
			session.close();
		}
		return dept;}
	public void insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.insert(session, dept);
			session.commit();//명시적으로 꼭 해주어야 함. 
		} finally {
			session.close();
		}}
	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;		}
	public int deptRecordCount() throws RecordNotFoundException {
		SqlSession session = MySqlSessionFactory.getSqlSession();	
		int num = 0;
		try {
			num = dao.deptRecordCount(session);
		} finally {
			session.close();
		}
		return num;}
	public void delete(int deptno) throws RecordNotFoundException {
		SqlSession session = MySqlSessionFactory.getSqlSession();	
		try {
			dao.delete(session, deptno);
			session.commit();
		} finally {
			session.close();
		}		}
	public void update(Dept dept) throws RecordNotFoundException {
		SqlSession session = MySqlSessionFactory.getSqlSession();	
		try {
			dao.update(session, dept);
			session.commit();
		} finally {
			session.close();
		}}	
	public List<Dept> selsectByDeptNameAndLoc (Dept dept){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectByDeptNameAndLoc(session, dept);
		} finally {
			session.close();
		}
		return list;
	}
	


}
