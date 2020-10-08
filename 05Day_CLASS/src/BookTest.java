
public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
			
		book1.name = "홍길동전";
		book1.price = 1000;
		
		book2.name = "오만과편견";
		book2.price = 2000;
		
		System.out.println(book1.name);
		System.out.println(book1.price);
		System.out.println(book2.name);
		System.out.println(book2.price);
	
	}

}
