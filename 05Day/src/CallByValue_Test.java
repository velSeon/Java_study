
public class CallByValue_Test {
public int change(int num) {//call by value:
	//참조변수가 아니면 모두 인자변수에 복사됨, pdt변수들
	num=100;
	System.out.println("change num=="+num);
	return num;
}

	public static void main(String[] args) {
int num=1;
System.out.println("호출전 num====="+num);
CallByValue_Test test = new CallByValue_Test();
test.change(num);
System.out.println("호출 후 num====="+num);

	}

}
