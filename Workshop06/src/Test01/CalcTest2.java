package Test01;

public class CalcTest2 {
    public static void main(String[] args) {
        int data1 = Integer.parseInt(args[0]);
        String arg = args[1];
        char operator = arg.charAt(0);
        int data2 = Integer.parseInt(args[2]);
        Calculator2 calc= new Calculator2();

        if(operator == '+'){
            System.out.println(calc.plus(data1,data2));

        }else if(operator == '-'){
            System.out.println(calc.minus(data1,data2));

        }else if(operator == 'x'){
            System.out.println(calc.multiplication(data1,data2));

        }else if(operator == '/'){
            
        
        try {
        	System.out.println(calc.devide(data1,data2));
			
		} catch (ArithmeticException e) {
			System.out.println("오류:"+e.getMessage());
		}}
    }
}

