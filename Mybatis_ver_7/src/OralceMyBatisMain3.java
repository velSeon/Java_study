import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain3 {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service= new OracleMyBatisService();
////3.muti delete
//		List<Dept> depts=Arrays.asList(new Dept(12,"",""), new Dept(13,"",""));
//		service.multidelete2(depts);
//		List<Dept> list = service.selectAll();
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
//		
//		Dept dept = new Dept(14,"","");
//		Dept dept2 = new Dept(15,"","");
//		Dept dept3 = new Dept(16,"","");
//		dept.setLoc("서울");
//		dept2.setLoc("NY");
//		
//		List<Dept> depts = Arrays.asList(dept ,dept2);
//		
//		Dept dept = new Dept(51,"영업","군산");
//		Dept dept1 = new Dept(52,"개발","판교");
//		Dept dept2 = new Dept(53,"사무","서울");
//		
//		List<Dept>depts = Arrays.asList(dept, dept1,dept2);
//		
//		service.multinsert(depts);
		
		//5.Top-N 분석 ==> 페이징처리
		
		List<Dept> deptList3 = service.selectTopN(0,3);
		for(Dept dept : deptList3) {
			System.out.println(">>>>"+dept);
		}
		
		
	}

}
