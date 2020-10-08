
public class Dog {

	private String name;
	private int age;
	private String gender;
	private String color; //다른 애완동물에 없는 속성 가정...
	
	//dog에만 필요한 동작
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
	
	public Dog(String name, int age, String gender, String color) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;//Dog에만 존재하는 속성 가정
	}
	public void setColor(String color) {
		this.color = color;//Dog에만 존재하는 속성 가정
	}
	
	
}
