package com.test;

class Counter{
	static int count;
	int num;
	public Counter() {
		count++;
		num = count;
	}
	public int getnum() {return num;}
}
public class Ex05_18 {

	public static void main(String[] args) {
		System.out.println("객체 생성 횟수:"+Counter.count);
		Counter c = new Counter();
		System.out.println("객체 생성 횟수:"+c.getnum());
		Counter c2 = new Counter();
		System.out.println("객체 생성 횟수:"+c2.getnum());
		System.out.println("객체 생성 횟수:"+Counter.count);

	}

}
