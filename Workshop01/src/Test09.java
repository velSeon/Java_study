import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수를 입력하세요");
		int a =scan.nextInt();
//		String a = scan.next();
		System.out.println("2.정수를 입력하세요");
		int b = scan.nextInt();
		int max = (a>b)?a:b;
		System.out.println("정수 " + a +"과 " +"정수 " + b +"중에서 최대값:"  +max);
//		String b = scan.next();
//		int a1 = Integer.parseInt(a);
//		int b1 = Integer.parseInt(b);
//		
//		int b2 = (a1>b1)?a1:b1;
//		System.out.println("정수 " + a +"과 " +"정수 " + b +"중에서 최대값:"  +b2);
		
		scan.close();
		
	}

}
