
public class Sample02_variable5_3 {
String name;
char c;
int m; //인스턴스 변수(instance variable)
		//생성시점:객체생성(클래스생성) new ~ 객체소멸(클래스종료), new키워드사용
		//메모리 : 힙(heap)
		//초기화 안하면 자동초기화된다.
//정수 :0, 실수:0.0, char:'u\0000', boolean:false, 참조행 :null
static int k; //static변수(클래스변수)
//생성시점: 프로그램시작~ 프로그램 종료, new없이 사용
//메모리: method area(클래스정보, static,상수,,,)
//초기화 안하면 자동초기화 된다.
public static void main(String[] arges) {
	//로컬변수(local variable):메서드안에서 선언
	//생성시점 : 메서드호출~ 메서드 종료
	//메모리 :스택(stack)
	//주의할점:반드시 사용전에 초기화해야한다.
	int n =0;
	System.out.println(n); //메인 로컬변수 사용
	Sample02_variable5_3 test_1=new Sample02_variable5_3();
	//멤버변수 사용을 위해 객체 생성
	System.out.println(test_1.name);//생성 객체 멤버 변수 사용
}	
	
}


