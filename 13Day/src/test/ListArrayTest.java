package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("세종");
	
		
		List<String> list2 = Arrays.asList("홍길동","이순신","세종","세종");
		System.out.println(list);
		System.out.println(list2);
		System.out.println("특정값 위치"+list2.indexOf("홍길동"));
		
		List<String> sub = list.subList(0, 3);
		System.out.println("sub>>"+sub);

	}
}
