
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu01 = new Student("Kim",100,90,95,89);
		Student stu02 = new Student("Lee",60,70,99,98);
		Student stu03 = new Student("Park",68,86,60,40);
		Student [] stu = new Student[3];
		stu[0]=stu01;
		stu[1]=stu02;
		stu[2]=stu02;
		
		
		for(Student x : stu) {
			System.out.printf("%s   평균:%.2f 학점: %s",x.getName(), x.getAvg(), x.getGrade());
			System.out.println();
			
		}


//		for(int i=0;i<stu.length;i++) {
//			for(int j=0;j<stu[i].length;j++) {
//				System.out.println(stu[i][j]);
//			
//						
//	}
//
//}
	
//		for(Student x : stu) {
//			if(x.getAvg()>)
//			System.out.printf("%s   평균:%.2f 학점: %s",x.getName(), x.getAvg(), x.getGrade());
//			System.out.println();
//			
//		}
}}
