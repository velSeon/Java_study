import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	scan = new Scanner(System.in); 
		
		System.out.println("1.이름을 입력하세요.");
		String name = scan.next();// 화면에 써주는 글씨를 받아서 name에 저장해줌.
		System.out.println("2.나이을 입력하세요.");
		String age = scan.next();//next가 글씨를 받아서 age에 저장해주는 것이기 때문에 숫자형은 받지 못함.
		System.out.println(name + "\t" + age);
		
		scan.close();
						
	}

}
