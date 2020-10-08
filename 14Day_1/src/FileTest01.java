import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest01 {

	public static void main(String[] args) {
		//writhe는 없으면 자동생성된ㄷ
		File f = new File("c:\\Test\\xyz.java");
		//데이터 쓰기: FileWriter, FileOutputStream.
		BufferedReader buffer =  null;
		try {
			FileReader reader = new FileReader(f);
			buffer = new BufferedReader(reader);
			String data = buffer.readLine();	
			while(data != null) {
				System.out.println(data);
				data = buffer.readLine();	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				buffer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
