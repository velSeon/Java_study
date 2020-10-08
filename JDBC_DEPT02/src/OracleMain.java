import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) throws RecordNotFoundException {

		OracleService service = new OracleService();

//		try {
//			ArrayList<Dept> list=service.select();
//			for (Dept dept : list) {
//				System.out.println(dept);
//			}
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  //전체데이터 출력
	
		service.insert(new Dept(61,"제조","경기"));
// 		service.update(new Dept(61,"개발","경기"));
//		service.delete(99);
//		service.selectbydeptno(51);
//		HashMap<String,String>map = new HashMap<String,String>();
//		map.put("dname", "영업");
//		map.put("loc", "제주");
//		try {
//			ArrayList<Dept>list = service.selectByNameLoc(map);
//			for( Dept dept : list) {
//				System.out.println(dept);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
	}

}
