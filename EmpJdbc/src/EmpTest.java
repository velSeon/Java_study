


import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;


public class EmpTest {

	
	public static void main(String[] args){
		
		EmpBiz empBiz = new EmpBiz();
//		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
	
//		try {
//			EmpDTO list = empBiz.selectDetailEmp("107");
//			System.out.println(list);
//		} catch (DataNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			empBiz.empDelete("103");
		} catch (Exception e) {			
			e.printStackTrace();
		}
	
//		System.out.println(list);
//		empBiz.selectDetailEmp("107");
//		empBiz.empDelete("107");
		
//		empBiz.empUpdate(new EmpDTO(105, "josh","owner",7000, null, 1000, 500, 30));
		
				//for each
		
	}//end main
}//end class
