import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileW {

	public static void main(String[] args) {
		//writhe는 없으면 자동생성된다.
				File f = new File("c:\\Test\\xyz.java");
				//데이터 쓰기: FileWriter, FileOutputStream.
				PrintWriter out = null;
				try {
					FileWriter writher = new FileWriter(f,true); //append
					//필터
					out = new PrintWriter(writher);
					out.print("happy");					
				} catch(IOException e) {
					e.printStackTrace();
				}finally {
						out.close();
					
				}

	}

}
