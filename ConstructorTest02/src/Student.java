//현실세계의 학생 객체에서 뽑은 학생클래스
public class Student {
//인스턴스변수,멤버변수class범위(메소드밖에서선언)
	//-메서드 밖에서 static(x), new 사용시 변수 생성,자동으로초기화(각 타입별 default 값)
	//생성시점? 객체생성~객체소멸(참조변수가못가리킬때)
	private String name;//생성가능, 다른클래스에서 접근불가
	private int age;
	private String address;	
	private Book writtenBook;
	
	public void setwrittenBook (Book writtenBook) {
		this.writtenBook = writtenBook;
	}
	
	public Book getwrittenBook() {
		return writtenBook;
	}
	
	//생성자 수정 - 생성과 동시에 받아온 값으로 초기화
	
	public Student () {}//기본생성자를 명시적으로 꼭 기재할것.
	
	public Student(String name, int age, String address) {//접근 제한자가 붙고, return타입이 없다, 클래스이름()
		System.out.println("Student 생성자 호출");
		this.name = name;
		this.age = age;
		this.address = address;
		
	}
	public String printInfo() {
//		return name +":"+ age+":" + address;
		return getName() +":"+ getAge()+":" + getAddress(); //getName 호출해서 사용
	}

	
	public String stuInfo() {
		return name +""+ age +""+ address;
	}
	
	public String getName() {
		return name;}
	public void setName(String name) {//설정할 경우 set을 붙이고 변수이름을 붙인다.설정함수
		this.name = name;//private에서 name를 막아줬지만, 같은 클래스 안에서 사용가능.
	}
		public int getAge() {
		return age; }
		
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;}
	public void setAddress(String address) {
		this.address = address;
	
	
	
	


	}//멤버변수 name 값 설정함수

	

	}//멤버변수 name값을 필요한 곳으로 보내주는 함수. 가져가는 함수.
		

