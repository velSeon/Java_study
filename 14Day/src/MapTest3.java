import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("m1", 1);
		map.put("m2", 2);
		map.put("m3", 3);
		map.put("m4", 4);
		map.put("m5", 5);
		map.put("m6", 6);
		map.put("m7", 7);
		map.put("m8", 8);
		map.put("m9", 9);
		map.put("m10", 10);
		int sum=0;
		int sum1=0;
		
//		for(int i=1;i<=10;i++) {
//			map.put(i+"", i);
//		}
		Set<String>keys = map.keySet();
		for(String key : keys) {			
			sum+=map.get(key);			
		}System.out.println(sum);
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			sum1+=map.get(key);
		}System.out.println(sum1);

	}

}
