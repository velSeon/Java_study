import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain2 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		int deptno = 10;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("deptno",null);
//		map.put("deptno", deptno);
		List<Dept>list = service.selectDynamicDeptno(map);
		for(Dept dept : list) {
			System.out.println(dept);
		}
	
		
	}

}
