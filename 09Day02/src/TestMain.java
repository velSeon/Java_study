
public class TestMain {

	public static void main(String[] args) {
		Pet [] c = {
					new Cat("야옹이",3,"암놈"),
					new Cat("야옹이",3,"암놈"),
					new Dog("멍멍이",3,"암놈","검정")
					
		};
		for(Pet x:c) {
			System.out.println(x);//동적바인딩, toString()호출
		}

		
		Object [] b = {
						10,
						"홍길동",
						new Cat("야옹이",3,"암놈"),
						new Cat("야옹이",3,"암놈"),
						new Dog("멍멍이",3,"암놈","검정"),
		};
		for(Object object : b) {
			System.out.println(object); //toString()호출
		}
		//System.out.println("=========");
		
		
	}

}
