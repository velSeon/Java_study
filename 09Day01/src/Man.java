
public class Man extends Emp {

	String depart; //관리부서

	
	@Override
	public String toString() {
		return "Man [depart=" + depart + "\t"+name+ "]";
	}
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Man(String name,String depart) {
		super(name);
		this.depart = depart;
	}
	@Override
	public String printInfo() {
		
		return super.printInfo()+"\t"+depart;
		//return ssn+"\t"+name+"\t"+salary+"\t"+depart;
	}
	
}
