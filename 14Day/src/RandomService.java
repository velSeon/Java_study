

import java.util.ArrayList;

public class RandomService {
	 ArrayList<Integer> list1 ;
	 ArrayList<Integer> list2  ;
	 
	 
	 public RandomService() {
		 super();
		 list1 = new ArrayList<Integer>();
		 list2 = new ArrayList<Integer>();
	 }
	public void makeRandomInt() {
		
		 for(int i = 0 ; i < 10; i++) {
			 
	            list1.add((int) (Math.random() * 10));	         	              
	            list2.add((int) (Math.random() * 10));	         
	            	 
	        }
		
			
	}

	public void printArrayList() {
		 for(int i = 0; i < 10; i++) {
	           
	            
	            try {
	                System.out.print(list1.get(i) + "/" + list2.get(i) + " ");
	                System.out.println(list1.get(i) / list2.get(i));
	                
	            } catch (Exception e) {
	                System.out.println("분모가 0입니다");
	            }
		 }
	}
	
	
}
