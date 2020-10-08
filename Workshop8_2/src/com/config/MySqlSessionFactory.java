package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {//template class
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		
		String resource = "Configuration.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 sqlSessionFactory =
		new SqlSessionFactoryBuilder().build(inputStream);
	}//end static
	
	//SqlSession 반환해주는 메서드
	// MySqlSessionFactory.getSession()
	public static SqlSession getSession() {
		SqlSession session = sqlSessionFactory.openSession();
		//실제 사용자가 사용할 connection과 비슷한 객체
		//클래스이름.함수이름 으로 호출 MySqlSessionFactory.getSession()
		
		return session;
	}
	
}//end class





