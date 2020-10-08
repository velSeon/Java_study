
public class Outer {

	//멤버변수
	public int n =10;
	protected int n2 =20;
	int n3 =30;
	private int n4 =40;
	static int n5 =50;
	//멤버 메서드
	public void x() {}
	
	// 멤버 inner클래스
	class Inner{
		int k =10;
		static final int NUM =20; //상수 가능
		//static int k2 =20;
		public void info() {//inner 안의 info
			System.out.println(n);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);  //private도 접근 가능
			System.out.println(n5);
			System.out.println(k);
			System.out.println(NUM);
			
		}
		
	}//end Inner
	//1. Outer에서 Inner생성
	public void innerCreate() {
		Inner i = new Inner();
		i.info();
	}
}