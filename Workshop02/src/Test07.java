import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 자리 정수값을 입력하시오");
		int a = scan.nextInt();
	int sum=0;

		for(int i= 1; i<=20;i++){
			sum+=(a*i);
			if(a*i!=100) {
				
			//System.out.print(a*i+"+");
			System.out.print((a*i)+"+");}
			
			else if(a*i==100) {
				System.out.print((a*i));
			
		}
			
				
	} System.out.print("="+sum);

}}
