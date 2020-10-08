package W4_1;

public class TestStudent {

	public static void main(String[] args) {
		Student stu[] = new Student [3];
		stu[0] = new Student("Kim",100,90,95,89);
		//Student stu01 = new Student("Kim",100,90,95,89);
		Student stu02= new Student("Lee",60,70,99,98);
		Student stu03= new Student("Park",68,86,60,40);
		
		System.out.println(stu01.getName()+""+stu01.getAvg()+""+stu01.getGrade());
		System.out.println(stu02.getName()+""+stu02.getAvg()+""+stu02.getGrade());
		System.out.println(stu03.getName()+""+stu03.getAvg()+""+stu03.getGrade());
		

	}

}
