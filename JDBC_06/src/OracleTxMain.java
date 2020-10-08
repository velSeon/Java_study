import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxMain {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
OracleTxService service = new OracleTxService();
ArrayList<Dept> list= service.select();
//System.out.println(list);

//
//service.insert(new Dept(91,"제조","경기"));
//service.update(new Dept(50,"제조","강원"));
//service.delete(90);
service.insertDelete(new Dept(89,"제조","경기"), 88);

	}
}
