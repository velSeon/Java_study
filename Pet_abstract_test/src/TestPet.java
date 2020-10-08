
public class TestPet {
	public  void petPrint(Pet p) {
		
	}
	public static void main(String[] args) {
		Pet c= new Cat("야옹이", 3, "암놈"); 
		Pet d= new Dog("강아지", 10, "암놈","검정");
		Pet f= new Fish("븡어", 10, "암놈",2.5);
		TestPet test= new TestPet();
		test.petPrint(c);
		c.cry();
		c.eat();
		c.sleep();
		
		System.out.println(d);
		d.cry();
		d.eat();
		d.sleep();
		d.getGender();
System.out.println(c.getName());
System.out.println(d.getGender());
	}
}
