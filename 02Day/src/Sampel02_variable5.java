
public class Sampel02_variable5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num_1 = 10;
int num_2 = 20; //변수명 중복 사용 불가
int result = num_1 + num_2;
System.out.println(num_1);
System.out.println(num_2);
System.out.println(result);

long num = 1000000000000000000L;

System.out.println(num);


int n =10;
float f = 20.3f;
double d = n + f; //결과는 실수

System.out.println(d);


short s= 10;
short s2=20;
short s3= (short) (s+ s2);

//명시적 형변환
int m = 10;
short n2 = (short)m;
System.out.println(n2);

short x =10;
short x2 = 20;
short x3 = (short)(x+x2);
//short x4 = (short) x + x2;//괄호 써줘야 함.

System.out.println(x3);






	}

}
