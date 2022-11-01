package mypackage;

import java.io.*;

public class FileDemo02 {

	public static void createFileUsingFileOutputStreamClass() throws IOException
	{
		String data="Hi, This is friday night";
		FileOutputStream out=new FileOutputStream("D:/Java/Sept2/TestFile2.txt");
		out.write(data.getBytes());
		out.close();
		System.out.println("Date written successfully!");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createFileUsingFileOutputStreamClass();
	}

}
