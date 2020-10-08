
public class Sample02_variable5_1 {//클래스블럭

	public static void main(String[] args) {//main블럭
		// TODO Auto-generated method stub

		//자바는 블럭 scope(자바스크립트는 함수 scope)
		int test =100;
		{//A블럭
			  int num =10;		
			  System.out.println(num);
			  System.out.println(test);
		}//A 블럭
		
		//System.out.println(num);//블럭 밖에서는 인식불가
		{//B블럭
			int num=20;
			System.out.println(num);
			System.out.println(test);
			
		}//B블럭
		//System.out.println(num);
	}//main 블럭
	
}//클래스블럭
