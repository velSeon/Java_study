import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileDel {

	public static void main(String[] args) {
	
		Path newFile= Paths.get("c:\\Test\\xxx.txt");
		Path xx2= Paths.get("c:\\Test\\xxx.txt");;
//		try {//파일생성
//			xx2= Files.createFile(newFile);			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
//		try {//파일 삭제
//			Files.deleteIfExists(xx2);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Path original = Paths.get("c:\\Test\\IOTest5.java");
		Path copy= Paths.get("c:\\Test\\IOTest5Copy.java");
		
		try {
			Path yyy= Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(yyy);
		} catch (IOException e) {
			// TODO Auto-generated catch
			
			e.printStackTrace();
		}
	}

}
