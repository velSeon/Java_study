import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// 날짜 데이터
		// 1. java.util.Date
//		 Date d = new  Date();
//		 System.out.println("d="+d);
//		 System.out.println("d.toString()=="+ d.toString());
//		 @SuppressWarnings("deprecation")
//		Date d2 = new  Date(2019,06,18);
//		 System.out.println("d2="+d2);
		 //년도만? ==> 구할수 없다. deprecated 됨.

		// 2. java.util.Calendar
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println("년도:" + c.get(Calendar.YEAR));// Calendar.year 해서 get해서 사용
		int month = c.get(Calendar.MONTH)+1;
		System.out.println("월 :" + month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 :" + day);
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute= c.get(Calendar.MINUTE);
		int seconds= c.get(Calendar.SECOND);
		System.out.println(hour+"\t"+minute+"\t"+seconds);
		
		//명시적으로 새로운 날짜설정
		//c.set(2019,10,18);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		//Calendar ==> Date 
		Date xxxx =c.getTime();
		System.out.println(xxxx);
		
		long yyyy = c.getTimeInMillis();
		System.out.println(yyyy);
		
		long yyyy2= System.currentTimeMillis();
		System.out.println(yyyy2);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2014,11,24);
		Date now = cal2.getTime();
		System.out.println(now);
		
	}//end main
}//end class
