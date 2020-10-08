
public class Sample02_variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.변수선언과 초기화 동시에
		String name = "홍길동";
		int age =20;
		String address = "서울";
		char gender = '남';
		boolean isMarried = false;
		float height = 185.63F;
		double weight = 78.25;
		
		System.out.println("이름은" +name + "나이" +age+ "주소는" +address+ "성별은" +gender +"결혼여부는"+ isMarried + "키는" +height +"몸무게는"+weight);
	
		System.out.printf("이름은%s, 나이는%d, 주소는%s,성별은%c, 결혼여부는%b, 키는%.2f,몸무게는%.2f",
				name,age,address, gender, isMarried , height ,weight);
	}

}
