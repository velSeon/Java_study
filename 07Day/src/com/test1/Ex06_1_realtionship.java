package com.test1;
class Employee{
	String name;
	int salary;
	public String getEmployee() {
		return name + " "+ salary;
	}
	public Employee() {
		
	}
	public Employee(String name, int salary) {//employee의 default 생성자
		super();//object 클래스 객체 생성
		this.name = name;
		this.salary = salary;
		System.out.println("Employee 부모 기본 생상자 호출 ====");
	}
}
class Manager extends Employee{
	String depart;
	public String getManager() {
		return name + " "+ salary + " " + depart;
	}
	public Manager(String name, int salary, String depart) {
		super();//부모 기본 생성자 호출
		this.name = name;
		this.salary = salary;
		this.depart = depart;
		System.out.println("Manager 자식생성자 호출======");
	}
}
public class Ex06_1_realtionship {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 2000);
		Manager man = new Manager("이순신",4000,"개발");
		System.out.println(emp.getEmployee());
		System.out.println(man.getManager());
				}
}
