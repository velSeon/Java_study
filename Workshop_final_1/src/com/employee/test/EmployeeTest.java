package com.employee.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.common.util.CommonUtil;
import com.employee.biz.EmployeeBiz;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;
import com.notice.biz.NoticeBiz;
import com.notice.entity.Notice;


public class EmployeeTest {

	
	public static void main(String[] args) {
		
		EmployeeBiz empBiz = new EmployeeBiz();
		NoticeBiz noticeBiz = new NoticeBiz();
		
		while (true) {
			printMainMenu();
			String inputMenu = CommonUtil.getUserInput();
	if (inputMenu.equals("1")) {
	
		   printEmployeeList(empBiz);
		   System.out.println("====================================================================================\n");
		}else if (inputMenu.equals("2")) {
				System.out.println("*****************************************");
				System.out.println("\t[2.임직원 정보 검색]");
				System.out.println("*****************************************");
				System.out.println("1.사번 검색");
				System.out.println("2.이름 검색");
				System.out.println("3.부서 검색");
	
				System.out.println("4.근무지 검색");
				System.out.println("5.연봉 검색");
				System.out.println("*****************************************");
				System.out.print("메뉴 입력(1~5 사이 정수로 입력) => ");
				String inputSubMenu = CommonUtil.getUserInput();
				int menu = Integer.parseInt(inputSubMenu);
				
				switch(menu){
				case 1:
					System.out.print("검색할 사번를 입력하세요 => ");
					  break;
				case 2:
					System.out.print("검색할 이름를 입력하세요 => ");
				  break;
				case 3:
					System.out.print("검색할 부서를 입력하세요(1.영업 2.개발) => ");
				  break;
				case 4:
					System.out.print("검색할 근무지를 입력하세요 => ");
				  break;
				case 5:
					System.out.println("입력한 연봉보다 많은 임직원을 모두 출력합니다.");
					System.out.print("검색할 연봉를 입력하세요 => ");
				  break;
				}//end switch
		
					String searchWord = CommonUtil.getUserInput();
					try {
						List<Employee> list = empBiz.searchList(inputSubMenu,searchWord);
						System.out.println("====================================================================================");
						System.out.println("사번\t이름\t부서\t근무지\t연봉\t커미션\t입사일\t\t근태");
						System.out.println("------------------------------------------------------------------------------------");
						for (Employee e : list) {
							System.out.print(e.getEmpno() + "\t");
							System.out.print(e.getEname() + "\t");
							String dname = "개발";
							if(e instanceof Sales){
								dname = "영업";
							}
							System.out.print(dname + "\t");
							System.out.print(e.getLoc() + "\t");
							System.out.print(CommonUtil.getCurrency(e.getSal()) + "\t");
							double commission = 0;
							if(e instanceof Sales){
								Sales s = (Sales)e;
								commission = s.getCommission();
								System.out.print(CommonUtil.getCurrency(((int)commission))+"\t");
							}else{
								System.out.print("\t");
							}
							
							System.out.print(e.getHiredate() + "\t");
							String state = e.getState();
							System.out.print(state);
							System.out.println();
						}//end for

					} catch (DataNotFoundException e) {
						System.out.println(e.getMessage());
					}
				
			} else if (inputMenu.equals("3")) {
				System.out.println("*****************************************");
				System.out.println("\t[3.임직원 정보 추가 ]");
				System.out.println("*****************************************");
				int empno = empBiz.createEmployeeNum();
				System.out.println("사원번호[" + empno + "]를 생성하였습니다");
				System.out.print("추가할 이름을 입력하세요 => ");
				String ename = CommonUtil.getUserInput();
				System.out.print("추가할 부서를 입력하세요(1.영업 2.개발) => ");
				String dname = CommonUtil.getUserInput();			
				System.out.print("추가할 근무지를 입력하세요(서울,부산,인천 ) => ");
				String loc = CommonUtil.getUserInput();
				System.out.print("추가할 연봉을 입력하세요 => ");
				String sal = CommonUtil.getUserInput();
				System.out.print("추가할 입사일(예:2014-06-01)을 입력하세요 \n 엔터를 치면 현재날짜로 입력됩니다. => ");
				
				String hiredate = CommonUtil.getUserInput();
				if(hiredate.equals("")){
					hiredate = CommonUtil.getDate(new Date());
				}
				System.out.println();
				System.out.println("*****************************");
				//사원 등록
				Employee emp = null;
				if("1".equals(dname)){
					emp = new Sales(empno, ename, hiredate,  loc, Integer.parseInt(sal), "근무", Integer.parseInt(sal)*Sales.COMMISSION_RATE);
				}else{
					emp = new Engineer(empno, ename, hiredate,  loc, Integer.parseInt(sal), "근무");
				}
				empBiz.employeeInsert(emp);
               
				//사원 목록 출력
				printEmployeeList(empBiz);
			}
		}}

	private static void printMainMenu() {

		System.out.println("*****************************************");
		System.out.println("\t[임직원 관리 시스템 메뉴]");
		System.out.println("*****************************************");
		System.out.println("1.전체 임직원 목록");
		System.out.println("2.임직원 정보 검색");
		System.out.println("3.임직원 정보 추가");
		System.out.println("4.임직원 정보 수정");
		System.out.println("5.임직원 정보 삭제");
		System.out.println("6.근태관리");
		System.out.println("7.공지사항 목록");
		System.out.println("8.공지사항 상세보기");
		System.out.println("9.공지사항 수정");
		System.out.println("10.공지사항 삭제");
		System.out.println("0.종료");
		System.out.println("*****************************************");
		System.out.print("메뉴 입력 => ");
	}//
	
	//사원 목록 출력
	public static void printEmployeeList(EmployeeBiz empBiz){
		  //사원 목록 리스트
		     List<Employee> list = empBiz.selectAllEmployee();	
				System.out.println("====================================================================================");
				System.out.println("사번\t이름\t부서\t근무지\t연봉\t커미션\t입사일\t\t근태");
				System.out.println("------------------------------------------------------------------------------------");
				for (Employee e : list) {
					System.out.print(e.getEmpno() + "\t");
					System.out.print(e.getEname() + "\t");
					String dname = "개발";
					if(e instanceof Sales){
						dname = "영업";
					}
					System.out.print(dname + "\t");
					System.out.print(e.getLoc() + "\t");
					System.out.print(CommonUtil.getCurrency(e.getSal()) + "\t");
					double commission = 0;
					if(e instanceof Sales){
						Sales s = (Sales)e;
						commission = s.getCommission();
						System.out.print(CommonUtil.getCurrency(((int)commission))+"\t");
					}else{
						System.out.print("\t");
					}
					
					System.out.print(e.getHiredate() + "\t");
					String state = e.getState();
					System.out.print(state);
					System.out.println();
				}//end for
	}//end printEmployeeList
	


}
