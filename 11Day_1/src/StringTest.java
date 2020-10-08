
public class StringTest {

	public static void main(String[] args) {
		String a ="hello";
		String b ="hello";
		System.out.println("a==b:\t"+(a==b));
		System.out.println("a.equals(b)=====:"+a.equals(b));
		
		String c = new String("hello");
		String d = new String("hello");
		
		System.out.println("c==d:\t"+(c==d));
		System.out.println("c.equals(d)=====:"+c.equals(d));
		

	}

}
