
public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			int num = 10;
		} finally {
			System.out.println("반드시 수행되는 문장");
		}
	System.out.println("프로그램 종료");
	}

}
