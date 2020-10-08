import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ex11_3 {
	public static void main(String[] args) {
		// 한글입력 가능하도록
		//표준 입력 =>키보드로 입력 한글입력가능 (byte->char로 변환) InputStreamReader사용
		//read() 함수 사용	
		System.out.println("데이터를 입력하시오");
		InputStream is  = System.in; //표준입력 노드 계열-파일,콘솔 등에 붙어서 직접입출력 바이트로 한글자 밖에 못가져옴.
		InputStreamReader reader = null;
		BufferedReader buffer = null;
		try {
			//필터 사용 1: byte -> char로 변경-직접in.out 안되지만 데이터변형,라인별읽기/쓰기 가능		
			reader = new InputStreamReader(is);
			//필터 사용 2: 한줄(line)읽기
			buffer = new BufferedReader(reader);
			String mesg = buffer.readLine();
			System.out.println(mesg);//표준출력
			PrintStream xxx = System.out;
			xxx.println("asdfs");
									
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				buffer.close();
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	}}

