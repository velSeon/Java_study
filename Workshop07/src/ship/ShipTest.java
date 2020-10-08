package ship;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		ArrayList<Ship> list = new ArrayList<Ship>();
		
		Boat boat = new Boat("Boat01",500);
		Cruise cruise = new Cruise("Cruise01",500);
		
		list.add(boat);
		list.add(cruise);
		System.out.println("두 선박의 이름과 현재 연료량 출력(for문이용)");
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("두 선박의 이름과 현재 연료량 출력");
		System.out.println(boat);
		System.out.println(cruise);
		System.out.println("변화 후 두 선박의 이름과 현재 연료량 출력");
		boat.sail(10);
		cruise.sail(10);
		System.out.println(boat);
		System.out.println(cruise);
		for(int i =0; i<list.size();i++) {
			Ship ship = list.get(i);
			System.out.println(ship.getShipName()+ "\t"+ship.getFuelTank());
		}
		System.out.println("=====for");
		//for문 이용 두 선박을 검사하여 boat면, reful(20),curse면 reful(30)설정
//		for(int x=0;x<=20;x++) {
//			boat.refuel(x);			
//		}System.out.println(boat);
//		for(int x=0;x<=30;x++) {
//			cruise.refuel(x);			
//		}System.out.println(cruise);
		
		for(int i =0; i<list.size();i++) {
			if(list.get(i)==list.get(0)){
				list.get(i).refuel(20);
				
			}else {
				list.get(i).refuel(30);
			}
		}
		for(int i =0; i<list.size();i++) {
			Ship ship = list.get(i);
			if(ship instanceof Boat){
				ship.refuel(20);
				
			}else {
				ship.refuel(30);
			}
		}
		
		System.out.println(boat);
		System.out.println(cruise);
		
		
	}

}
