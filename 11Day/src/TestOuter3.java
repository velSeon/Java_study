
public class TestOuter3 {

	public static void main(String[] args) {
		// static inner클래스는 Outer3 클래스명으로 접근
		Outer3.Inner i = new Outer3.Inner();
		i.info();
	}

}
