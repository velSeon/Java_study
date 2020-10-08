
public class EnumTest4 {

	//상수
	public enum DML { SELECT, INSERT, DELETE}
	
	public static void check(DML num) {
		//byte,short,int,char,String ,enum
		switch(num) {
		case SELECT: System.out.println("SELECT");break;
		case INSERT: System.out.println("INSERT");break;
		case DELETE: System.out.println("DELETE");break;
		default: System.out.println("default");break;
		}
	}
	public static void main(String[] args) {
		// enum는 상수 대체 가능
		check(DML.SELECT);  //1.SELECT 2:INsERT 3;DELETE
		check(DML.INSERT);
		check(DML.DELETE);
		//check(99); 99인트타입이고 dml타입이 아니기 때문에 컨파일에러발생//의미없는 숫자지정 불가능
		
		
	}//end main0
}//end class
