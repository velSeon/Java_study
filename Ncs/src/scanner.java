import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		String a = scan.next();
	
		System.out.println(Integer.parseInt(a));
		
	}

}
