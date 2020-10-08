import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수:");
		
		int num = scan.nextInt();
		int height[] = new int [num];
		for( int i=0;i<num;i++) {
			System.out.println("사람"+(1+i));
			height[i]= scan.nextInt();
		}
		int max = height[0];
		for(int i =0;i<height.length;i++) {
			if(max<height[i]) {
				max=height[i];
			}
		}System.out.println("최대값은"+max);
		
			
		
	}

}
