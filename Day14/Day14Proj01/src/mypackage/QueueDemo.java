package mypackage;

import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> locationsQueue=new LinkedList<>();
		locationsQueue.add("Kolkata");
		locationsQueue.add("Pune");
		locationsQueue.add("Hyderabad");
		locationsQueue.add("Delhi");
		locationsQueue.add("Chennai");
		System.out.println("Queue is:"+locationsQueue);
		System.out.println("Head of the Queue:"+locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After Removing Head of Queue:"+locationsQueue);
		System.out.println("Size if Queue:"+locationsQueue.size());
	}

}
