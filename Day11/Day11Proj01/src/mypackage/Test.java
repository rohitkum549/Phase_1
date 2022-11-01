package mypackage;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.io.IOException;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Files.delete(Paths.get("D:\\JAVA\\oct2\\TestFile11.txt"));
			
			System.out.println("Deletion Successful!");
		}
		catch(NoSuchFileException e) {
			System.out.println("No Such file/directory exists");
		}
		catch(DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty");
		}
		catch(IOException e) {
			System.out.println("Invalid Permissions");
		}
		
	}

}
