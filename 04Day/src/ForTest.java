
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int evensum= 0; //짝수
		 int oddsum=0;//홀수
		 
		for(int n=0; n <=100; n++) {
			//sum = sum + n;  
			if(n%2==0) {
				evensum += n;
	System.out.println("숫자"+n +"은"+ "짝수");
}else {
	oddsum += n;
	
	System.out.println("숫자"+n+"은"+"홀수");
}

//System.out.println("문장종료후 == " + sum);	
		}
		System.out.println("짝수 합은"+evensum+"홀수 합은"+oddsum);
		System.out.println("for문을 빠져나옴.");
	}
}

