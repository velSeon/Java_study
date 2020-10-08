import java.util.Arrays;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain2 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
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
		
		//2.Multiupdate
//		List<Integer> deptnoes = Arrays.asList(12,15,19);
//		List<Dept> list = service.multiSelect(deptnoes);
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
		
		
//		List<Integer> deptnoes2 = Arrays.asList(12,15,19);
//		service.multiupdate(deptnoes2);
		
		List<String> loc = Arrays.asList("경기","성남");
		service.multidelete(loc);
		
		
		
		
		
	}

}
