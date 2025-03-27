package rs_Collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		//this is not recommended, as its giving warning
		ArrayList ar = new ArrayList();
		ar.add("test");
		ar.add(1);
		ar.add(13.90);
		System.out.println(ar);		//[test, 1, 13.9]
		
		//parametrized
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		System.out.println(a);		//[10, 20]
		
		//add at 1st index
		a.add(1, 50);
		a.add(3,400);
		System.out.println(a); 		//[10, 50, 20, 400]
		
		//duplicate values are allowed
		a.add(400);
		System.out.println(a);		//[10, 50, 20, 400, 400]
		
		//size of arraylist
		System.out.println(a.size());	//4
		
		//to check if value exists in list
		System.out.println(a.contains(50));	 	//true
		
		//to check at which index value is present
		System.out.println(a.indexOf(400));	 	//3
		
		//remove at 1 index & remove all
		System.out.println(a.remove(1));	//50
		System.out.println(a);				//[10, 20, 400, 400]
		System.out.println(a.removeAll(a));	//true
		System.out.println(a);				//[]
	}

}
