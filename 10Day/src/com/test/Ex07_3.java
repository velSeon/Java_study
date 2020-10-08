package com.test;
interface Vehicle{
	int num = 100;//public static final 자동으로 지정된다.
	public abstract void speed();
	public default void start() {
		System.out.println("start~");
	}
	public static void stop() {
		System.out.println("stip~");
	}
	//public void e() {} 일반메서드 불가.
}
class Car implements Vehicle{

	@Override
	public void speed() {
		System.out.println("100Km");
		
	}
	
}
public class Ex07_3 {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.speed();
		Vehicle.stop();
		System.out.println(Vehicle.num);

	}

}
