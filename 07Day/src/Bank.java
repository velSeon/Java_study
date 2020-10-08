
public class Bank {
	private static Bank b = new Bank(); //2.static변수  private 선언,
	//내부에서 객체생성
	private Bank() {}//1.생성자를 private 지정, 다른클래스에서 객체생성안됨, new안됨.
	public static Bank getBank() {
		return b;//3.생성한 객체를 리턴(필요한 곳에서 언ㄷ어서 사용)
		//4.사용하는 곳에서는 Bank b = Bank.getBank()로 얻음.
		
	}
public String getName() {
	return "xx은행";
}}