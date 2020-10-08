
public class ConcreteClass extends AbstractClass {
	public ConcreteClass() {
		super();
	}
	@Override
	public void a() {
		System.out.println("ConcreteClass   ===a()");
		
	}
	@Override
	public int b() {
		System.out.println("ConcreteClass  ===b()");
		return 0;
	}
	@Override
	public void c(int x) {
		System.out.println("ConcreteClass   ====c()");
		
	}
	public ConcreteClass(int num) {
		super(num);
	}
	

}
