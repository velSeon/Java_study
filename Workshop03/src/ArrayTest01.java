
public class ArrayTest01 {

	public static void main(String[] args) {
		int [] arr = {10, 20,30,40,50};
		int sum = 0;
		double avg ;
//		double avg = 0;
		
//		for(int i : arr) {
//			sum+=i;
		
		printArr test = new printArr();
		sum=test.print(arr);
		avg = test.getAvg();
		
//		System.out.println("sum="+sum);

System.out.println(avg);
//		System.out.println("avg="+test.getAvg());

	}

}
