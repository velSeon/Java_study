
public class Ex09_5 {
public static void a() throws ArithmeticException{
	b();
}
public static void b() throws ArithmeticException{
	int num = 3/0;
}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
try {
	a();
} catch (ArithmeticException e) {
	System.out.println(e.getMessage());
}
System.out.println("프로그램 정상 종료");	}

}
