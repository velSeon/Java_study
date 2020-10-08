
public class StudentTest {

	public static void main(String[] args) {
		Student stuArr [] = new Student[3];
		stuArr [0] = new Student("홍길동",15,170,80);
		stuArr [1] = new Student("한사람",13,180,70);
		stuArr [2] = new Student("임걱정",16,175,65);
		
		int maxAge = 0;
		
		for(int i=0;i<stuArr.length;i++) {
			if(stuArr[maxAge].getAge()<stuArr[i].getAge()) {
				maxAge=i;
			}
		}System.out.println("가장 나이가 많은 사람의 정보는? ");
		System.out.println("이름 : "+stuArr[maxAge].getName()+"\n나이 : "+stuArr[maxAge].getAge()+"\n신장 : "+stuArr[maxAge].getHeight()+"\n몸무게 : "+stuArr[maxAge].getWeight());

	}

}
