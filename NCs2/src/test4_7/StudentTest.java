package test4_7;

public class StudentTest {

	public static void main(String[] args) {
		Student stuArr [] = new Student [3];
		stuArr[0] = new Student ("홍길동",15,170,80);
		stuArr[0] = new Student ("한사람",13,180,70);
		stuArr[0] = new Student ("임걱정",16,175,65);
		
		double totalAge=0;
		double totalHeight=0;
		double totalWeight=0;
		
		int maxAge=0;
		int maxheight=0;
		int minAge=0;
		int minheight=0;
		System.out.println("이름  나이  신장  몸무게")
		;
	
		for(int i = 0; i<stuArr.length;i++) {
			System.out.println(stuArr[i].studentInfo());
			totalAge += stuArr[i].getAge();
			totalHeight += stuArr[i].getHeight();
					totalWeight += stuArr[i].getWeight();
					
					if(stuArr[maxAge].getAge()<stuArr[i].getAge()) {
						maxAge=i;
					}if(stuArr[minAge].getAge()>stuArr[i].getAge()) {
						minAge=i;
					}if(stuArr[maxheight].getAge()<stuArr[i].getAge()) {
						maxheight=i;
					}if(stuArr[minheight].getAge()>stuArr[i].getAge()) {
						minheight=i;
					}
		}
		
 System.out.println();
 System.out.println("나이평균" +(totalAge/stuArr.length) );
 System.out.println("신장평균"+(totalHeight/stuArr.length) );
 System.out.println("몸무게평균"+(totalWeight/stuArr.length) );
 System.out.println(stuArr[maxAge].getName());
 System.out.println(stuArr[minAge].getName());
 System.out.println(stuArr[maxheight].getName());
 System.out.println(stuArr[minheight].getName());
 
}
}
