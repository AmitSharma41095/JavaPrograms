package rs_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Amit");
		hs.add("Sumit");
		hs.add("Karan");
		hs.add("Amit");
		System.out.println(hs.size());	//3
		System.out.println(hs); 	//[Karan, Amit, Sumit] - unordered
		System.out.println(hs.isEmpty());	//false
		
		System.out.println(hs.remove("Sumit")); //true
		System.out.println(hs);		//[Karan, Amit]
		
		hs.add("Kamini");
		hs.add("Rinkle");
		hs.add("Simar");
		System.out.println(hs); 	//[Rinkle, Karan, Amit, Kamini, Simar]
		
		//Iterate through the complete set
		int m=0;
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println("Index :"+m +" ,value is :"+i.next());
			m++;
		}
		/*
		    Index :0 ,value is :Rinkle
			Index :1 ,value is :Karan
			Index :2 ,value is :Amit
			Index :3 ,value is :Kamini
			Index :4 ,value is :Simar
		 */
		

	}

}
