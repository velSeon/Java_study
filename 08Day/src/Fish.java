
public class Fish extends Pet{

//	private String name;
//	private int age;
	private String gender; //유일속성
	private double tailSize; //Fish에만 존재하는 유일속성
	public Fish(String name, int age,String gender, double tailSize) {
		super(name, age);
		this.gender = gender;
		this.tailSize = tailSize;
	}
	@Override
	public String printInfo() {
		System.out.println("fish printInfo() 호출 ======");
		return super.printInfo()+gender+tailSize;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//동작
	public void swimFish() {
		System.out.println("어푸어푸~");
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
	//Fish 클래스 유일 함수
	public double getTailSize() {
		return tailSize;
	}
	//Fish 클래스 유일 함수
	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}
	
	
	
}
