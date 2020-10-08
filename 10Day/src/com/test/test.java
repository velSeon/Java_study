package com.test;
interface A{}
interface B{}

interface C extends A,B{}
class My implements A,B{}

public class test {

	public static void main(String[] args) {
		//A a = new A(); //객체생성불가
		A a2 = new My(); //다형성

	}

}
