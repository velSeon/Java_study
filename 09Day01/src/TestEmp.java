import java.util.Date;

public class TestEmp {

	public Emp[] createEmpArr() {
		Emp man = new Man("홍길동","영업부");
		Emp man2 = new Man("이완용","영업부");
		Emp en1 = new Eng("이순신","제조업");
		Emp en2 = new Eng("강감찬","연구업");
		Emp[] emp = new Emp[4];	
		emp[0]= man;
		emp[1]= en1;
		emp[2]= en2;
		emp[3]=man2;
		return emp;
	}
	
	
	/*public void printEmp(Emp e) {//1번
		System.out.println(e.printInfo());		
	}*/
	public void printEmpArr(Emp [] arr) {		
	for(Emp emp : arr) {
		System.out.println(emp.printInfo());
	}
		}
public void printChildDate(Emp[]arr) {
	for( Emp e : arr) {
		if(e instanceof Man) {
			Man m = (Man) e;
			System.out.println(m.getDepart());
		}if(e instanceof Eng) {
			Eng en = (Eng) e;
			System.out.println(en.getSkill());
		}
	}
}
public Emp SearchChildData(Emp[] arr, String name) {
	Emp data = null;
	for(Emp e : arr) {
		if(name.equals(e.getName())) {
			data=e;
			
		}
	}return data;
}


public String SearchData(String name,Emp[] arr) {
	String data = "";
	String token = "/";
	for(Emp e : arr) {
		if(e instanceof Man) {
			Man m = (Man)e;
			if(name.equals(m.getDepart()))
				data = data + m.getName()+token;
		}else if ( e instanceof Eng) {
			Eng en = (Eng)e;
			if(name.equals(en.getSkill()))
				data= data+en.getName()+token;			
		}
	}  return "검색결과:" + data;
}

	public static void main(String[] args) {
		Emp e = new Emp("홍길동");
		System.out.println(e); //==System.out.println(e.toString());
		Emp m = new Man("이순신","영업부");
		System.out.println(m);
//		Date d = new Date();
//		System.out.println(d);//참조변수만 넣을 시 jdk가 자동으로 d.tostring()으로 변환
//		System.out.println(d.toString());
//		
//		
//		
//		
//		
//		TestEmp test = new TestEmp();
//		Emp [] arr = test.createEmpArr();
//		test.printEmpArr(arr);
////		test.printEmpArr(emp);
////		test.printEmp(man);
////		test.printEmp(en1);
////		test.printEmp(en2);
//		
//		Emp data = test.SearchChildData(arr, "홍길동");
//		test.printChildDate(arr);
	
		
	}

}
