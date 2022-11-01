package mypackage;
import java.util.*;
public class LinkedListDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList li=new LinkedList();
        li.add(10);
        li.add(20);
        li.add("stina");
        li.add("varghese");
        System.out.println(li);
        
        li.addFirst("s");
        System.out.println(li);
    
        li.removeFirst();
        System.out.println(li);
        
        li.add(2,"developer");
        System.out.println(li);

        li.remove((Object)10);
        //li.remove(10);
        System.out.println(li);
	}

}
