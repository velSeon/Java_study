import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassforNameTest {

	public static void main(String[] args) throws Exception {
		Class cl = Class.forName("java.lang.Math");
		Field [] fiedls = cl.getDeclaredFields();
		for(Field f : fiedls) {
			System.out.println("fiedls: "+ f.getName());
		}
		Method [] methods = cl.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println("methods: "+m.getName());
		}

	}

}
