
public class printArr {
int sum;

	public int print(int [] arr) {
		int a = arr.length;
		for( int x : arr) {
			sum+=x;
			
		}
		return sum;
	}
//	public double getAvg() {
//		return sum/a;
//	}
}
