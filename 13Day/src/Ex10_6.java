import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10_6 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("홍길동");
		s.add("이순신");
		s.add("유관순");
		s.add("홍길동");
		s.add("홍길동");
		System.out.println("toString() 전체출력: "+s);
		for( String data :s) {
			System.out.println("foreach 전체 출력:"+data);
		}
		System.out.println("Set의 데이터 갯수?"+s.size());
		System.out.println("Set이 비어있냐?"+s.isEmpty());
		
		System.out.println("Set에 이순시 포함여부?"+s.contains("이순신"));
		System.out.println("이순신 삭제 실행");
		s.remove("이순신");
		System.out.println("=====");
		Object [] xxx = s.toArray()	;
		for(Object o :xxx) {
			System.out.println(o);
		}
		System.out.println("=====");
		for( String data : s) {
			System.out.println("for each: "+data);					
		}		
		Iterator<String>ite = s.iterator()	;
		while(ite.hasNext()) {
			String data = ite.next()	;
			System.out.println("Iterater: "+data);
		}
		System.out.println("전체 삭제 실행");
		s.clear();
		System.out.println("toString() 전체 출력: "+s);				
	}
}
