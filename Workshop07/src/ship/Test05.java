package ship;

import java.util.ArrayList;



public class Test05 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for(int i =0;i<=10;i++) {
			int num = (int)((Math.random()*10));
			list1.add(num);
			
		}
		for(int i =0;i<=10;i++) {
			int num = (int)((Math.random()*10));
			list2.add(num);
		}
		
		for(int i =0;i<=10;i++) {
		try {
			
			int avg = list1.get(i)/list2.get(i);
			System.out.println(list1.get(i)+"/"+list2.get(i)+"  "+avg);
			
		} catch (ArithmeticException e) {
			System.out.println("분모가 0입니다."+e.getMessage());
		}
		}
		
	}

}
