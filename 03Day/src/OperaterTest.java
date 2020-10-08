
public class OperaterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.대입연산자
		int x =10;
		int x2 = x;
		System.out.println(x2+= x); // x2= x2+x; ex) x+=1 -> x = x+1
		System.out.println(x2-=x); // x2= x2-x
		System.out.println(x2*=x); // x2 = x2 *x
		System.out.println(x2/=x); // x2 = x2 /x
		System.out.println(x2%=x); // x2 = x2 %x
		
		//3.증감연산자(증가/감소연산자)
		int k =10;
		//++k; //전치
		int a = ++k; //전치 k =k+1, int a =k
		System.out.println(a + "  "+ k);
		int b = k++;//후치 int b=k, K =K+1
		//k++; //후치
		System.out.println(b + "   "+k);
		
		//4.비교연산자
		
		int xyz =5;
		int xyz2 =3;
		boolean result = xyz == xyz2;
				System.out.println(xyz == xyz2);
		System.out.println(xyz !=xyz2);
		System.out.println(xyz > xyz2);
		System.out.println(xyz >= xyz2);
		System.out.println(xyz < xyz2);
		System.out.println(xyz <= xyz2);
		
		
		//5.논리연산자
		System.out.println(3==4 &&4>3);
		System.out.println(! true);
		System.out.println(! false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false ||false);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		
		int x1 = 10;
		int y1 = 15;
		System.out.println(x1>5 && x1<25);
		System.out.println(x1>8 && y1<10);
		System.out.println(x1>15 || x1 <25);
		System.out.println(x1>8 || y1<25);
		
		//6.3항연산자
		int xxx =(3==4)?100:200;		
		String xxx2 = (3!=4)?"A":"B";
		System.out.println(xxx);
		System.out.println(xxx2);
		
		
		int a1 =10;
		int b1 =20;
		int max = (a1>b1)?a1:b1;
		System.out.println(max);
		int max1 = (a1<b1)?b1:a1;
		System.out.println(max1);

		
		int aa = 10;
		int bb = 20;
		int cc = 30;
		int max3 = (aa>bb)?aa:bb;
		max3 = (max3>cc)? max3:cc;
		
		int max4 = (aa>bb && aa>cc)?aa:(bb>cc)?bb:cc;
		
	
		System.out.println(max3);
		System.out.println(max4);
	}
}
