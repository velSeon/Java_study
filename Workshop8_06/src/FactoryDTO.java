
public class FactoryDTO {
	private String facNo;
	private String facName;
	private String facLoc;
	public FactoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FactoryDTO(String facNo, String facName, String facLoc) {
		super();
		this.facNo = facNo;
		this.facName = facName;
		this.facLoc = facLoc;
	}
	public String getFacNo() {
		return facNo;
	}
	public void setFacNo(String facNo) {
		this.facNo = facNo;
	}
	public String getFacName() {
		return facName;
	}
	public void setFacName(String facName) {
		this.facName = facName;
	}
	public String getFacLoc() {
		return facLoc;
	}
	public void setFacLoc(String facLoc) {
		this.facLoc = facLoc;
	}
	
	
	
}
