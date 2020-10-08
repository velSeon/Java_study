package test04_02;

public class TestStudent {

	public static void main(String[] args) {
		Student stuArr[] = new Student [3];
		stuArr[0] =  new Student("Kim",100,90,95,89);
		stuArr[1] =  new Student("Lee",60,70,99,98);
		stuArr[2] =  new Student("Park",68,86,60,40);
		
		for(int i =0; i<stuArr.length;i++) {
			System.out.println("이름은: "+stuArr[i].getName()+"\t평균은: "+stuArr[i].getAvg()+"\t학점은: "+stuArr[i].getGrade());
		}
				

	}

}
