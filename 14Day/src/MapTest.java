import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,Person> map = new HashMap<>();
		map.put("one", new Person("홍길동",20,"서울"));
		map.put("two", new Person("이순신",30,"전라"));
		map.put("three", new Person("유관순",40,"서울"));
		
		//get(key)
		System.out.println(map.get("one").getName());
		Person one = map.get("one");
		System.out.println(one.getName());
		
		Set<String>keys = map.keySet();
		for(String key : keys) {
			Person p = map.get(key);
			System.out.println(p.getName());
			//System.out.println(key+ "="+ map.get(key).getName());
		}
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {			
			String key = ite.next();
			Person p = map.get(key);
			System.out.println(key+ "="+p.getName());
			//System.out.println(key +map.get(key).getName());
		}
	}

}
