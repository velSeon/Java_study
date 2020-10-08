class Vehicle{}
class Truck extends Vehicle{}
class Car extends Vehicle{}
public class Ex10_4 {
public static <P> void method(P p) {}
public static <P> P  method2(P p) {
	return p;
} 
	public static void main(String[] args) {
		method(new Vehicle());
		method(new Truck());
		method(new Car());
		
		Vehicle v = method2(new Vehicle());
		Truck t = method2(new Truck());
		Car c = method2(new Car());

	}

}
