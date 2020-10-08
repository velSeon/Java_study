import java.util.List;

import com.emp.Emp;
import com.service.OracleMyBatisService_emp;

public class Main {

	public static void main(String[] args) {
		OracleMyBatisService_emp service = new OracleMyBatisService_emp();
		
//		List<Emp> list = service.select();
//		for(Emp emp : list) {
//			System.out.println(emp);
//		}
		
//		System.out.println(service.selectNo(9002));
		
//	service.update(new Emp(9000,"김동길","개발",105,"20/08/20",1300,0,30));
//	service.update(new Emp(9000,"김동길","사장"));
		
	service.delete(105);
		
	}

}
