package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// XXDAO 클래스 역할
// SqlSessionFactory 얻기

public class MySqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory = null;
	static{
		String resource = "com/config/Configuration.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			System.out.println("db연동성공");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
	}//end static

	public static SqlSession getSession(){
		return sqlSessionFactory.openSession();
	}
	
	
}//end class






