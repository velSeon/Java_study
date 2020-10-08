package test4_1;

public class Student {
private String name;
private int korean;
private int english;
private int math;
private int science;

public Student() {}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getKorean() {
	return korean;
}

public void setKorean(int korean) {
	this.korean = korean;
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

public Student(String name, int korean, int english, int math, int science) {
	super();
	this.name = name;
	this.korean = korean;
	this.english = english;
	this.math = math;
	this.science = science;
}
double avg;
public double getAvg() {
	avg = (double)(korean+english+math+science)/4;
	return avg;
	
}
public String getGrade() {
	String a;
	if(avg>=90) {
		a="A 학점";
	}else if(avg>=70){
		a="B 학점";
	}else if(avg>=50){
		a="C 학점";
	}else if(avg>=300){
		a="D 학점";
	}else
	{a="F 학점";
}return a;
}
}
