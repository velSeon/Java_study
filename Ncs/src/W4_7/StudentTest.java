package W4_7;

public class StudentTest {

	public static void main(String[] args) {
		Student stuArr [] = new Student [3];
		stuArr[0] = new Student("홍길동",15,170,80);
		stuArr[1] = new Student("한사람",13,180,70);
		stuArr[2] = new Student("임걱정",16,175,65);
		
		double totalage=0;
		double totalheight=0;
		double totalweight=0;
		
		int maxAge=0;
		int minAge=0;
		int maxHeight=0;
		int minHeight=0;
		System.out.println("이름  나이  신장  몸무게");
		for(int i =0;i<stuArr.length;i++) {
			System.out.println(stuArr[i].studentInfo());
			totalage+=stuArr[i].getAge();
			totalheight+=stuArr[i].getHeight();
			totalweight+=stuArr[i].getWeight();
			
			if(stuArr[maxAge].getAge()<stuArr[i].getAge()) {
				maxAge=i;
			}if(stuArr[minAge].getAge()>stuArr[i].getAge()) {
				minAge=i;
			}if(stuArr[maxHeight].getHeight()<stuArr[i].getHeight()) {
				maxHeight=i;
			}if(stuArr[minHeight].getHeight()>stuArr[i].getHeight()) {
				minHeight=i;
			}
		}
		System.out.println();
		System.out.printf("나이 평균:%.3f",(totalage/stuArr.length));
		System.out.printf("신장 평균:%.3f",(totalheight/stuArr.length));
		System.out.printf("몸무게 평균:%.3f",(totalweight/stuArr.length));
		
		System.out.println("\n나이가 가장 많은 학생"+stuArr[maxAge].getName());
		System.out.println("나이가 가장 적은 학생"+stuArr[minAge].getName());
		System.out.println("신장가 가장 많은은 학생"+stuArr[maxHeight].getName());
		System.out.println("신장가 가장 적은은 학생"+stuArr[minHeight].getName());
	}

}
