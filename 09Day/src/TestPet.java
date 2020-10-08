
public class TestPet {
	public Pet[] creatrePetArr() {
		
		Pet c = new Cat("야옹이", 3, "암놈");
		Pet d = new Dog("강아지", 10, "암놈","검정");
		Pet f = new Fish("븡어", 10, "암놈",2.5);
		Pet[] pets = new Pet[3];
		pets[0]= c;
		pets[1]= d;
		pets[2]= f;
		return pets;		
	}
	public Pet CreatePet(int num) {//pet타입으로 자식에게 리턴
		Pet p = null;

		if(num==1) {
		  p = new Cat("야옹이", 3, "암놈");
		}else if (num==2) {
			p = new Dog("강아지", 10, "암놈","검정");
		}else if( num==3) {
			p = new Fish("븡어", 10, "암놈",2.5);
		}
		return p;
	}
		public  void petPrint(Pet p) {
		
		if(p instanceof Cat) {
			Cat c = (Cat) p;
			System.out.println(c.printInfo());
			System.out.println(c.getGender());
		}else if(p instanceof Dog) {
			Dog d = (Dog) p;
			System.out.println(d.printInfo());
			System.out.println(d.getColor());
		}else if(p instanceof Fish) {
			Fish f = (Fish) p;
			System.out.println(f.printInfo());
			System.out.println(f.getTailSize());
		}else if (p instanceof Pet) {
			System.out.println(p.printInfo());
		}else {
			System.out.println("잘못된데이터");
		}
		
	}
		public void arrPirnt(Pet[]pets) {
		for(Pet p :pets) {
		if(p instanceof Cat) {
			Cat c = (Cat) p;
			System.out.println(c.printInfo());
			System.out.println(c.getGender());
		}else if(p instanceof Dog) {
			Dog d = (Dog) p;
			System.out.println(d.printInfo());
			System.out.println(d.getColor());
		}else if(p instanceof Fish) {
			Fish f = (Fish) p;
			System.out.println(f.printInfo());
			System.out.println(f.getTailSize());
		}else if (p instanceof Pet) {
			System.out.println(p.printInfo());
		}else {
			System.out.println("잘못된데이터");
		}
//		for( Pet p : pets) {
//			System.out.println(p.printInfo());
			
		
	}
	}
	public static void main(String[] args) {
		
		TestPet test = new TestPet();
		Pet [] pets = test.creatrePetArr();
		//test.arrPirnt(pets);
		Pet p = test.CreatePet(2);
		test.petPrint(p);
		
		/*Pet p = test.CreatePet(1);
		test.petPrint(p);
		Pet p2 = test.CreatePet(2);
		test.petPrint(p2);
		
		
		if(p instanceof Cat) {
			Cat c = (Cat) p;
			
			System.out.println("고양이입니다. "+c.getGender());
		}else if(p instanceof Dog) {
			Dog d = (Dog) p;
			
			System.out.println(d.getColor());
		}else if(p instanceof Fish) {
			Fish f = (Fish) p;
			
			System.out.println(f.getTailSize());
		}else if (p instanceof Pet) {
			System.out.println(p.printInfo());
		}else {
			System.out.println("잘못된데이터");}
		Pet c= new Cat("야옹이", 3, "암놈"); 
		Pet d= new Dog("강아지", 10, "암놈","검정");
		Pet f= new Fish("븡어", 10, "암놈",2.5);
		Pet[] pets = new Pet[3];
		pets[0]= c;
		pets[1]= d;
		pets[2]= f;
		TestPet test = new TestPet();		
		test.petPrint(c);//cat을 pet타입으로 받아서 프린트 인포, cat이 호출 됨.
		//Pet p = test.petPrint(c); // Pet으로 받아왔기 때문에 Cat으로 형변환을 해줘야 함.
		//Cat cat = (Cat)p;		
		test.arrPirnt(pets);
		//test.petPrint(d);
		//test.petPrint(f);*/
		
//		System.out.println(c.printInfo()); //pet타입이지만 cat불러옴
	}
}
