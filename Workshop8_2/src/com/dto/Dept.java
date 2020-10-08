package com.dto;

//  Dept테이블의 하나의 레코드 저장용도
public class Dept {

	private int pdno;
	private String pdname;
	private String pdsubname;
	private String factno;
	private String pddate;
	private int pdcost;
	private int pdprice;
	private int pdamount;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int pdno, String pdname, String pdsubname, String factno, String pddate, int pdcost, int pdprice,
			int pdamount) {
		super();
		this.pdno = pdno;
		this.pdname = pdname;
		this.pdsubname = pdsubname;
		this.factno = factno;
		this.pddate = pddate;
		this.pdcost = pdcost;
		this.pdprice = pdprice;
		this.pdamount = pdamount;
	}
	public int getPdno() {
		return pdno;
	}
	public void setPdno(int pdno) {
		this.pdno = pdno;
	}
	public String getPdname() {
		return pdname;
	}
	public void setPdname(String pdname) {
		this.pdname = pdname;
	}
	public String getPdsubname() {
		return pdsubname;
	}
	public void setPdsubname(String pdsubname) {
		this.pdsubname = pdsubname;
	}
	public String getFactno() {
		return factno;
	}
	public void setFactno(String factno) {
		this.factno = factno;
	}
	public String getPddate() {
		return pddate;
	}
	public void setPddate(String pddate) {
		this.pddate = pddate;
	}
	public int getPdcost() {
		return pdcost;
	}
	public void setPdcost(int pdcost) {
		this.pdcost = pdcost;
	}
	public int getPdprice() {
		return pdprice;
	}
	public void setPdprice(int pdprice) {
		this.pdprice = pdprice;
	}
	public int getPdamount() {
		return pdamount;
	}
	public void setPdamount(int pdamount) {
		this.pdamount = pdamount;
	}
	@Override
	public String toString() {
		return pdsubname + "   "
				+ pdcost + "       " + pdprice ;
	}
	
	
	
	
	
	
	//멤버 변수 이름이 DB 컬럼 이름과 일치해야 한다.
	
	
	
	
	
}
