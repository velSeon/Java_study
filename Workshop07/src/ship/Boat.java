package ship;

public class Boat extends Ship{
	Boat(){}
	
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		
	}

	@Override
	public void sail(int dist) {
		setFuelTank(getFuelTank() - (dist*10));
		
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel*10));
		
	}
	
	

}
