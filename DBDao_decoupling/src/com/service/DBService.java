package com.service;
import com.dao.DBDao;

public class DBService{
	DBDao dao = null;
	private static DBService service = new DBService();
	//2.static으로 자신의 객체 생성
	public static DBService getService() {
		return service;
	}
	//3.생성한 객체를 가져갈 수 있는 static함수 만들기
	//1.생성자를 private로 막기
	private DBService() {}
	
	
	public void setDAO(DBDao dao) {
		this.dao = dao;
		dao.conncet();//실제 실행할 dao클래스의 db접속 함수 호출
		
	
	}
	public void insert(DBDao dao) {
		dao.insert();
	}
}



