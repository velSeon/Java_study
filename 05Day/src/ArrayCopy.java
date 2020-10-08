
public class ArrayCopy {

	public static void main(String[] args) {
		int[] source = {1,2,3,4,5,6};
		int []destination = {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(source, 0, destination, 0, source.length);
		for(int i : destination ) {
			System.out.print(i);
		}

	}

}
