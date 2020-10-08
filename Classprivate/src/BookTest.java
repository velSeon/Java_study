
public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.setName("홍길동전");
		String name = book1.getName();

		book2.setName("오만과편견");
		System.out.println(book2.getName());
	
		
		book1.setPrice(1000);
		int price = book1.getPrice();
		
		book2.setPrice(2000);
		int price1 = book2.getPrice();
		
		
		
			
				
/*		Book book2 = new Book();

			
		book1.name = "홍길동전";
		book1.price = 1000;
		
		book2.name = "오만과편견";
		book2.price = 2000;
		
		System.out.println(book1.name);
		System.out.println(book1.price);
		System.out.println(book2.name);
		System.out.println(book2.price);
*/	
	}

}
