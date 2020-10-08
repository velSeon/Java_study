package test05;

import java.util.ArrayList;

public class Random {

	
	public ArrayList<Integer> makeRandomInt(ArrayList<Integer> list){
		for(int i =0;i<=10;i++) {
			int num = (int)((Math.random()*10));
			
			list.add(num);
			
		}
		return list;
	}
	public void printArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for(int i =0;i<=10;i++) {
			
			try {
				int avg = list1.get(i)/list2.get(i);
				System.out.println(list1.get(i)+"/"+list2.get(i)+"  "+avg);
			} catch (Exception e) {
				System.out.println("분모가 0입니다.");
			}
		}
	}
}
