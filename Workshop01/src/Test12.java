
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesg = "heLLO";
		System.out.println("대문자로: "+mesg.toUpperCase());
		System.out.println("소문자로: "+mesg.toLowerCase());
		System.out.println("문자열 길이: "+mesg.length());
		System.out.println("1번째 위치 문자: "+mesg.charAt(1));
		System.out.println("문자열 연결: "+mesg.concat(" ~~~"));
		System.out.println("h 문자열 포함 여부: "+mesg.contains("h"));
		System.out.println("he문자열 포함 여부: "+mesg.contains("he"));	
		System.out.println("hw 문자열 포함 여부: "+mesg.contains("hw"));		
		System.out.println("h 문자로 끝나는 여부: "+mesg.endsWith("h"));		
		System.out.println("h 문자로 시작하는지 여부: "+mesg.startsWith("h"));		
		System.out.println("O 문자를 X문자로 변경: "+mesg.replace("O","X"));		
		System.out.println("heLLO 문자열인지 비교: "+mesg.equals("heLLO"));
		System.out.println("HELLO 문자열인지 비교(대소문자무시):"
				+ mesg.equalsIgnoreCase("heLLO"));
	}

}
