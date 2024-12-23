package file;
import java.io.*;
public class WriteFile {
	public static void main(String[] args) {
		String textString="This is an example of how to write to a file in java.";
		try {
			File file=new File("text.txt");
			
			if (file.exists() || file.isFile()) {
				System.out.println("File is already exist!");
			}else {
				FileWriter text = new FileWriter("text.txt");
				
				text.write(textString);
				System.out.println("Text is written to the file!!!");
				
				text.close();
			}			
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
