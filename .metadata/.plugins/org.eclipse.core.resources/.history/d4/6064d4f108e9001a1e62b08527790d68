package workshop08.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ArrayList;

public class FactoryDAO {
	
	public ArrayList<FactoryDTO> getFactoryAll(Connection con){
		
		ArrayList<FactoryDTO> list = new ArrayList<>();
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM factory";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
			 String factNo = rs.getString("factNo");
			 String facName = rs.getString("facName");
			 String facLoc = rs.getString("facLoc");
			 FactoryDTO dto = new FactoryDTO(factNo, facName, facLoc);
			 list.add(dto);
			}
		}catch(SQLException e) {
			try {
			  if(rs!=null)rs.close();
			  if(pstmt!=null)pstmt.close();
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}//end getFactoryAll
}//end class
