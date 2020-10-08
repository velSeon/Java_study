class Cat{
	String name;
	public Cat(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class Ex05_25 {

	public static void main(String[] args) {
		//1. new 이용
		Cat [] cats = new Cat[3];
		cats[0]= new Cat("나비");
		cats[1]= new Cat("야옹이");		
		cats[0]= new Cat("점박이");
		//2.리터럴 이용
		Cat [] cats2 = { new Cat("나비"),
				new Cat("야옹이"), new Cat("점박이"), new Cat("하늘")};
		//3. new + 리터럴 이용
		Cat[] cats3 = new Cat[] { new Cat("나비"),
				new Cat("야옹이"), new Cat("점박이"), new Cat("하늘")};
		
		for(Cat c : cats3) {System.out.println("이름:"+ c.getName());
	}
	}
}
