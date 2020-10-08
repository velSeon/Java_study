import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class main {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();	
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("pdname", "TV");
		map.put("pdname2", "CELLPHONE");
		
		List<Dept> list = service.select(map);
		System.out.println("제품명   제품원가   제품가격");
		for(Dept dept : list) {
			System.out.println(dept);
		}
		
		
		

	}

}
