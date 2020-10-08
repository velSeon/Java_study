import java.io.IOException;
import java.io.InputStream;

public class Ex11_1 {
	public static void main(String[] args) {
		InputStream is = null;		
		System.out.println("데이터를 입력하시오");
		is = System.in;
		try {
			byte [] b = new byte[5];			
			int n = is.read(b);
			for(byte c : b) {
			System.out.println((char)c);
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(is!=null) is.close();
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	}
}

