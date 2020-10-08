package Test01;

public class CalcTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("프로그램 시작");
		int data1 = Integer.parseInt(args[0]);		
		String symbo1 = args[1];
		int data2 = Integer.parseInt(args[2]);
	

		if(symbo1.equals("+")) {
		System.out.println(cal.plus(data1, data2));
		
	}else if(symbo1.equals("-")){
		System.out.println(cal.minus(data1, data2));
	}else if(symbo1.equals("x")){
		System.out.println(cal.multiplication(data1, data2));
	
}else if(symbo1.equals("/")){
	System.out.println(cal.divide(data1, data2));}
		
	}}
