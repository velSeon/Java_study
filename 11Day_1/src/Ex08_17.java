import java.util.Arrays;

public class Ex08_17 {

	public static void main(String[] args) {
		// 1.배열복사
		  String [] str = {"홍길동","이순신","유관순"};
		  String [] str2 = Arrays.copyOf(str, str.length);
		  for(String name : str) {
			  System.out.println("이름: "+name);
		  }
		  //2. 특정값으로 전체 채우기
		  int []nums = {10,20,30};
		  Arrays.fill(nums, 100);
		  for(int num :nums) {
			  System.out.println("fill값 :"+num);
		  }
		  //3.특정값 일부부만 채우기
		  String [] fruits = {"사과","배","수박","바나나"};
		  Arrays.fill(fruits, 0,2,"딸기");
		 for(String fruit : fruits) {
			 System.out.println("fruit: "+fruit);
		 }
		 //4.배열비고
		 String[]p = {"홍길동","이순신","유관순"};
		 String[]p2 = {"홍길동","이순신","유관순"};
		 System.out.println(Arrays.equals(p, p2));
		 //5.정수형 정렬
		 int [] num = {22,1,3,5,2,4,11};
		 Arrays.sort(num);
		 for(int i : num) {
			 System.out.println("정렬된 정수값: "+i);
		 }
		 //6.문자열정렬
		 String [] name = {"xMan","Alex","XMan","Bob","Curl","flex","alex"};
		 Arrays.sort(name);
		 for(String n: name) {
			 System.out.println("정렬된 이름: "+n);
		 }
		 //7.인덱스찾기
		 String[]s = {"홍길동","이순신","유관순"};
		 int index = Arrays.binarySearch(s, "이순신");
		 System.out.println(index);
				 //Arrays.toString(a)
	}

}
