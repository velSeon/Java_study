package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetTest {
public Set<Person> getPersonSet(Set<Person> set){//main의 Set 받아오기
	//Set<Person> set = new HashSet<Person>();
	Person kkk = new Person("유관순",17,"서울");
	set.add(new Person("홍길동",20,"서울"));
	set.add(new Person("이순신",44,"전라"));
	set.add(new Person("이순신",44,"전라"));
	set.add(kkk);
	return set ;
}
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>(); //비어 있는 set생성
//		Person kkk = new Person("유관순",17,"서울");
//		set.add(new Person("홍길동",20,"서울"));
//		set.add(new Person("이순신",44,"전라"));
//		set.add(new Person("이순신",44,"전라"));
//		set.add(kkk);		
		SetTest test = new SetTest();//기본 생성자 호출
		Set<Person> set2 = test.getPersonSet(set);//빈 Set을 함수에 넘김, 함수에서 객체를 담아서 리턴
		
		System.out.println(set2);
		for(Person x : set2) {
			System.out.println(x.getName());	
		}
		Iterator<Person> iterator = set2.iterator()	;
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.getName());
		}
	}

}
