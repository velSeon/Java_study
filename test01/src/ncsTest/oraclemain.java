package ncsTest;

import java.sql.SQLException;

import ncstest03.Dept;
import ncstest03.OracleService;

public class oraclemain {

	public static void main(String[] args) throws Exception {

		OracleService service = new OracleService();
		
		service.insert(new Dept(96,"영업부","경기도"));
			


	}

}
