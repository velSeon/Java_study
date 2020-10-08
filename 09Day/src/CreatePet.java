public class CreatePet {
	
	
public Pet CreatePet(int num) {
	Pet p = null;

	if(num==1) {
	  p = new Cat("야옹이", 3, "암놈");
	}else if (num==2) {
		p = new Dog("강아지", 10, "암놈","검정");
	}else if( num==3) {
		p = new Fish("븡어", 10, "암놈",2.5);
	}
	return p;
}
}
