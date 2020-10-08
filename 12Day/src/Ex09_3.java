
public class Ex09_3 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
//		String name = null;
//		int [] num2 = {10,20};
//		System.out.println(num2[3]);
		
		try {
//			int [] num2 = {10,20};
//			System.out.println(num2[3]);
			int num =3 /0;
//			System.out.println("문자열의 길이:"+name.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException"+e.getMessage());
		}catch(ArithmeticException e2) {
			System.out.println("ArithmeticException"+e2.getMessage());
		}catch(Exception e3) {
			System.out.println("모든 예외처리 가능+예외발생3"+e3.getMessage());
		}
		System.out.println("프로그램 정상 종료");
		
		try {
			String name = null;
			System.out.println(name.length());
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException"+e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}

}
