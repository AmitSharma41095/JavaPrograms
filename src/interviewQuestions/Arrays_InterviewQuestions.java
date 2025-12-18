package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arrays_InterviewQuestions {

	public static void main(String[] args) {
		
//		//31. Find common elements between two arrays
//		commonElements_In_2Arrays();
//		
//		//32. Find first and last element of Arraylist
//		first_last_ElementOfArrayList();
//		
//		//33. Sort an array without using in-built method
//		sortArrayAscendingOrder();
//		
//		//34. Remove duplicates from an Array
//		removeDuplicatesFromArray();
//		
//		//35. Remove duplicates from an ArrayList
//		removeDuplicatesFromArrayList();
//		
//		//36. Find the missing number in an Array
//		missingNumberInArray();
//		
//		//37. Find the largest and smallest element in an Array
//		largest_Smallest_InArray();
//		
//		//38. Search element in an Array
//		searchElementArray();
//		
//		//39. Array consists of integers and special characters,sum only integers
//		sumIntegers_IgnoreAlphabets_SpecialChars();
		
		//40. Java program –findNonRepeatedElements - input array was given [ 1,1,2,2,3,4,5,5,6,6], Output – [3,4]
		findNonRepeatedElements();

	}

	private static void findNonRepeatedElements() {
		System.out.println("Java program –findNonRepeatedElements - input array was given [ 1,1,2,2,3,4,5,5,6,6], Output – [3,4]");
		
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void removeDuplicatesFromArray() {
		System.out.println("Remove duplicates from an Array");
		
		int[] array = {5, 2, 9, 1, 6, 2, 5};
		System.out.println("Elements of array are :: "+ Arrays.toString(array));
		Set<Integer> hashSet = new HashSet<Integer>();
		
		for(int a : array) {
			hashSet.add(a);
		}
		
		System.out.println("Hash Set : "+hashSet);
		
		int withoutDuplicates[] = new int[hashSet.size()];
		int count=0;
		for(int num :hashSet) {
			withoutDuplicates[count++]= num;
		}
		
		System.out.println("Array with duplicates removed: "+ Arrays.toString(withoutDuplicates));
		System.out.println("-------------------------------------------------------------------");
	}

	private static void removeDuplicatesFromArrayList() {
		System.out.println("Remove duplicates from an ArrayList");
		
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		arrayList.add(5);
		arrayList.add(2); 
		arrayList.add(9); 
		arrayList.add(1); 
		arrayList.add(6); 
		arrayList.add(2); 
		arrayList.add(5);
		
		System.out.println("Elements of arraylist are :: "+arrayList);
		
		Set<Integer> removeDuplicates = new HashSet<Integer>();
		for(int a:arrayList) {
			removeDuplicates.add(a);
		}
		
		System.out.println("ArrayList with duplicates removed: "+ removeDuplicates);
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void commonElements_In_2Arrays() {
		
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {4, 5, 6, 7, 8};
		System.out.println("Elements of First array are :: "+ Arrays.toString(array1));
		System.out.println("Elements of Second array are :: "+ Arrays.toString(array2));
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> commonSet = new HashSet<Integer>();
		
		//added all elements from array 1 to set 1
		for(int a: array1) {
			set1.add(a);
		}
		
		//iterate through 2nd array and searches if element appears in set1
		for(int b: array2) {
			if(set1.contains(b)) {
				commonSet.add(b);
			}
		}
		
		System.out.println("Common elements are : "+ commonSet);
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void sumIntegers_IgnoreAlphabets_SpecialChars() {
		System.out.println("Array consists of integers and special characters,sum only integers");
		
		String[] a = {"5", "2", "9", "a", "1", "6", "#", "3"};
		System.out.println("Elements of array are :: "+ Arrays.toString(a));
		
		int sum =0;
		for(String s : a) {
			try {
				sum = sum + Integer.parseInt(s);
			}catch(Exception e){
				//Ignore non-integer elements
			}
		}
		System.out.println("Sum of integer elements : "+sum);
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void searchElementArray() {
		System.out.println("Search element in an Array");
		
		int[] a = {5, 2, 9, 1, 6, 3}; 
		int target = 4;
		System.out.println("Elements of array are :: "+ Arrays.toString(a));
		System.out.println("Element to find is : "+target);
		boolean visited = false;
		
		for(int i=0; i<a.length; i++) {
			if(a.length!=0) {
				if(a[i]==target) {
					System.out.println("Element "+ a[i]+ " found at "+ i+ " position !!");
					visited = true;
				}
			}else {
				System.out.println("Array is blank !!");
			}
		}
		
		if(!visited) {
			System.out.println("Element is not found in the array !!");
		}
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void largest_Smallest_InArray() {
		System.out.println("Find the largest and smallest element in an Array");
		
		int[] a = {5, 2, 9, 1, 6};
		System.out.println("Elements of array are :: "+ Arrays.toString(a));
		
		System.out.println("In Ascending order =>");
		int temp=0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\nSmallest element is :: "+a[0]);
		System.out.println("Second Smallest element is :: "+a[1]);
		System.out.println("Largest element is :: "+a[a.length-1]);
		System.out.println("Second Largest element is :: "+a[a.length-2]);
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void missingNumberInArray() {
		System.out.println("Find the missing number in an Array");
		
		int[] a = {1, 2, 3, 4, 5, 6, 8, 9};
		System.out.println("Elements of array are :: "+ Arrays.toString(a));
		
		int n = a.length+1;
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		int total = n * (n+1)/2;
		int missingNumber = total - sum;
		System.out.println("Missing number = "+ missingNumber);
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void sortArrayAscendingOrder() {
		System.out.println("Sort an array without using in-built method");
		
		int[] a = {5, 2, 9, 1, 6};
		System.out.println("Elements of array are :: "+ Arrays.toString(a));
		
		System.out.println("In Ascending order =>");
		int temp=0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n-------------------------------------------------------------------");
	}

	private static void first_last_ElementOfArrayList() {
		System.out.println("Find first and last element of Arraylist");
		
		ArrayList<String> arrayList = new ArrayList<>(); 
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date"); 
		arrayList.add("Elderberry");
		
		System.out.println("Array List elements are :: "+arrayList);
		
		if(arrayList.isEmpty()) {
			System.out.println("Array list is empty !!");
		}else {
			System.out.println("First element :: "+ arrayList.get(0));
			System.out.println("Last element :: "+ arrayList.get(arrayList.size()-1));
		}
		
		System.out.println("-------------------------------------------------------------------");
	}

}
