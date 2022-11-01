package mypackage;
import java.util.*;
public class LinkedListDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add("Mendu");
		ll.add("Simplilearn");
		System.out.println(ll);
		System.out.println("Printing using foreach:");
		for(Object obj:ll) {
			System.out.println(obj);
		}
		System.out.println("Printing using iterator");
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
