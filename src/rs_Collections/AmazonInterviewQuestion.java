package rs_Collections;

import java.util.ArrayList;

public class AmazonInterviewQuestion {

	public static void main(String[] args) {
		//Print unique numbers with the count of their occurance
		
		//Initialize an empty arrayList, 
		//Iterate through array, if a number is not found add in array list
		//add another loop to search for that number in array 
		//if number found increment it.
		
		int a[] = {4,5,5,5,4,6,6,9,4,3,2,1,5};
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			int k=0;
			if(!a1.contains(a[i])) {
				a1.add(a[i]);
				k++;
				for(int j=i+1; j<a.length; j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println("Element "+a[i]+" and number of times :"+k);
				if(k==1) {
					System.out.println("Element "+a[i]+" is unique number");
				}
			}
			
		}
	}
}
