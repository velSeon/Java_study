import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}//end Person
class PersonComp implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int result = 1;
		if(o1.age>=o2.age) result = -1;
		return result;		
	}	
}
public class Ex10_9 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동",20));
		list.add(new Person("이순신",44));
		list.add(new Person("유관순",18));
		list.add(new Person("강감찬",66));
		
		Collections.sort(list,new PersonComp());
		for(Person person : list) {
			System.out.println(person);
		}	
	}
}
