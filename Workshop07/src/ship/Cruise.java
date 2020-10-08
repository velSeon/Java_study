package ship;

public class Cruise extends Ship{
	Cruise(){}
	
	
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void sail(int dist) {
		setFuelTank(getFuelTank() - (dist*13));
		
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel*8));
		
	}


	

	
}
