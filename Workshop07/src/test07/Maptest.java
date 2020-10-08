package test07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptest {

	public static void main(String[] args) {
	Map<String, Mobile> map = new HashMap<String, Mobile>();
	double sum =0;
	
	Mobile m1 = new Mobile("LU6800","Optimus 2X",800000.0);
	Mobile m2 = new Mobile("SU6600","Optimus Black",900000.0);
	Mobile m3 = new Mobile("KU5700","Optimus Big",8700000.0);
	Mobile m4 = new Mobile("SU7600","Optimus Mach",950000.0);
	
	map.put(m1.getCode(), m1);
	map.put(m2.getCode(), m2);
	map.put(m3.getCode(), m3);
	map.put(m4.getCode(), m4);

	Set<String>keys = map.keySet();
	for(String key : keys) {
		Mobile n = map.get(key);
		System.out.println(n.printInfo());
	}

	for(String key : keys) {
		Mobile n = map.get(key);
		sum += n.getPrice();
	}System.out.println(sum*1.1);
	
	for(String key : keys) {
		Mobile n = map.get(key);
		n.setPrice(n.getPrice()+n.getPrice()*0.1);
		
	}	
	System.out.println("가격변경후");
	double sum2 =0;
	for(String key : keys) {
		Mobile n = map.get(key);		
		System.out.println(n.printInfo());		
		sum2 += n.getPrice();
	}
	System.out.println("합계"+sum2);
	}

}
