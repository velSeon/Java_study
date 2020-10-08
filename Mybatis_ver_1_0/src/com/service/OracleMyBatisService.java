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
		//sqlsession 업어오기(conncection과 비슷)
		//sesion을 list형식으로 받기 위해 형성
		List<Dept> list = null;//반환값을 준비
		try {
			list = dao.selectAll(session);//dao에 sqlsession전송
		} finally {
			session.close();//connection.close()와 비슷, 모든 함수마다 닫기
		}
		return list; //dao의 select결과 메인으로 리턴
		//list 실제 dao에 있는 session
	}// end class
	
	public List selectAllhash() {
		SqlSession session = MySqlSessionFactory.getSession();
		//sqlsession 업어오기(conncection과 비슷)
		//sesion을 list형식으로 받기 위해 형성
		List list = null;//반환값을 준비
		try {
			list = dao.selectAllhash(session);//dao에 sqlsession전송
		} finally {
			session.close();//connection.close()와 비슷, 모든 함수마다 닫기
		}
		return list; //dao의 select결과 메인으로 리턴
		//list 실제 dao에 있는 session
	}// end class


}
