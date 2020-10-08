package test;

import java.util.HashSet;
import java.util.Set;

public class SetService {
	Set<Person> set = new HashSet<Person>();
	public Set<Person> getSet() {
		return set;
	}
	public void addPersonSet(Person p) {
		//인자로 person을 받아와서 set에 add를 해주는 함수
		set.add(p);	
	}
public Set<Person> getPersonSet() {
	//Set<Person> set = new HashSet<Person>(); //비어 있는 set생성	
	Person kkk = new Person("유관순",17,"서울");
	set.add(new Person("홍길동",20,"서울"));
	set.add(new Person("이순신",44,"전라"));
	set.add(new Person("이순신",44,"전라"));
	set.add(kkk);	
	return set;
}
public void printPerson(Set<Person>set) {
for(Person person : set) {
	System.out.println(person);
}
}

}
