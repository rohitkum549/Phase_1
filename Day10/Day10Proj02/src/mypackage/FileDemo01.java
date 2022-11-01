package mypackage;

import java.io.*;
public class FileDemo01 {

	public static void createFileUsingFileClass() throws IOException
	{
		File file=new File("D:/Java/Sept2/TestFile.txt");
		
		//create the file
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File already exists");
		}
		
		//write content
		FileWriter writer=new FileWriter(file);
		writer.write("Hey Folks, This is our first file created using IO");
		writer.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createFileUsingFileClass();
	}

}
