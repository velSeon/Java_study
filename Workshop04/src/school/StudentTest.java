package school;

public class StudentTest {

	public static void main(String[] args) {
		Student [] stuArr = new Student[3];
		stuArr [0] = new Student ("홍길동",15,171,81);
		stuArr [1] = new Student ("한사람",13,183,72);
		stuArr [2] = new Student ("임걱정",16,175,65);

		double totalAge = 0;
		double totalHeight = 0;
		double totalWeight = 0;
		
		for(int i =0; i<stuArr.length;i++) {
			totalAge+= stuArr[i].getAge();
			totalHeight+=stuArr[i].getHeight();
			totalWeight+=stuArr[i].getWeight();
		}
		System.out.println("나이평균:"+(totalAge/stuArr.length));
		System.out.println("키평균:"+(totalHeight/stuArr.length));
		System.out.println("몸무게평균:"+(totalWeight/stuArr.length));
		
		StudentService service = new StudentService();
		Student stu = null;
		try {
			stu = service.getAStudentInfo(stuArr, "홍길동");
			System.out.println("검색결과===="+stu);
				
			}catch(StudentNotFoundException e) {
				System.out.println(e.getMessage());
		}
		
		totalAge = service.getAgeAvg(stuArr);
	}

}
