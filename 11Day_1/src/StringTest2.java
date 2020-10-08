
public class StringTest2 {

	public static void main(String[] args) {
	
		//String.valueOf : int 10이 String 10으로 변환. 문자열로 변환시킴.
		String z = String.valueOf(true); // "true"
		String z2 = String.valueOf(10);  //"10"
		String z3 = String.valueOf(3.24F);
		String z4 = String.valueOf(new char[] {'A','B'});
		String z5 = String.valueOf(4.5D);
		String z6 = String.valueOf(125L); 
		System.out.println(z);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(z6);
		
		//공백이 포함된 길이
		String t="  hEllo   ";
		System.out.println(t.length()); //10
		System.out.println(t.trim().length()); //5

		
		// String클래스의 메서드 사용법
		String xyz="helloworld";
		char[]xyz2 = xyz.toCharArray(); //문자 하나 하나를 배열에 넣어준다.
		for(int i=0;i<xyz2.length;i++) {
			System.out.println(xyz2[i]);
		}
		
		
		//특정문자 뽑아오기
		String q = xyz.substring(3); 
		String q2 = xyz.substring(3,7);
		System.out.println(q);
		System.out.println(q2);
		//기본 문자열을 수정해서 쓰는 것 Stringupper, Stringbuilder
		
		
		String mesg="홍길동,이순신,유관순";
		String [] n = mesg.split(","); //자를 기준을 정해서 배열 생성.
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		//System.out.println(n[3]);
		System.out.println(n.length);
		for(int x=0;x<n.length;x++) {
			System.out.println(n[x]);
		}
		
		
		String s ="hello";
		char x = s.charAt(0); //0번째의 h
		System.out.println(x);
		System.out.println(s.charAt(1));
		
		String x2 = s.concat("world"); //앞뒤 이어붙이기
		System.out.println(x2);
		System.out.println(s); //원본글자
		
		int x3=s.length();
		System.out.println(x3);
		
		String aaa ="Hello";
		String aaa2 ="hello";
		//System.out.println(aaa == aaa2);
		boolean result  =aaa.equals(aaa2);
		System.out.println(result);
		boolean result2  =aaa.equalsIgnoreCase(aaa2); //대소문자 상관없이 비교한다.
		System.out.println(result2);
		
		//h라는 글씨가 포함되어 있는지 검사.
		boolean kkk = s.contains("h");
		System.out.println(kkk);
		boolean kkk2 = s.contains("hx");
		System.out.println(kkk2);
		
		//o자로 끝나는가. 끝 글자가 o인가
		boolean kkk3 = s.endsWith("o");
		System.out.println(kkk3);
		

		boolean kkk4 = "world".endsWith("o");
		System.out.println(kkk4);
		
		boolean kkk5 = "world".startsWith("w");
		System.out.println(kkk5);
		//String.format: 뒤에 두개를 합처서 한단어로 만들어줌.
		String ppp = String.format("%s %d", "홍길동",20);
		
		int index = "hello".indexOf("a");
		System.out.println(index);
		//isEmpty ""로 되어있는 안이 비어있는지
		System.out.println("".isEmpty());
		System.out.println("".length()); //0
		
		System.out.println("abc".replace('a','A'));
		System.out.println("abc".replace("ab","xxx"));
		
		System.out.println("abc".toUpperCase());
		System.out.println("aBdE".toLowerCase());
		
		
	}

}


