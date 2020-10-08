
public class Ex08_7 {

	public static void main(String[] args) {
		//문자열 "123"을 정수 123로 변경
		String str = "123";
		int a = Integer.parseInt(str);
		//문자열 "3.14F"을 실수 3.13F로 변경
		String str2 = "3.14F";
		float b = Float.parseFloat(str2);
		//정수 123을 문자열 "123"로 변경
		String inStr = Integer.toString(123);
		//실수 3.14F을 문자열 "3.14F"로 변경
		String floatString = Float.toString(3.14F);
		
	System.out.println(b);

	}

}
