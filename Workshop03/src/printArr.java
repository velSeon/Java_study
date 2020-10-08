
public class printArr {		
	private double avg;
	int sum;
	int lenght;
	public int print(int [] arr){
//		int sum = 0;
		for(int i : arr) {
			sum+=i; 
			}
		lenght = arr.length;
		
//		avg = sum/arr.length;
		return sum;		
					}
	public double getAvg() {
		System.out.println();
		avg = sum/lenght;
		return avg;
	/*
public double getAvg(String name) {
	System.out.println(name);
	avg = sum/lenght;
	return avg;
	*/
}


}
