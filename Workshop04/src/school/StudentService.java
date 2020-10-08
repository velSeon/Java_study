package school;

public class StudentService {

	public double getAgeAvg(Student [] arr) {
		int totalAge=0;
		for(int i =0; i<arr.length;i++) {
			totalAge+=arr[i].getAge();
		}double getAge = (double)totalAge/arr.length;
		return getAge;
	}
	public double getHeighteAvg(Student [] arr) {
		int totalHeight=0;
		for(int i =0; i<arr.length;i++) {
			totalHeight+=arr[i].getAge();
		}double getHeight =totalHeight/arr.length;
		return getHeight;
	}
	public double getWeightAvg(Student [] arr) {
		int totalWeight=0;
		for(int i =0; i<arr.length;i++) {
			totalWeight+=arr[i].getAge();
		}double getWeight=totalWeight/arr.length;
		return getWeight;
	}
	public void printAllStudent(Student [] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public Student  getAStudentInfo(Student [] arr,String name) throws StudentNotFoundException{
		Student stu = null;
	
		for(Student student : arr) {
		if(name.equals(student.getName())) {
			stu = student;	} 
			
		}
		if(stu ==null) {
			throw new StudentNotFoundException("찾는 학생이 없습니다.");	
		}
		return stu;
	}}
	

