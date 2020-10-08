package test4_1;

public class TestStudent {

	public static void main(String[] args) {
		Student stu [] = new Student [3];
		stu[0] = new Student("Kim",100,90,95,89);
		stu[1] = new Student("Lee",60,70,99,98);		
		stu[2] = new Student("Park",68,86,60,40);
		
		System.out.println(stu[0].getName()+stu[0].getAvg()+stu[0].getGrade());
		System.out.println(stu[1].getName()+stu[1].getAvg()+stu[1].getGrade());
		System.out.println(stu[2].getName()+stu[2].getAvg()+stu[2].getGrade());
	}

}
