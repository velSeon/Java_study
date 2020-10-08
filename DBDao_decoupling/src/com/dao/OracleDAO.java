package com.dao;

public class OracleDAO implements DBDao{

	
	@Override
	public void conncet() {
		System.out.println("OracleDAO.connect");
		
	}

	@Override
	public void insert() {
		System.out.println("OracleDAO.insert");
		
	}

	
	
}
