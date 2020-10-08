
public class Stu_Test {

	String name;//멤버변수 ,객체생성, 초기값 넣어줄 필요 없다. 자동초기화, 객체정보 저장
	int age;
	
	public void printInfo() { //멤버메소드, 객체생성, 그냥 호출해서 쓰면 된다, 동작관련
	int num =1;//로컬변수
	num= num+10;
	System.out.println("printInfo() num====" + num);
	System.out.println(name+ ":" + age);
		

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Stu_Test st_1 = new Stu_Test();
//		System.out.println(st_1);  //Stu_Test@5ebec15 객체의 주소, 이 주소를 찾아가서 
		st_1.name = "홍길동";
		st_1.age = 25;
		st_1.printInfo();
		Stu_Test st_2 = new Stu_Test();
		st_2.name = "이순신";
		st_2.age = 26;
		st_2.printInfo();
	
	
	}
}
