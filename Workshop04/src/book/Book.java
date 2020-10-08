package book;

public class Book {
	String bookName;
	int bookPrice;
	double bookDiscountRate;
	double getDiscountPrice;
	double dis =0;
	Book(){}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	
	}
	
	
	public double getDiscountPrice() {
		
		dis = bookPrice*(1-bookDiscountRate/100);
		return dis;
		
	}
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	public int getGetDiscountPrice() {
		return (int) getDiscountPrice;
	}

	public void setGetDiscountPrice(int getDiscountPrice) {
		this.getDiscountPrice = getDiscountPrice;
	}
	
	
}
