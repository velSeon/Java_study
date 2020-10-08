package com.employee.biz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;

public class EmployeeBiz implements IEmployeeBiz {

	// 사원 목록 보기

	@Override
	public List<Employee> selectAllEmployee() {
		List<Employee> list = new ArrayList<>();
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			List<HashMap<String, Object>> map = session.selectList("employee.selectAllEmployee");
			System.out.println(">>>>" + map.size());
			for (HashMap<String, Object> m : map) {
				int empno = ((BigDecimal) m.get("EMPNO")).intValue();
				String ename = (String) m.get("ENAME");
				String dname =(String)m.get("DNAME");
				String hiredate = (String) m.get("HIREDATE");
				String loc = (String) m.get("LOC");
				int sal = ((BigDecimal) m.get("SAL")).intValue();
				String state = (String) m.get("STATE");
				// System.out.println(empno+"\t"+ename+"\t"+hiredate+"\t"+loc+"\t"+sal+"\t"+state);
				if (m.get("DNAME").equals("영업")) {
					Sales s = new Sales(empno, ename,dname, hiredate, loc, sal, state, sal * Sales.COMMISSION_RATE);
					list.add(s);
				} else {
					Engineer eng = new Engineer(empno, ename,dname, hiredate, loc, sal, state);
					list.add(eng);
				}

			}
		} finally {
			session.close();
		}
		return list;
	}
//	public List<Employee> selectAllEmployee() {
//		List<Employee> list = new ArrayList<>();
//		SqlSession session = MySqlSessionFactory.getSession();
//		try {
//			//리스트에서 사원정보를 읽고
//			// 영업인 경우 salse 생성, 리트스에 담아 리턴
//			// 엔지니어인 경우  engineer 생성, 리트스에 담아 리턴 
//			
//			List<HashMap<String,Object>> map = session.selectList("employee.selectAllEmployee");
//			
//			System.out.println(">>>>"+map.size());
//			for(HashMap<String,Object> m : map) {
//				int empno = ((BigDecimal)m.get("EMPNO")).intValue()	;
//				String ename = (String)m.get("ENAME");
//				String dname = (String)m.get("DNAME");
//				String hiredate = (String)m.get("HIREDATE");
//				String loc = (String)m.get("LOC");				
//				int sal = ((BigDecimal)m.get("SAL")).intValue();
//				String state =(String)m.get("STATE");
////				System.out.println(empno+"\t"+ename +"\t"+hiredate +"\t"+loc+"\t"+sal+"\t"+state);		
//				System.out.println(m);
//			if(m.get("DNAME").equals("영업")) {
//				Sales s  = new Sales(empno, ename,dname, hiredate, loc,sal, state, sal*Sales.COMMISSION_RATE);
//				list.add(s);
//				
//			}else {
//				Engineer e = new Engineer(empno, ename,dname, hiredate, loc,sal, state);
//				list.add(e);}
//			}	
//			
//			}
//		finally {
//			session.close();
//		}
//	
//		return list;
//	}

	// 사원정보 검색하기
	
	public List<Employee> searchList(String inputSubMenu, String searchWord) throws DataNotFoundException {
		/*
		 * 1.사번 검색 2.이름 검색 3.부서 검색 4.근무지 검색 5.연봉 검색
		 */
		List<Employee> list = new ArrayList<>();
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			//Map에 inputSubMenu0, searchWord 저장 
			//selectList 시  Map을 넘김, 조건에 맞는 결과를 map을 담은 list로 받기
			// 영업인 경우 salse 생성, 리트스에 담아 리턴
			// 엔지니어인 경우  engineer 생성, 리트스에 담아 리턴 하기	
			HashMap<String,String> xxx= new HashMap<>();
			xxx.put("inputSubMenu", inputSubMenu.trim());
			xxx.put("searchWord", searchWord.trim());
			System.out.println(inputSubMenu + "\t"+searchWord);
			List<HashMap<String,Object>> map = session.selectList("employee.searchList",xxx);
			System.out.println(">>>>"+map.size());
			for(HashMap<String,Object> m : map) {
				int empno = ((BigDecimal)m.get("EMPNO")).intValue()	;
				String ename = (String)m.get("ENAME");
				String dname = (String)m.get("DNAME");
				String hiredate = (String)m.get("HIREDATE");
				String loc = (String)m.get("LOC");				
				int sal = ((BigDecimal)m.get("SAL")).intValue();
				String state =(String)m.get("STATE");
								
//				System.out.println(empno +"\t"+ename+"\t"+hiredate+"\t"+loc+"\t"+sal+"\t"+state);
			
			if(m.get("DNAME").equals("영업")) {
				Sales s  = new Sales(empno, ename,dname, hiredate, loc,sal, state, sal*Sales.COMMISSION_RATE);
				list.add(s);
				
			}else {
				Engineer e = new Engineer(empno, ename,dname, hiredate, loc,sal, state);
				list.add(e);
				}
			}				
		}catch(Exception e){ 
			throw new DataNotFoundException("해당되는 사람이 없습니다.");
		} finally {
			session.close();
		}
		return list;
	}// end printSearchList

	public int createEmployeeNum() {//사원 추가 시 기존 사원 천번까지 있음 , 그다음 천 일번으로 사원번호 추가해주는 것.
		int num = 0;

		SqlSession session = MySqlSessionFactory.getSession();
		try {
			num = session.selectOne("employee.createEmployeeNum");
		//추가할 사원번호 얻어오기 mapper.createEmployeeNum 호출
		} finally {
			session.close();
		}
		return num;
	}
//
	// 새로운 사원 생성
	public void employeeInsert(Employee emp) {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();			
			map.put("empno", emp.getEmpno());
			map.put("ename", emp.getEname());
			map.put("dname", emp.getDname());
			map.put("hiredate", emp.getHiredate());
			map.put("loc", emp.getLoc());
			map.put("sal", emp.getSal());
			map.put("state", emp.getState());
			
//			if (emp instanceof Sales) {
//				m.put("dname", "영업");
//			} else {
//				m.put("dname", "개발");
//			}
			
			
			int n = session.insert("employee.employeeInsert", emp);
			System.out.println("삽입된 행의 갯수는 =="+n);
			session.commit();
			
			//map에 사원정보 저장
			//영업일 경우 dname추가 
			//사업일경우 일 경우 dname추가 
			//employee.employeeInsert 호출 map넘기기
			//
			} finally {
			session.close();
		}
	}
////
////	// 사원 수정
//	public void employeeUpdate(Employee emp) throws DataNotFoundException {
//		SqlSession session = MySqlSessionFactory.getSession();
//		try {
//			//map에 사원정보 수정
//			//영업일 경우 dname추가 
//			//사업일경우 일 경우 dname추가 
//			//employee.employeeInsert 호출 map넘기기
//			//
//			int n = session.update("employee.employeeUpdate", emp);
//			System.out.println("업데이트 한 정보의 갯수==="+n);
//			session.commit();
//		}catch(Exception e){ 
//			throw new DataNotFoundException("업데이트할 정보가 없습니다.");
//		} finally {
//			session.close();
//		}
//	}// end employeeUpdate
//
//	// 사원 삭제
//	@Override
//	public void employeeDelete(int empno) throws DataNotFoundException {
//		SqlSession session = MySqlSessionFactory.getSession();
//		try {
//		//사원번호 이용 사원 삭제 
//			int n = session.delete("employee.employeeDelete", empno);
//			System.out.println("삭제한 정보의 갯수===="+n);
//		}catch(Exception e){ 
//			throw new DataNotFoundException("삭제할 정보가 없습니다.");
//		} finally {
//			session.close();
//		}
//	}// end employeeDelete
//
//	// 근태관리( 외출/출장/휴가/근무)
//	@Override
//	public void employeeService(int empno, String inputColumn) throws DataNotFoundException {
//		SqlSession session = MySqlSessionFactory.getSession();
//		try {
//			HashMap<String,Object> map = new HashMap<String,Object>();
//			map.put("empno",empno);
//			map.put("inputColumn",inputColumn);	
//			
//			int n = session.update("employee.employeeService", map);
//			System.out.println("수정한 근태관리 상황 갯수는 =="+n);
//		//map에 사원번호 , 근태 상황저장 mapper.employeeSerivce
//		  // 
//		  session.commit();
//		}catch(Exception e){ 
//			throw new DataNotFoundException("근태관리를 수정할 수 없습니다.");
//		} finally {
//			session.close();
//		}
//	}

}// end class
