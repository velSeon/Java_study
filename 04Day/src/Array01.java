
public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []num;
num = new int[5];
num[0] = 10;
num[1] = 20;
num[2] = 30;
num[3] = 100;
num[4] = 80;
/*
//System.out.println(num[4]); num[4]을 초기화하여 값을 정해주지 않으면 0값이 들어가있음.

System.out.println("배열의 크기(길이)는"+ num.length);
int sum = 0;
for(int i =0; i<num.length;i++) {
	sum = sum + num[i];
	
}
System.out.println("총합 ="+sum);
System.out.println("평균 ="+sum/num.length);

*/
//for each문
int sum=0;
for(int x : num) {
	System.out.println(x);
	sum= sum + x;
}System.out.println("for_each 총합 ="+sum);
System.out.println("평균 ="+sum/num.length);
//배열의 크기 만큼만 들어간다. (배열의 인수값 :배열이 들어가 있는 변수명)




	}

}
