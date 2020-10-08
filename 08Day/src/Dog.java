
public class Dog extends Pet{

//	private String name;
//	private int age;
	private String gender; //유일속성
	private String color; //유일속성
	
	
	
	public Dog(String name, int age,String gender, String color) {
		super(name, age);
		this.gender = gender;
		this.color = color;
	}
	
	@Override
	public String printInfo() {
		System.out.println("dog printInfo() 호출 ======");
		return super.printInfo()+gender+color;
		//return super.getname+ super.getage + gender+ color;
	}
	//개에 관련된 동작 함수 
	public void cryDog() {
		System.out.println("멍멍~");
	}
	public void eatDog() {
		System.out.println("사료 먹기");
	}
	public void sleepDog() {
		System.out.println("쿨쿨~");
	} 
	//다른 애완동물에 없는 기능 가정... 
	public void runDog() {
		System.out.println("발발~");
	}
		
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
