package com.dao;

import java.util.HashSet;

public class OracleDAO {//객체생성됐을 경우,
	public HashSet<Person> select() {
		HashSet<Person>set= new HashSet<Person>();
		
		set.add(new Person("홍길동",13,"서울")); // set.add(new Person("홍길동",13,"서울")로변경
		set.add(new Person("유관순",20,"서울"));
		set.add(new Person("고길동",13,"서울"));
		return set;
	}
	

	
}
