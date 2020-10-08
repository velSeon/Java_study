package com.test1;
class Emp{
	public Emp() {
		System.out.println("Emp 생성자 1");
	}
	public Emp(String name, int salary) {
		System.out.println("Emp 생성자 2");
	}
	
}
class Man extends Emp{
	public Man() {
		System.out.println("Man 생성자");
	}
}
public class Ex06_2 {

	public static void main(String[] args) {
		Man man = new Man();
		

	}

}
