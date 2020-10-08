import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

class Box<T>{
	T obj;
	public void setValue(T obj) {
		this.obj = obj;		
	}
	public T getValue() {
		return obj;		
	}	
}
public class GenericTest02 {

	public static void main(String[] args) {
//		HashMap<K, V>
//		K: key, V: value
//		ArrayList<E>
//		E:요소 (Element)
		//제네릭스 타입(Generics type)
		Box<String> b = new Box<String>();
		//T가 String으로 변화
		b.setValue("Hello");
		String str = (String)b.getValue();
		//b.setValue(new Date()); -String 타입만 가능하기때문에 
		//Date xx = (Date)b.getValue(); -컨파일에러 발생.		
		System.out.println(str);
		
		Box<Date> b2 = new Box<Date>();
		b2.setValue(new Date());
		Date d = (Date)b2.getValue();
		System.out.println(d);		
		//b2.setValue(String);-Date값만 받는다고 Set했기때문
		
		Box<Integer>b3 = new Box<Integer>();
		b3.setValue(100);
		//b3.setValue("100");
		int xxx = b3.getValue();
		System.out.println(xxx);
	}
}