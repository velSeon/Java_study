package book;

public class BookTest {
	public Book[] arrPrint(Book[] books) {		
		for(Book book : books) {
			System.out.println(book.getBookName()+book.getBookPrice()+ book.getBookDiscountRate()+book.getDiscountPrice());
		}//배열의 내용 수정 가정
		books[0] = new Book ("AAAA",50000,5);
		return books;
	}

	public static void main(String[] args) {
		Book bookArray [] = new Book[3];
		bookArray[0]= new Book("SQL Plus",50000,5.0);
		bookArray[1]= new Book("Java 2.0",40000,3.0);
		bookArray[2]= new Book("JSP Servlet",60000,6.0);
		Book[] books = new Book[3];
		BookTest test = new BookTest();
		Book[] returnbook = test.arrPrint(books);
		System.out.println(returnbook[0].getBookName());
		
//		Book[] books = new Book[3];
//		books[0] = bookone;
//		books[1] = book2;
//		books[3] = book3;
		
//		System.out.println("책이름 \t        가격   할인율  할인후금액");
//		
//		System.out.println(bookArray[0].bookName +"\t"+ bookArray[0].getBookPrice()+"\t"+bookArray[0].getBookDiscountRate()+"\t"+bookArray[0].getDiscountPrice());
//		System.out.println(bookArray[1].bookName +"\t"+ bookArray[1].getBookPrice()+"\t"+bookArray[1].getBookDiscountRate()+"\t"+bookArray[1].getDiscountPrice());
//		System.out.println(bookArray[2].bookName +"\t"+ bookArray[2].getBookPrice()+"\t"+bookArray[2].getBookDiscountRate()+"\t"+bookArray[2].getDiscountPrice());
	}

}
