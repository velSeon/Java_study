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
//		Dept dept= service.selectByDeptno(12);
//		System.out.println(dept
//				);
		//service.deptRecordCount();

		
//		Dept dept = new Dept();
//		dept.setDname("영업");
//		dept.setLoc("제주");	
//		
//		List<Dept> list= service.selsectByDeptNameAndLoc(dept);
//		for(Dept dept2 : list) {			
//			System.out.println(dept2);
//		}
		
		
				
//		List<Dept> list= service.selectAll();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
		
		HashMap map = service.selsectByDeptnoHashMap(10);
		Set<String>keys = map.keySet();
		System.out.println(map);
		System.out.println(keys);		
		System.out.println(map.get("DNAME"));
		
		
		
	

		
		
	}

}
