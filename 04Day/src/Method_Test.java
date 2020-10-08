
public class Method_Test {
	
	public void a_Method(String name) {//아무곳에서 접근. 반환값없음, 함수이름. 받는 값 없음
		System.out.println("a_Method()호출_1");
		System.out.println("a_Method()호출_2");	
		System.out.println("a_Method() 전달받은 인자 "+name);	
	}//class 선언. 멤버 메소드(함수) new 사용 생성, 사용
	public void b_Method() {
		System.out.println("b_Method()호출_1");
		System.out.println("b_Method()호출_2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램 시작
		System.out.println("main시작=========");
		Method_Test test= new Method_Test();	
		test.a_Method("메소드로 문자열 전송");
		test.b_Method();
		System.out.println("main종료=========");
	}
}
