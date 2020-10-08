
public class TestStudent {

	public static void main(String[] args) {
		
//		Student stu1 = new Student();
//		Student stu2 = new Student();
		Student stu1 = new Student("홍길동",100,"강남구");		
		
		Book book1 = new Book();
		book1.setName("해리포더");
		book1.setPrice(1000);
		stu1.setwrittenBook(book1);
		
		//학생 1번의 책제목확인
		Book stu1_book = stu1.getwrittenBook();		
		System.out.println(stu1_book.getName());
		System.out.println(stu1_book.getPrice());		
		
//		System.out.println(stu1.getwrittenBook().getName());//book.getname
		
		
//		System.out.println(stu1.getName());
//		System.out.println(stu1.getAge());
//		System.out.println(stu1.getAddress());
//		System.out.println(stu2.getName());
//		
//		Student stu2 = new Student("이순신",50,"서초구");
//		System.out.println(stu2.getName());
//		System.out.println(stu2.getAge());
//		System.out.println(stu2.getAddress());
//		
//		System.out.println(stu1.printInfo());
		
		
		
		
		
		
//		//클래스명 변수명 = new 클래스명();
//		Student stu1 = new Student();
//		
//		stu1.setName("홍길동");
//		String name = stu1.getName();
//		System.out.println(name);
//		
//		stu1.setAge(20);
//		int age = stu1.getAge();
//		System.out.println(age);
//		
//		stu1.setAddress("서울");
//		String address = stu1.getAddress();
//		System.out.println(address);
//		
//		
//		System.out.println(stu1.stuInfo());
//		System.out.println(stu1);
//		
//		Student stu2 = new Student();
//		stu2.setName("이순신");
//		stu2.setAge(40);
//		
//		stu2.setAddress("강남구 역삼동");
//		System.out.println(stu2.getAddress());
//
//		
//		System.out.println(stu2);
//		stu1=stu2;
//		System.out.println(stu1); */
//		
//		//이렇게도 가능!
////		stu1.setAge(20);
////		System.out.println(stu1.getAge());
////		
//		
//			
//		
//	Student stu2 = new Student();
//		Student stu3 = new Student();
//		
//		stu1.name = "홍길동";
//		stu1.age = 20;
//		stu1.address ="서울";
//		
//		stu2.name = "이순신";
//		stu2.age = 44;
//		stu2.address ="전라도";
//		
//		stu3.name = "유관순";
//		stu3.age = 19;
//		stu3.address ="경기";
//		
//		System.out.println(stu1.name);
//		System.out.println(stu1.age);
//		System.out.println(stu1.address);
//		System.out.println(stu2.name);
//		System.out.println(stu2.age);
//		System.out.println(stu2.address);
//		System.out.println(stu3.name);
//		System.out.println(stu3.age);
//		System.out.println(stu3.address);*/
		
	}

}
