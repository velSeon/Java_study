
public class Test02 {

	public static void main(String[] args) {
		System.out.println("프로그램시작");
		try {
			System.out.println("B");
			int num =3/0;
			System.out.println("C");
			
		}catch(ArithmeticException e) {
			System.out.println("D");
		}
	System.out.println("프로그램 종료");
	}



}
