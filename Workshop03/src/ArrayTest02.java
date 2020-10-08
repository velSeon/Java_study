
public class ArrayTest02 {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
//		for(int x : arr) {
//			sum+=x;
		PrintArr01 test = new PrintArr01();
		
		sum=test.print(arr);
		System.out.println("sum="+sum);
		
			
			
		}

	}


