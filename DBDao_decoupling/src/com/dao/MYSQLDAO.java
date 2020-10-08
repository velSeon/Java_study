package com.dao;

public class MYSQLDAO implements DBDao{

	@Override
	public void conncet() {
	System.out.println("MYSQLDAO.connect");
		
	}

	@Override
	public void insert() {
		System.out.println("MYSQLDAO.insert");
		
	}

	

	

}
