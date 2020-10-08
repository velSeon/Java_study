
public class Test {
public static void a() throws Exception{
	b();
}
public static void b() throws Exception{
	int num = 3/0;
	String name = null;
	System.out.println(name.length());
}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			a();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());

	}catch (Exception e) {
		System.out.println(e.getMessage());


}
		System.out.println("프로그램 정상 종료");}}
