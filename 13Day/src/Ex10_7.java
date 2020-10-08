import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex10_7 {

	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("홍길동");
	list.add("이순신");
	list.add("유관순");
	list.add("홍길동");
	list.add("홍길동");
	list.add("홍길동");
	System.out.println("0위치값 출력 : "+list.get(0));
	System.out.println("toString() 전체 출력 : "+list);
	for(String data : list) {
		System.out.println("foreach 전체 출력:"+data);	
	}
	Iterator<String> ite = list.iterator()	;
	while(ite.hasNext()) {
		String data = ite.next();
		System.out.println("Iterator:"+data);
	}
	System.out.println("Set의 데이터 갯수?"+list.size());
	System.out.println("Set이 비어있냐?"+list.isEmpty());
	
	System.out.println("Set에 이순시 포함여부?"+list.contains("이순신"));

	Object [] arr = list.toArray();
	System.out.println("배열로 변환후 출력: "+Arrays.toString(arr));
	
	System.out.println("전체삭체 실행");
	list.clear();
	System.out.println("toString() 전체 출력: "+list);				
	}

}
