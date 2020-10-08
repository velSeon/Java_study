package workshop08.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class FactoryBiz {

	private String driver;
	private String url;
	private String user;
	private String pass;
	
	
	public FactoryBiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FactoryBiz(String driver, String url, String user, String pass) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
		
	}

	public ArrayList<FactoryDTO> getFactoryAll(){
		
        
           Connection con = null;
           ArrayList<FactoryDTO> list = null;
        	try {
				Class.forName(driver);
				con = DriverManager.getConnection(url,user,pass);
				
				FactoryDAO dao = new FactoryDAO();
				list = dao.getFactoryAll(con);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					  if(con!=null)con.close();
					}catch(SQLException e2) {
						e2.printStackTrace();
					}
			}
             
  
        	return list;
        	
        
	}//end getFactoryAll
}
