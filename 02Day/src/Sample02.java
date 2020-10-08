
public class Sample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.변수선언
		String name;//변수, name변수, 문자열변수, string타입변수
		int age;//변수, age변수, 정수형변수, int 타입의 변수
		String address;//참조형 변수
		char gender;//변수, gender변수, 문자형변수, char타입변수
		boolean isMarried;//기본형변수
		float height;//기본형변수
		double weight;//기본형변수
		
//2. 변수초기화(값을 맨처음 설정하는 작업)
		name = "홍길동"; //프로그램에서의 = 의미는 홍길동이 네임에 저장된다.
		age =20;
		address = "서울";
		gender='남'; //주의
		isMarried = false;
		height = 185.63F;//실수형의 기본은 D이기에, Float를 쓰려면 무조건 F써야함
//		height= 3.14;
		weight = 78.25;
		
		System.out.println("String name"+name);
		System.out.println("Int age"+age);
		System.out.println("String address"+address);
		System.out.println("char gender"+gender);
		System.out.println("boolean isMarried"+isMarried);
		System.out.println("float height"+height);
		System.out.println("double weight"+weight);
	
	}

}
