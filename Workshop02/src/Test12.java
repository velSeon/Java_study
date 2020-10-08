import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		int n;
		do {
			System.out.println("양수 정수 값 입력:");
			n=scan.nextInt();
					
		}while (n<=0);
		int count =0;
		while(n>0) {
			n/=10;
			count++;
		}System.out.println("그 자리수는 "+count+"입니다.");
	}

}
