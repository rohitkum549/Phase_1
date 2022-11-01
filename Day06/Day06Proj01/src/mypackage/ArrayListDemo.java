package mypackage;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(20);//Autoboxing-added in Java Version 5
		al.add(10);
		al.add("Jay");
		al.add("Monday");
		System.out.println(al);
		al.add(2,"Hi");
		System.out.println(al);
		al.set(2, "Hello");
		System.out.println(al);
		al.remove("Hello");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		String s=(String)al.get(2);
		System.out.println(s);
		System.out.println("Size:"+al.size());
		al.remove(1);
		System.out.println(al);
	}

}
