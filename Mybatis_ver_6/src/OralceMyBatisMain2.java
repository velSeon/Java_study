import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.dto.Emp;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;
import com.service.OracleMyBatisService_emp;

public class OralceMyBatisMain2 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		OracleMyBatisService_emp service_emp = new OracleMyBatisService_emp();
//		int deptno = 50;
//		HashMap<String,Integer> map = new HashMap<String,Integer>();
//		map.put("deptno",null);
//		map.put("deptno", deptno);
//		List<Dept>list = service.selectDynamicDeptno2(map);
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
//		
//		Dept dept = new Dept();
//		dept.setDeptno(50);
//		List<Dept> list = service.selectDynamicDeptno2(dept);
//		for(Dept dept1 : list) {
//			System.out.println(dept1);
//		}
//	
//		HashMap<String,Integer> map = new HashMap<String,Integer>();
//		map.put("deptno",null);
		
		
//		HashMap<String,String> map = new HashMap<String,String>();
//		map.put("dname","영업");
//		map.put("loc","제주");
//		
//		List<Dept>list = service.selectDynamicChoose(map);
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
		
		List<Emp> list = service_emp.select();
		for(Emp emp : list) {
			System.out.println(emp);
		}
		
		
		
	}

}
