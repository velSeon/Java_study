package com.test;

public class Ex05_15 {
	public Ex05_15() {System.out.println("()생성자 호출");}
	public Ex05_15(String a) { System.out.println("(String a)생성자 호출");}
	public Ex05_15(int a) {System.out.println("(int a)생성자 호출");}
	public void sum() {System.out.println("()함수호출");}
	public void sum(int a) {System.out.println("(int a)함수호출");}
	public void sum(String a) {System.out.println("(String a)함수호출");}
	public void sum(int a, String b) {}
	public void sum(String a, int b) {}
	public static void main(String[] args) {
		Ex05_15 test = new Ex05_15();
		Ex05_15 test1 = new Ex05_15("홍길동");
		
		test.sum("홍길동");
		test.sum(100);
	}
}
