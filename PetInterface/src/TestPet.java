
public class TestPet {

	public static void main(String[] args) {
		Cat c = new Cat ("고양이",10);
		System.out.println(c);
		Pet c1 = new Cat("고양이",10);
		System.out.println(c1);
		Movement c2 = new Cat("고양이",10);
		System.out.println(c2);
		
		c2.cry();
		
		Movement d = new Dog("강아지",10,"갈색");
		System.out.println(d);
		
		System.out.println("Movement Array=====");
		Movement mov []= new Movement[2];
		mov[0] = c;
		mov[1]= d;
		System.out.println(c.getName());
		for(Movement m : mov) {
			if( m instanceof Cat) {
				System.out.println(c.getGender());
			}
			System.out.println(m);
		}
		
		
	}

}
