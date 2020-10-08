
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =5;
		String result = (i%2 == 1)?"홀수":"짝수";
		System.out.println("숫자"+i+"는"+result +"입니다");
		
		int a =6;
		String result1 = (a%3 == 0)?"3의배수":"3의배수가아님";
		System.out.println("숫자"+a+"는"+result1 +"입니다");
		
		int b =60;
		String result2 = (b%3==0 && b%5==0)?"3과15의배수":"3과15의 배수가 아님";
		System.out.println("숫자"+b+"는"+result2);
	}

}
