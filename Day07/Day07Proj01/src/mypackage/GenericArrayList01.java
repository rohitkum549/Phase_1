package mypackage;
import java.util.*;
public class GenericArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		//al.add(10);//error
		al.add("JAVA");
		al.add("Python");
		al.add("Angular");
		System.out.println(al);
		for(String s:al) {
			System.out.println(s);
		}
	}

}
