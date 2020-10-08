import com.dao.MYSQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;
public class MainTest {
	public static void main(String[] args) {
		//DBService service = new DBService();
		DBService service = DBService.getService();
		DBService service2 = DBService.getService();
		DBService service3 = DBService.getService();
		System.out.println(service);
		System.out.println(service2);
		System.out.println(service3);
		service.setDAO(new OracleDAO());
		service.insert(new OracleDAO());
		service.setDAO(new MYSQLDAO());
		service.insert(new OracleDAO());
		service.insert(new MYSQLDAO());
		
		
		
		

	}

}
