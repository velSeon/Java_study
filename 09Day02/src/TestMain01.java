
public class TestMain01 {

	public static void main(String[] args) {
		//AbstractClass x = new AbstractClass(); //Abstract가진 클래스라 new안됨
		ConcreteClass y = new ConcreteClass(100);
		System.out.println(y.getNum());
		y.a(); //자식에 구현된 함수 호출
		int n = y.b();
		y.c(100);

		ConcreteClass2 y2 = new ConcreteClass2(100);
		System.out.println(y2.getNum());
		y2.a(); //자식에 구현된 함수 호출
		int n2 = y2.b();
		y2.c(100);
		

	}

}
