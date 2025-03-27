package rs_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Exercise {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(Arrays.asList("apple", "banana", "cherry", "mango", "apple"));
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		if(a.contains("orange")) {
			System.out.println("Orange found");
		}else {
			System.out.println("Orange not found");
		}
		
		System.out.println("Size of arraylist is :"+a.size());
		
		for(int i=0; i<a.size(); i++) {
			System.out.println("Element at "+i+ " is and value is "+ a.get(i));
		}
		
		System.out.println("----------------");
		for (String s:a){
	        System.out.println(a.indexOf(s)+" "+s);
       }
	}
}
