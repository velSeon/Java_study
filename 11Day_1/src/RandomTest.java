import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Random  ran  = new Random();  
	       int n = ran.nextInt();
	       int m = ran.nextInt();
	       int z= ran.nextInt(100);//0부터 n-1까지
	       int z1= ran.nextInt(100)+1;//1~100
	       System.out.println(n);
	       System.out.println(m);
	       System.out.println(z);
	       
	       
	      boolean a = ran.nextBoolean();
	      System.out.println("임의의 논리값 :"+a);
	      
	      

	}

}
