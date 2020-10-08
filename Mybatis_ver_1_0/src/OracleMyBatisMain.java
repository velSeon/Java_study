import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();		
//		List<Dept>	list = service.select();
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
		
		List<Map<String,Object>> list1 = service.selectAllhash();
		System.out.println(list1.size());
		for(Map<String,Object> m : list1) {
			String no = (BigDecimal)m.get("DEPTNO")+"";
			int intno = ((BigDecimal)m.get("DEPTNO")).intValue();
			String dname = (String)m.get("DNAME");
			String loc = (String)m.get("LOC");
			System.out.println(no +"\t"+dname+"\t"+loc);
		}
		
		
	}

}
