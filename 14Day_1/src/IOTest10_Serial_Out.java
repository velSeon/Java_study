import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOTest10_Serial_Out {

	public static void main(String[] args) {
		//생성된 객체의 멤버 변수 값 저장 단 class는 반드시
		//implements 
		ObjectOutputStream oos = null;
		try {
			Person p = new Person("홍길동",20);
			File f = new File("C:\\Test","serial.dat");
			FileOutputStream fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		try {
			oos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}

	}

}
