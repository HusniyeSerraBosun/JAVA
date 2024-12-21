package file;

import java.io.*;
public class CreateFile {
	public static void main(String[] args) {
		
		File file=new File("FileInstance.txt");
		
		try {
			boolean value=file.createNewFile();
			if (value) {
				System.out.println("The new file created successfully.");
			}else {
				System.out.println("The file already exists.");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
