import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수를 입력하세요.");
		int a = scan.nextInt();
		//String a = scan.next();
//		String a = Integer.parseInt(a);
		System.out.println("2.정수를 입력하세요.");
		String b = scan.next();
		System.out.println("정수" +a+"과"+"정수"+b+"의 합계:"+ (Integer.parseInt(a)+Integer.parseInt(b)));
		
		scan.close();
		
	}
}
