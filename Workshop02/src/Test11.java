import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a의 값:");
		int a = scan.nextInt();
		
		int b = 0;		
		while(b<a) { //while(true)도 가능
			System.out.println("b의값:");
			b = scan.nextInt();
			if(b>a) break;
				System.out.println("a보다 큰 값을 입력하세요!");
				
			
		}System.out.println("b-a는"+ (b-a)+"입니다.");
	
		
		
		
		
		
	
		
//	  for(true) {
//		  if(a>b) {
//			  System.out.println("b-a는"+ (b-a)+"입니다.");
//			  break;
//		  }else {
//			  System.out.println("a보다 큰 값을 입력하세요!");
//			  break;
//		  }
	  

				
				

	}

}
