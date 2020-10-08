class Outer2{
	int a = 10;
	private int b = 20;
	static int c =30;
	public void info() {
		int size = 100;
		class Inner{
			int d = 40;
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(size);
				
			}
		}//end Inner
		Inner inner = new Inner();
		inner.print();
		
	}
}
public class Ex07_5 {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.info();

	}

}
