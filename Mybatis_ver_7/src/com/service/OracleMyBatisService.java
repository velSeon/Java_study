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
	
	public List<Dept> selectTopN(int i, int j){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectTopN(session, i,j);
			session.commit();
		} finally {
			session.close();
		}
		return list;
	}
	public void multinsert(List<Dept>depts) {
	//list에 insert할 dept객체를 3개를 담고 dao넘김
	//mapper.xml에서 insert all sql 문 실행 3개를 insert
	//dao에서 insert 객수 출력
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
			dao.multinsert(session, depts);
			session.commit();
		} finally {
			session.close();
		}		
	}
	
	
	
	public void multidelete2(List<Dept> depts) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
			dao.multidelete2(session, depts);
			session.commit();
		} finally {
			session.close();
		}
		
	}
	public void multidelete(List<String> loc) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
			dao.multidelete(session, loc);
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void multiupdate(List<Integer> deptnoes2) {
		//deptno가 10,12,13 인 부서의 loc를 "제주"로 update(list로 전달)
		//mapper.xml에서 foreach문 사용
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
			dao.multiupdate(session, deptnoes2);
			session.commit();
		} finally {
			session.close();
		}
	}

	
	public List<Dept>multiSelect(List<Integer> deptnoes){ //deptno를 저장
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list= dao.multiSelect(session,deptnoes);
		} finally {
			session.close();
		}
		System.out.println("service");
		return list;
	}
	
	public List<Dept>selectDynamicChoose(HashMap<String,String>map){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			
			//바로 호출할 때 list = session.selectList("com.dept.DeptMapper.selectDynamicChoose", map)
			list = dao.selectDynamicChoose(session,map);
		} finally {
			session.close();
		}
		return list;
	}
	
	
	
	public List<Dept>selectDynamicDeptno2(Dept dept){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno2(session,dept);
		} finally {
			session.close();
		}
		return list;
	}

	//동적 sql 함수
	public List<Dept>selectDynamicDeptno(HashMap<String,Integer>map){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno(session,map);
		} finally {
			session.close();
		}
		return list;
	}
	
	
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
