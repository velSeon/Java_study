import java.util.Scanner;

public class IFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//1.단일if문
		System.out.println("문장1");
		int num=0;
		if(13==13) {
			num=10;
			System.out.println("문장2");
			System.out.println("문장2-1");
		}
		 System.out.println(num);
		System.out.println("문장3");	
		
		
		
		
		//2. if ~ else문
		System.out.println("문장1");
		int num = 0;
		if (3==4) {
			num=3;
			System.out.println("참");
			System.out.println("참2");
			System.out.println(num);
		}else {
			System.out.println(num);
			System.out.println("거짓");
			System.out.println("거짓2");
			
		}
		System.out.println(num);
		System.out.println("문장3");
	
		
	
		int num = 10;
		String result = "짝수";
		if(num%2==1) {
			result = "홀수";
			System.out.println(result+"입니다.");
		}
		else {
			System.out.println(result+"입니다.");
		}
	
		int num =10;
		String result ="";
		if(num%2==1){
		result = "홀수";} else{
		result="짝수";}
		System.out.println(num+"은"+result+"입니다.");
			
		//단일if문
		int n =10;
		if(n>5) {
			System.out.println(n+"은 5보다 크다");
		}
		System.out.println("프로그램종료");
			
		
		System.out.println("점수를 입력하시오.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num>=90) {
			System.out.println("A");
		}else if(num>=80) {
			System.out.println("B");
			
		}else if(num>=70) {
			System.out.println("C");
		}else if(num>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		scan.close();
		System.out.println("문장3");
		
	 System.out.println("점수를입력하시오.");
	 Scanner scan1 = new Scanner(System.in);
	 int num1 = scan1.nextInt();
	 String result;
	 if(num1>=90) {
		 result = "A";
	 }else if(num1>=80) {
		  result = "B";
	 }else if(num1>=70) {
		  result = "C";
	 }else if(num1>=60) {
		  result = "D";
	 }else {
		 result = "F";
	 }
	
	 System.out.println("점수는"+result);
	
		
		char ch = 'z';
		if('a' <= ch && ch <= 'z') {
			System.out.println(ch+"는 소문자");
		}else {
			System.out.println(ch+"는 대문자");
		}
	*/
		
	//1.new사용
		String s = new String("hello");
		String s2 = new String("hello");
		System.out.println(s==s2);//false
		boolean result = s.equals(s2); //내용비교
		System.out.println(result);//true
		
	//2.
		String n = "hello";//hello라는 문자를 만들고 n과 n2가 가지고 있는다.
		String n2 = "hello";//(주소가 같음)
		
		System.out.println(n==n2);//주소 비교로 true가 나온다.
		System.out.println(n.equals(n2));
		
		
		
	}
}
