package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	// 1. 4가지 정보	
	public OracleMyBatisDAO() {
	
	}
	public HashMap selectByDeptnoHashMap(SqlSession session, int deptno){
		HashMap map = session.selectOne("com.dept.DeptMapper.selectByHash", deptno);		
		return map;
	}
	public List<Dept> selectBydeptNoIn(SqlSession session,HashMap<String,Integer> map){
		List<Dept> list = session.selectList("com.dept.DeptMapper.selectByDeptnoIn", map);
		return list;
	}
	public List<Dept> selectByHashMap(SqlSession session,HashMap<String,Integer> map){
		List<Dept> list = session.selectList("com.dept.DeptMapper.selectHash", map);		
	return list;
	}
	
	
	public Dept selectByname (SqlSession session,String dname) {
		Dept dept= session.selectOne("com.dept.DeptMapper.selectbydname", dname);		
		return dept;
	}
	
	
	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept= session.selectOne("com.dept.DeptMapper.selectByDeptno", deptno);		
		return dept;
	}
	
	public List<Dept> selectAll(SqlSession session){
		//<select id="selectAll" resultType="com.dto.dept">
		List<Dept> list= session.selectList("selectAll");
		return list;
	}		
	public void insert(SqlSession session, Dept dept) {
		int num= session.insert("deptInsert", dept);
		System.out.println("추가된 레코드 ===="+ num);
	}
	public void delete(SqlSession session,int deptno) throws RecordNotFoundException{
		int num= session.delete("com.dept.DeptMapper2.deptDelete", deptno);
		System.out.println("삭제된 갯수 ===="+ num);
		if(num==0) {
			throw new RecordNotFoundException("delete 값이 없습니다.");
		}
	}
	
	public int deptRecordCount(SqlSession session) throws RecordNotFoundException{
		int num = session.selectOne("deptCount");
		System.out.println("전체 행의 갯수는 ==="+num);
		if(num==0) {
			throw new RecordNotFoundException("값이 없습니다.");}
		return num;
	}

	public void update(SqlSession session, Dept dept) throws RecordNotFoundException {
		int num = session.update("deptUpdate", dept);
		System.out.println("수정된 갯수==="+ num);
	if(num==0) {
		throw new RecordNotFoundException("update 값이 없습니다.");
	}
	}
	
	public List<Dept> selectByDeptNameAndLoc(SqlSession session,Dept dept) {
	//1.dao에서 부서이름, 지역을 이용 and select 완성 후 아래처럼 수정
	//dao에서 dept를 검사 부서이름만 있는 경우
	//지역만 있는 경우
	//둘다 있는 경우를 판단하여 Mapper.xml의 id를 다흐게 호출하여 select결과 리턴
		List<Dept>list = null;
		if(dept.getDname() != null && dept.getLoc()!=null) {
			list = session.selectList("selectNnL2", dept);}
		else if(dept.getLoc()==null) {
		 list = session.selectList("selectNoL1", dept);}
		else if(dept.getDname()==null) {
		list = session.selectList("selectNoL", dept);}
		
		return list;
		
	}
	

}
