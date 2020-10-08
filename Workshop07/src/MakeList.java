import java.util.ArrayList;

public class MakeList {

	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public MakeList() {}
	public void makeArrayList(int size) {
		
		
		for(int e = 0; e<size ;e++) {
//			int num = MathTest.Math();
			int num = (int)((Math.random()*10)+10);//0.0~0.9
			
			list.add(num);
		}
		
	}
	
	public double getAverage() {
		double getAverage =0;
		double totalInteger =0;
		//int num = integer;
		//sum+= num;
		//sum+=integer.inValue();
		//result = sum/list.size();
		for(int e =0; e<list.size();e++) {			
			totalInteger+=list.get(e).intValue();
	
		}getAverage = totalInteger/list.size();
		return getAverage;
		
		
	}
	public ArrayList<Integer> getList() {
		return list;
	}
	
	
	
}
