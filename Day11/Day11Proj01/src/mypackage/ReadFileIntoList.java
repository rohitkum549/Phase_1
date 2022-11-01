package mypackage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class ReadFileIntoList {

	public static List<String> readFileInList(String fileName){
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lines;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=readFileInList("D:\\java\\sept2\\newfile.txt");
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
