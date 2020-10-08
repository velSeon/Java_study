import java.util.Date;

class Box{
	Object obj;
	public void setValue(Object obj) {
		this.obj = obj;		
	}
	public Object getValue() {
		return obj;		
	}	
}
public class GenericTest {

	public static void main(String[] args) {
		Box b = new Box();
		b.setValue("Hello");
		String str = (String)b.getValue();
		System.out.println(str);
		
		Box b2 = new Box();
		b.setValue(new Date());
		Date d = (Date)b2.getValue();
		System.out.println(d);
		
	}

}
