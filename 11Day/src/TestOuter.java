
public class TestOuter {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.innerCreate();

		
		//2. Outer밖에서 Inner 생성==>반드시 Outer부터생성한다.
		//inner클래스가 멤버변수 자리에 생성되어 있을때
		Outer outer2 = new Outer();//밖 Outer클래스 생성
		outer2.n=10;
		Outer.Inner inner = outer2.new Inner();
		inner.info();
	}

}
