interface Flyer{
	public abstract void takeOff();
	
	public abstract void fly();
	public void land();
}
public class Ex07_7 {

	public static void main(String[] args) {
		Flyer f = new Flyer() {
			public void fly() {
				System.out.println("fly");
			}
			public void takeOff() {
				System.out.println("takeOff");
			}
			public void land() {
				System.out.println("land");
			}
			
		};
		f.fly();

	}

}
