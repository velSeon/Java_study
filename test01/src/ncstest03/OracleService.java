package ncstest03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleService {

	OracelDAO dao;
	public OracleService() {
		dao = new OracelDAO();
	}

	public void insert(Dept dept) {
	 dao.insertDept(dept);

		
	}
	

}
