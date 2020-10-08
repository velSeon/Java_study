import com.dao.OracleDAO;
import com.service.DBservice;

public class DBMain {

	public static void main(String[] args) {
		DBservice service = new DBservice();
		service.setDAO(new OracleDAO());
		//mysql접속을 위해 객체 생성 후 service에 넘김.
	}
}
