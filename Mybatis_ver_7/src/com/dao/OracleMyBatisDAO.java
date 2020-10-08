package com.dao;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	// 1. 4가지 정보	
	public OracleMyBatisDAO() {
	
	}
	public List<Dept> selectTopN(SqlSession session, int offset, int limit) {
		List<Dept> list = session.selectList("com.dept.DeptMapper4.topN",null,new RowBounds(offset,limit));
		return list;		
	}
	public void multinsert(SqlSession session, List<Dept> depts) {
		int num= session.delete("com.dept.DeptMapper4.multinsert", depts);	
		System.out.println(num);			
	}
	public void multidelete2(SqlSession session,List<Dept> depts) {
		int num= session.delete("com.dept.DeptMapper4.multidelete", depts);	
		System.out.println(num);	
		
	}
	
	public void multidelete(SqlSession session, List<String> loc) {
		int num= session.delete("com.dept.DeptMapper4.multidelete", loc);	
		System.out.println(num);	
		
	}
	
	public void multiupdate(SqlSession session,List<Integer> deptnoes2) {
		System.out.println(deptnoes2);
		int num= session.update("com.dept.DeptMapper4.multiupdate", deptnoes2);	
		System.out.println(num);
	}
	
	public List<Dept> multiSelect(SqlSession session, List<Integer> deptnoes) {
		List<Dept> list = session.selectList("com.dept.DeptMapper4.multiSelect", deptnoes);
		return list;
	}
	
	public List<Dept> selectDynamicChoose(SqlSession session, HashMap<String, String> map) {
		List<Dept> list = session.selectList("com.dept.DeptMapper3.selectDynamicChoose", map);
		return list;
	}
	
	
	public List<Dept>selectDynamicDeptno2(SqlSession session,Dept dept){
		List<Dept> list = session.selectList("com.dept.DeptMapper.selectDynamicDeptno2", dept);
		return list;
	}

	public List<Dept>selectDynamicDeptno(SqlSession session,HashMap<String,Integer>map){
		//System.out.println(map.get("deptno"));
		List<Dept> list = session.selectList("com.dept.DeptMapper2.selectDynamicDeptno",map);
		return list;		
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

	

	
	


