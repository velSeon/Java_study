package cafe;

public class CafeTest {

	public static void main(String[] args) {

		Cafe cafe = new Cafe();
		cafe.setCofeeList(new Coffee("아메리카노", 1000));
		cafe.setCofeeList(new Coffee("라떼", 1000));
		cafe.setCofeeList(new Coffee("바닐라라떼", 1000));
		cafe.setCofeeList(new Coffee("블루베리스무디", 1000));
		cafe.setCofeeList(new Coffee("모카라떼", 1000));
		cafe.setCofeeList(new Coffee("초콜릿라떼", 1000));
		cafe.setCofeeList(new Coffee("오곡라떼", 1000));
		cafe.setCofeeList(new Coffee("티", 1000));
		Coffee [] arr = cafe.getCofeeList();
		for (Coffee coffee : arr) {
			System.out.println(coffee);}
	
System.out.println("Coffee 가격의 합:"+cafe.totalPrice());
	}

}
