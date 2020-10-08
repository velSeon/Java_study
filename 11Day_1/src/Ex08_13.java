

public class Ex08_13 {
	public enum Colors{ BLACK,YELLOW,BLUE, RED};
	
	public static void main(String[] args) {
		Colors color = Colors.BLACK;
		//colors = Colors.whilte;
		System.out.println(color);
		Colors [] c = Colors.values();
		for(Colors x :c) {
			System.out.println(x.name()+"\t"+x.ordinal());
			
		}
		switch (color){
			case RED:
				System.out.println("RED");
				break;
			case BLACK:
				System.out.println("BLACK");
				break;
			case YELLOW:
				System.out.println("YELLOW");
				break;
			case BLUE:
				System.out.println("BLUE");
				break;
				default:
					break;
	

	}

}}
