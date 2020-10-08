
public class Member_Test {//class블럭
	//멤버, 인스턴스변수 - class 블럭에 선언
	//선언 후 초기화를 하지 않아도 된다. 초기화 불필요-사용시자동초기화
	//함수 안에 new로 필요한 만큼 객체 생성 사용
	static int num = 10;//초기값을 안주면 type의 기본값으로 지정, static 넣어주면 객체생성없이 사용 가능
	String name = "홍길동";
	String phoneNumber;
	String address;
	char gender;	
	public void printinfo() {//멤버메소드(함수) 객체마다 소유
			System.out.println(name+""+phoneNumber+""+address+""+gender);
	}
	public static void main(String[] args) {//main 블럭
		// TODO Auto-generated method stub
//로컬변수(메소드/함수에 선언된 변수), 선언+초기화후에 사용
		int num =10;
//		System.out.println("로컬변수"+num);
//		System.out.println(Member_Test.num);//static변수의 사용. 클래스 이름. 변수이름, 객체생성 필요 없음.
//		Member_Test mem1 = new Member_Test();
//		System.out.println(mem1.name);		
		Member_Test mem1 = new Member_Test(); //객체생성
		mem1.name="홍길동";//생성객체 접근 name멤버변수 저장
		Member_Test mem2 = new Member_Test(); //객체생성
		mem2.name="이순신";//생성객체 접근 name멤버변수 저장
		mem1.printinfo();//함수가 객체마다 다르게 들어간다.
		mem2.printinfo();
		System.out.println(mem1.name);//생성객체 멤버변수 사용
		System.out.println(mem2.name);//생성객체 멤버변수 사용
		Member_Test mem3 = new Member_Test(); //객체생성
		mem3.name="이철원";//생성객체 접근 name멤버변수 저장	
		mem3.address= "서울";//생성객체 접근 name멤버변수 저장	
		System.out.println(mem3.name +"주소"+ mem3.address);
		
	}//main 블럭
}//class 블럭

