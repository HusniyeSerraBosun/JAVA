package file;
import java.io.*;
public class ReadFile {
	public static void main(String[] args) {
		char[]reading=new char[100];
		try {
			
			FileReader inputFile= new FileReader("FileInstance.txt");
			inputFile.read(reading);
			System.out.println("Content of file is: ");
			System.out.println(reading);
			
			inputFile.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
