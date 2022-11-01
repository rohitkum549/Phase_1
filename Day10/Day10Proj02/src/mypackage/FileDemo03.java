package mypackage;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.io.*;
import java.util.*;

public class FileDemo03 {

	public static void createFileIn_NIO() throws IOException
	{
	String data="This file is created using NIO package";
	//write method takes file name along with the path and also the data in bytes
	//and writes the data onto the file
	Files.write(Paths.get("D:/Java/Sept2/TestFile3.txt"), data.getBytes());
	System.out.println("Data written to file..!!!");
	}
	public static void createFileNIO() throws IOException{
		List<String> lines=Arrays.asList
	("Today is friday","Next session is on monday","Target will be set end of session");
		Files.write(Paths.get("D:/Java/Sept2/newFile.txt"), lines, 
				StandardCharsets.UTF_8,
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		createFileIn_NIO();
		createFileNIO();
	}

}
