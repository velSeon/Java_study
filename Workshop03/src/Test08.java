
public class Test08 {

	public static void main(String[] args) {
int [] score = {99,34,67,22,11,9};
int max = score[0];
int min = score[0];
int i=0;
for( i = 0; i<score.length;i++) {
	//System.out.println(score[i]);
	if(max<score[i]) {
		max=score[i];
	System.out.println(max);	
	
	}
		else if(min > score[i]){
		min = score[i];
		}
	
	
}
System.out.println("최대값 :"+ max);
System.out.println("최소값 :"+ min);
	}

}
