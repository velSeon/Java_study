package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		//<select id="selectAll"
		List<Dept>	list=  session.selectList("selectAll");
		//결과가 여러개인 selsect문 실행시 selectList 함수 실행
		//DeptMapper.xml 의 id가 selsectAll인 sql을 수행
		//DeptMapper.xml 의 id="DselectAll"인 sql문 실행
		return list;
	}
	
	public List selectAllhash(SqlSession session) {
		
		List list=  session.selectList("selectAllhash");
		//map을 담은 list생성
		return list;
	}

}
