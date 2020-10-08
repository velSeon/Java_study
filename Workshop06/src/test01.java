import java.util.StringTokenizer;

public class test01 {


	public static void main(String[] args) {
		
		String mesg ="4,2,3,6,7";
		
		
		StringTokenizer str = new StringTokenizer(mesg,",");
		
		//str = new StringTokenizer(mesg,",");
		int sum =0;
		while(str.hasMoreElements()) {
			sum+= Integer.parseInt(str.nextToken());
			
			
		}System.out.println(sum);

	}

	
}
