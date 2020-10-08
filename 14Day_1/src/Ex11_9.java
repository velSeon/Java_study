import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ex11_9 {

	public static void main(String[] args) {
	System.out.println("데이터를 입력하시오");
	BufferedReader buffer = null;
	PrintWriter out = null;
	try {
		File f = new File("c:\\Test","output.txt");
		buffer = new BufferedReader(new InputStreamReader(System.in));
		FileWriter writer = new FileWriter(f,true);
		out = new PrintWriter(writer);
		out.println(buffer.readLine());
		
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			buffer.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

}
