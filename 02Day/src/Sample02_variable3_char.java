
public class Sample02_variable3_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = 'A';
		char c2 = '홍';
		char c3 = '\uD64D';
		System.out.println(c+"  "+c2+ "  "+c3);
		
		//escape문자
		System.out.println("aaa\tbbb");
		System.out.println("aaa\nbbb");
		System.out.println("aaa\'bbb");
		System.out.println("aaa\"bbb");
		System.out.println("aaa\\bbb");
		
		
		//char는 수치형이다.
		char d = 'A'; //65아스키코드값
		char d1 = 'a'; //97아스키코드값
		char d2 = '1'; //49
		
		System.out.println(d+1);
		System.out.println(d1+1);
		System.out.println(d2+1);
		System.out.println(d2+2);
		
	}

}
