package rs_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Amit");
		hm.put(1, "Suman");
		hm.put(4, "Shreya");
		hm.put(6, "Virat");
		hm.put(8, "Shubh");
		System.out.println(hm);	//{0=Amit, 1=Suman, 4=Shreya, 6=Virat, 8=Shubh}
		
		//get the value
		System.out.println(hm.get(8));	//Shubh
		
		//remove the value
		System.out.println(hm.remove(4));
		System.out.println(hm); 	//{0=Amit, 1=Suman, 6=Virat, 8=Shubh}
		
		//Convert hashtable to set
		//Iterate through it and print the key and values
		
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		System.out.println(entrySet); 	//[0=Amit, 1=Suman, 6=Virat, 8=Shubh]
		
		Iterator iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry mp = (Map.Entry)iterator.next();
			System.out.println("Key is :"+mp.getKey()+" & value is :"+mp.getValue());
		}
		/*
		    Key is :0 & value is :Amit
			Key is :1 & value is :Suman
			Key is :6 & value is :Virat
			Key is :8 & value is :Shubh
		 */

	}

}
