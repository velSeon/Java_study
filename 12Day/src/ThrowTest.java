public class ThrowTest {
public static void a() throws NullPointerException{
	b();
}

public static void b() throws NullPointerException{
int num =10;

	try {
		if(num==10) {
		throw new NullPointerException("널포인트인셉션발생");}
	

}

//	String name = null;
//	System.out.println(name.length());
}
	public static void main(String[] args) {
		ThrowTest test = new ThrowTest();
		System.out.println("프로그램 시작");
	try {a();
	
	}catch(NullPointerException e) {
		System.out.println(e.getMessage());
	}
		System.out.println("프로그램 정상 종료");
}}
		
