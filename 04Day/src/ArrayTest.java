
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//int[] kor = new int[3];
//		kor[0]=100;
//kor[1]=80;
//kor[2]=80;
		int[] kor = {100,80,80};
		
int[] eng = new int[3];
		eng[0]=90;
eng[1]=75;
eng[2]=60;

int sum =0;
int sum1 =0;
for(int i=0; i<kor.length;i++) {
	sum = sum + kor[i];
	sum1= sum1 + eng[i];
			

	}System.out.println("kor평균은"+sum/kor.length);
	System.out.println("eng평균은"+sum1/eng.length);
	
	int sum2=0;
for(int x : kor) {
	sum2=sum2+x;
	
}System.out.println("kor평균은"+ sum2/kor.length);	

int sum3=0;
for(int y :eng) {
	sum3 = sum3+y;
}
System.out.println("eng평균은"+sum3/eng.length);
}
}
