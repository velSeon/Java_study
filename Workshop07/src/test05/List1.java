package test05;

import java.util.ArrayList;

public class List1 {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	public ArrayList<Integer> makeRandonInt() {
		for(int i =0;i<=10;i++) {
			int num = (int)((Math.random()*10));
			list1.add(num);
		}
		return list1;
	}	




}
