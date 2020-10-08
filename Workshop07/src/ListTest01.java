import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		//int size = Integer.parseInt(args[0]);
		int size = 10;
		MakeList makeList = new MakeList();
		makeList.makeArrayList(size);//size만큼 랜덤한 숫자를 ArrayList에  ㅁㅇㅇ
		
		double avg = makeList.getAverage();//평균 구하는 함수 호출
		System.out.println("평균값"+avg);
		ArrayList<Integer> list = null;
		list = makeList.getList();

	}

}
