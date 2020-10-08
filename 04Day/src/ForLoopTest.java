
public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번. 이중for문
//		int i =0;
//		int j = 0;
//		int sum =0;
//for ( i = 2; i <= 9; i+=2) {
//	for ( j = 0; j <=9; j++) {
//		
//		System.out.println(i+"*"+j +"\t="+(i*j));
//		
//		
//	}
//	
//}
//System.out.println(i);
//System.out.println(sum);

		for (int i = 1; i <=10; i++) {
			
			for ( int j = 10; j > i; j--) {
				
				System.out.print("*");
								
			}System.out.println("*");
			
		}
		/*Switch 문
		String xxx="A";
		switch (xxx) {
		case "A":System.out.println("A"); break;
		case "A2":System.out.println("A2"); break;
		case "A3":System.out.println("A3"); break;
		case "A4":System.out.println("A4"); break;
		default: System.out.println("default");
		
		}*/	
		
	}

}
