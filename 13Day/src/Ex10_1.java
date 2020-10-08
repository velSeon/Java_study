
public class Ex10_1 {

	public static void main(String[] args) {
		Object [] arr = {"홍길동","이순신","유관순"};
		for(Object obj : arr) {
			String name = (String)obj;
			System.out.println("이름 :"+name);			
		}
	}
}
