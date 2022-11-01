package mypackage;

import java.util.HashMap;
import java.util.*;
public class MapSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("monitor", 5000);
		hm.put("keyboard", 500);
		hm.put("mouse", 1500);
		hm.put("ups", 300);
		hm.put("speakers", 1000);
		System.out.println("HashMap:");
		System.out.println(hm);
		
		Set<String> keys=hm.keySet();
		System.out.println("Keys:");
		System.out.println(keys);
		//using foreach getting key-value pairs
		//hm.get(key)=>returns the value of the given key
		for(String k:keys) {
			System.out.println(k+"--->"+hm.get(k));
		}
		
		System.out.println(hm.get("ups"));
	}

}
