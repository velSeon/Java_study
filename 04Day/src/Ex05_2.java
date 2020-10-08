
public class Ex05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]num = {1,2,3};
//num = new int[4];
//
//num[0]=1;
//num[1]=2;
//num[2]=3;

for( int x :num) {
	System.out.println("정수 배열 값 : "+x);
	
}
String [] name = {"홍길동", "이순신","유관순"};
//name = new String[4];
//name[0]="홍길동";
//name[1]="이순신";
//name[2]="유관순";

for( String s : name) {
	System.out.println("문자열 배열 값 :" + s);
}
	}

}
