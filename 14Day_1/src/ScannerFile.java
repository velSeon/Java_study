import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) {
	File f = new File("c:\\test","xyz.java");
	Scanner scan = null;
	try {
		scan = new Scanner(f);
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}finally {
		if(scan !=null)scan.close();
	}

	}

}
