
public class TestPet {
	public void petPrint(Pet pet) {
		//Cat cat = (Cat)pet;
		//System.out.println("petPrint호출됨==="+pet.printInfo());
		if(pet instanceof Cat) {
			Cat cat = (Cat)pet;
			System.out.println("고양이");
			System.out.println(cat.getGender());
			System.out.println(cat.printInfo());
		}else if (pet instanceof Dog) {
			Dog dog = (Dog)pet;
			System.out.println(dog.getColor());
			System.out.println(dog.getGender());
			System.out.println(dog.printInfo());
		}else if(pet instanceof Fish) {
			Fish fish = (Fish)pet;
			System.out.println(fish.getGender());
			System.out.println(fish.getTailSize());
			System.out.println(fish.printInfo());
		}else if(pet instanceof Pet) {
			System.out.println(pet.printInfo());
		}else {
			System.out.println("똑바로 넣으세요.");
		}
			
			
		}
	public static void main(String[] args) {
		TestPet test = new TestPet();
		Pet c = new Cat("야옹이", 3, "암놈");		
		Pet d = new Dog("멍멍이",4,"숫놈","갈색");		
		Pet f = new Fish("물고기",5,"암놈",5);
//		test.petPrint(c);
		test.petPrint(d);
//		test.petPrint(f);
//		System.out.println(c.printInfo());
//		
//		System.out.println(d.printInfo());
//		
//		System.out.println(f.printInfo());
//		Cat c1 = (Cat)c;
//		System.out.println(c1.getGender());
//		Dog d1 = (Dog)d;
//		System.out.println(d1.getColor());
//		Fish f1 = (Fish)f;
//		System.out.println(f1.getGender());
		
/*		
//부모타입 변수로 자식 객체 저장이 가능.cat,dog,fish객체저장가능		
		//고양이 2마리,강아지 1마리 ,물고기 1마리
		//Cat c = new Cat("야옹이", 3, "암놈");
		System.out.println(c.printInfo());
//부모타입변수로 오버라이딩된 자식 객체 함수 호출됨-동적바인딩
		//System.out.println(c.getGender()); 될까?
//부모타입변수로 실제 자식 객체를 가지고 있어도 자식 객체의 유일한 함수, 변수 접근이 안됨.
		Cat cat = (Cat)c;
//실제 객체의 유일 변수, 함수 접근을 위해 실제 객체 타입으로 변환(타입캐스팅)		
		System.out.println(cat.getGender());
//형변환된 변수로 함수, 변수 사용
		Dog d = new Dog("멍멍이",4,"숫놈","갈색");
		System.out.println(d.printInfo());
		Fish f = new Fish("물고기",5,"암놈",5);
		System.out.println(f.printInfo()); */
		System.out.println("배열출력");
		Pet[] arr = new Pet[3];
		arr[0]=c;
		arr[1]=d;
		arr[2]=f;
		
		for(Pet pet : arr) {
			System.out.println(pet.printInfo());
			//자식만 호출하고 싶으면, 이 코드 사용하지 못함.
		}
	}
}
