
public class StringBuffTest {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		s.append("world");
		System.out.println(s);
		s.insert(5, "!!!");
		System.out.println(s);

	}

}
