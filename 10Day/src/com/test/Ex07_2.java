package com.test;
interface Flyer{
	public abstract void takeOff();
	public abstract void fly();
	public void lend();
}
class Bird implements Flyer{
	@Override
	public void takeOff() {
		System.out.println("Bird 이륙");}
	@Override
	public void fly() {
		System.out.println("Bird 비행");}
@Override
	public void lend() {
		System.out.println("Bird 착륙");}
	}
class Airplane implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙");}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");}

	@Override
	public void lend() {
		System.out.println("Airplane 착륙");}
}
public class Ex07_2 {
public static void main(String[] args) {
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.lend();
		Flyer flyer = new Airplane();
		flyer.takeOff();
		flyer.fly();
		flyer.lend();}

}
