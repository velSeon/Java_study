package Test01;

public class Calculator {
	double plus(int a, int b) {
return a+b;
}
	double minus(int a, int b) {
		return a-b;
		}
	double multiplication(int a, int b){
		return a*b;
	}
	float divide(float a, float b){

		try {
			float num = (float) a / b;
	
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return a/b;
	}
	
	
}
	
