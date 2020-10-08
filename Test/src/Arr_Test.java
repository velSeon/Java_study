import java.util.Scanner;

public class Arr_Test {
//	int [] arr = {10,20,30,40,50};
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		int a = scan.nextInt();
		scan.close();
//		CreateArr arr1 = new CreateArr();
//		int [] arrT = arr1.Arr_create();
		int [] arrT = new CreateArr().Arr_create();
//		CreateArr arr1 = new CreateArr();
//		int[] arrT = arr1.Arr_create();
		
		//int[] arrT = new CreateArr().Arr_create();

		Search index = new Search(arrT,a);
	
		


		Arr_Test arrTest = new Arr_Test();
		
//		int [] arr = arrTest.arr;
		
		int sum =0;
		
		printArr test = new printArr();
		Arr_Avg test1 = new Arr_Avg(); 
		sum = test.print(arrT);

		
//		System.out.println(index.searchIndex(arrT, a));
		System.out.println("sum"+sum);
		System.out.println("avg"+test1.cal_avg(sum, arrT.length));
		
		
		
	}

}
