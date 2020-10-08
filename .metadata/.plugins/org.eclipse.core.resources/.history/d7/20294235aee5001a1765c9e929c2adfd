import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class main {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();		
		List<Dept> list = service.select();
		System.out.println("제품명   제품원가   제품가격");
		for(Dept dept : list) {
			System.out.println(dept);
		}
		
		
		

	}

}
