package com.service;
import com.dao.OracleDAO;
public class DBservice {
	OracleDAO dao = null;
	public void setDAO(OracleDAO dao) {
		this.dao = dao;
		dao.connectOracle();//실제 실행할 dao클래스의 db접속 함수 호출
	}

}
