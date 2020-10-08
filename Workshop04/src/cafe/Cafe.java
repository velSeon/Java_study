package cafe;

public class Cafe {

Coffee[] coffeeList = new Coffee[10];
int index =0;

public Cafe(){
	super();
	
	
}
public Coffee[] getCofeeList() {
	return coffeeList;
}
public void setCofeeList(Coffee coffee) {
	if(index<10) {
		coffeeList[index]=coffee;
		index = index+1;
	
	}else {
		System.out.println("정보 추가가 될 수 없습니다.");
	}
	
	
}
public int totalPrice() {
	int total =0;
	for(int i =0;i<index;i++) {
		total+=coffeeList[i].getPrice();
		
	}return total;
}





}
