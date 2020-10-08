
public class TestOuter4 {

	public static void main(String[] args) {
		
		//익명클래스(anonymous class) ==>인터페이스 사용시 많이 사용.
		
		//1. 일반적인 방법==> 이름있는 클래스로 처리
		Flyer b = new Bird();
		//b.takeOff();
		
		//2. 익명클래스 ==> SuperMan 기능을하는 클래스
//		인터페이스명 변수명  = new 인터페이스명() {
//			//메서드 오버라이딩
//			
//		};
		Flyer b2 = new Flyer(){//인터페이스를 바로 오버라이딩 해버리겠다.
			//구현부 직접 작성
			@Override
			public void takeOff(int num) {
				System.out.println("SuperMan.takeOff"+num);
			}
		}; //끝날떄 ;으로 끝난다. 
		b2.takeOff(5);
		
		Flyer b3 = new Flyer() {
			@Override
			public void takeOff(int num) {
				System.out.println("Airplane.takeOff"+num);
			}
		};
		b3.takeOff(9);
	}//end main

}
