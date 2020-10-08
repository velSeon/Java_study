package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	
	public OracleDAO() {
		//드라이버 로딩
	}//end OracleDAO
	
	public ArrayList<Dept> select()throws SQLException {
		//전체 데이터 리턴 출력
		
		return list;
	}//end select
	public void insert() {}
	public void update() {}
	public void delete() {}
	
}



