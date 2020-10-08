
public class Student {

	private String name;
	private int Korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {}
	public Student(String name, int Korean, int english, int math, int science) {
		this.name = name;
		this.Korean = Korean;
		this.english = english;
		this.math = math;
		this.science = science;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return Korean;
	}
	public void setKorean(int korean) {
		Korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}

	public double getAvg() {
		double sum = Korean+english+math+science;
		double avg = sum / 4;
		return avg;
	}
	
	public String getGrade() {
		String result = "F 학점";
		int avg = (int)getAvg();
		
		if(avg>=90 && avg<=100) {
			result = "A 학점";
//		System.out.println("A학점");
			
		}else if(avg>=70 && avg<90) {
			result = "B학점";
		
		}else if(avg>=50 && avg<70) {
			result = "C학점";
		}else if(avg>=30 && avg<50) {
			result = "D학점";
//		}else {
//			result = "F학점";
		}
		return result;
	}
}
