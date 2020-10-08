
public class Pet {

	String name;
	int age;
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
	
	public Pet() {}
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	public String printInfo() {
		System.out.println("pat printInfo() 호출 ======");
		return name + ""+ age;
		//return name +""+ age;
	}
	
	
}
