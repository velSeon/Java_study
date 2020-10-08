
public class Sample01 {

	String name="홍길동";
	int age=25;
	
	
	public void printinfo() {
		System.out.println(name+age);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sample01 mem1 = new Sample01();
				mem1.age = 25;
mem1.printinfo();
System.out.println("이름은"+mem1.name+"나이는"+mem1.age);
					
			
				
	}


	
}
