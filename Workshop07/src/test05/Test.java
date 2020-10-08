package test05;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		 ArrayList<Integer> list1 = new ArrayList<Integer>();
	        ArrayList<Integer> list2 = new ArrayList<Integer>();
	        Random test= new Random();
	        list1 = test.makeRandomInt(list1);
	        list2 = test.makeRandomInt(list2);
	        test.printArrayList(list1, list2);
		
		

	}

}
