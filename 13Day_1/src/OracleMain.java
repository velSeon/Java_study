import java.util.HashSet;

import com.dao.Person;

public class OracleMain {

	public static void main(String[] args) {
		
		OracleService service = new OracleService();
		HashSet<Person> xxx = service.select();
		for(Person s : xxx) {
			System.out.println(s);
		}

	}

}
