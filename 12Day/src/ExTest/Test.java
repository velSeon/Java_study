package ExTest;


public class Test {

	public static void main(String[] args) {
	 ExTest test= new ExTest();

	 try {
		 test.a(10, 0);
	} catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		
	}
	 
	 
	}

}
