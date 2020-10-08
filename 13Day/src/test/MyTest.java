package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class MyTest {

	public static void main(String[] args) {
//		Set<Person> set = new HashSet<Person>(); //비어 있는 set생성
//		Person kkk = new Person("유관순",17,"서울");
//		set.add(new Person("홍길동",20,"서울"));
//		set.add(new Person("이순신",44,"전라"));
//		set.add(new Person("이순신",44,"전라"));
//		set.add(kkk);		
		//8~14라인까지 SetService class의 getPersonSet()호출로 리턴받아서 사용
		SetService test = new SetService();		
		Set<Person> set = test.getPersonSet();
		System.out.println("=====");
		test.printPerson(set);
		System.out.println("=====");
		test.addPersonSet(new Person("김길동",21,"서울"));
		test.printPerson(set);
		
		
//		for(Person x : set) {
//			System.out.println(x.getName());	
//		}
//18~20라인 SetService class의 printPerson()함수에 set을 넘겨서 출력
//		Iterator<Person> iterator = set.iterator()	;
//		while(iterator.hasNext()) {
//			Person p = iterator.next();
//			System.out.println(p.getName());}
		}
	}

