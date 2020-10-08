import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service= new OracleMyBatisService();
		//service.insert(new Dept(99, "개발","강남"));
//		service.update(new Dept(99,"영업", "서울"));
//		Dept dept= service.selectByDeptno(99);
		
		
		Dept dept = service.selectByname("홍길동");
		System.out.println(dept);
		
//		service.update(new Dept(90,"개발","서울"));
		

		//System.out.println(dept);
//		List<Dept> list= service.selectAll();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
		
	
		
//		HashMap<String,Integer> map = new HashMap<String,Integer>();
//		map.put("deptno", 10);
//		map.put("deptno1", 50);	
//	
//			List<Dept> list = service.selectByHashMap(map);			
//			for(Dept dept : list) {
//				System.out.println(dept);
//			}
		
//			HashMap<String,Integer> map = new HashMap<String,Integer>();
//			map.put("deptno", 10);
//			map.put("deptno1", 50);	
//			map.put("deptno2", 15);	
//			
//			List<Dept> list = service.selectBydeptNoIn(map);
//			for(Dept dept : list) {
//				System.out.println(dept);
//			}
		
		
		
		
	}

}
