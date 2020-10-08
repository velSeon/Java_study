
public class array {

	public void printArr(int[] num) {//()안에 받을 인자 타입, 변수
		System.out.println("printArr======호출");
//		System.out.println(receive);
		for(int i=0;i<num.length;i++) {
			System.out.println(">>"+num[i]);
		}
	}
	public void printForEach(int [] num_a) {
		for(int x : num_a) {
			System.out.println(">>"+num_a[x]); 
		}
	}
	
	
	public static void main(String[] args) {
		//1.배열 선언
		//데이터타입[] 변수명;
		System.out.println("main시작======");
		array test = new array();
		
		int [] num;
		//2.배열 생성
		//변수명 =new 데이터타입[크기];
		num = new int[3];
		//3.배열초기화
		num[0] =10;
		num[1] = 20;
		num[2] =30;
		
		
		
		int [] num_1;
		//2.배열 생성
		//변수명 =new 데이터타입[크기];
		num_1 = new int[3];
		//3.배열초기화
		num_1[0] =10;
		num_1[1] = 20;
		num_1[2] =30;
		
		
		
		test.printArr(num);//함수 호출 및 값 전달
		test.printArr(num_1);
		test.printForEach(num_1);
		System.out.println("main수행=========");
		
//		num[3]=40;		
/*		System.out.println(num[0]);	
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println("배열의크기(길이)"+num.length);

		for(int i=0;i<num.length;i++) {
			System.out.println(">>"+num[i]); */
		}
		
			
		
	
}
