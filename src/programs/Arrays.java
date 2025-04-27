package programs;

import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {
		Arrays arr = new Arrays();
		
//		arr._1PrintElementsOfArray();
//		arr._2CopyOneArrayToAnother();
//		arr._3PrintElementsInreverseOrder();
//		arr._4EvenAndOddElements();
//		arr._5SumOfAllElementsOfArray();
//		arr._6SortArray_AscendingOrder();
//		arr._7SortArray_DescendingOrder();
//		arr._8LargestElementInArray();
//		arr._9SmallestElementInArray();
//		arr._10MissingNumbersInArray();
		arr._11Print_duplicate_elements_in_an_array();
//		arr._14Frequency_Of_Each_Element_In_An_Array();

	}
	
	public void _1PrintElementsOfArray() {
		System.out.println("***** 1. Print elements of an array *****");
		int a[] = {1,2,3,4,5};
		
		System.out.println("Elements of an array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n-------------------------------------------------------------------");
	}
	
	public void _2CopyOneArrayToAnother() {
		System.out.println("***** 2. Copy one array to another *****");
		int a[] = {1,2,3,4,5};
		int b[] = new int[a.length];
		
		System.out.print("Elements of first array are :: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		
		System.out.println();
		System.out.print("Elements of copied array are :: ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.println("\n-------------------------------------------------------------------");
	}

	public void _3PrintElementsInreverseOrder() {
		System.out.println("***** 3. Print elements of an array in reverse order *****");
		int a[] = {1,2,3,4,5};
		
		System.out.println("Elements of an array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		System.out.println("Elements of an array in revrerse order are ::");
		for(int i=a.length-1; i>=0 ; i--) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n-------------------------------------------------------------------");
	}
	
	public void _4EvenAndOddElements() {
		System.out.println("***** 4. Print elements in array at even and odd positions *****");
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Elements of an array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				System.out.println("element at "+i+" position is "+a[i]+ " ,Its an even number!!");
			}else {
				System.out.println("element at "+i+" position is "+a[i]+ " ,Its an odd number!!");
			}
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _5SumOfAllElementsOfArray() {
		System.out.println("***** 5. Sum of all elements of an array *****");
		int a[] = {1,2,3,4,5};
		
		System.out.println("Elements of an array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		int sum=0;
		System.out.println();
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of all elements are : "+sum);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _6SortArray_AscendingOrder() {
		System.out.println("***** 6. Sort elements of an array in ascending order *****");
		int a[]= {10,45,30,99,23,67,5,18,37};
		
		System.out.println("Elements of an array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		int temp=0;
		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=1; j<a.length; j++) {
				if(a[j-1]>a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Elements of an array in sorted order are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n-------------------------------------------------------------------");
	}

	public void _7SortArray_DescendingOrder() {
		System.out.println("***** 6. Sort elements of an array in descending order *****");
		int a[]= {10,45,30,99,23,67,5,18,37};
		
		System.out.println("Elements of an array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		int temp=0;
		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=1; j<a.length; j++) {
				if(a[j-1]<a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Elements of an array in sorted order are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n-------------------------------------------------------------------");
	}
	
	public void _8LargestElementInArray() {
		System.out.println("***** 8. Print largest and second largest element in an array *****");
		int a[]= {10,45,30,99,23,67,5,18,37};
		
		System.out.println("Elements of an array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		java.util.Arrays.sort(a);
		
		System.out.println("Elements of an array after sorting are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\nLargest element is :"+a[a.length-1]);
		System.out.println("Second Largest element is :"+a[a.length-2]);
		System.out.println("-------------------------------------------------------------------");
		
	}

	public void _9SmallestElementInArray() {
		System.out.println("***** 9. Print smallest and second smallest element in an array *****");
		int a[]= {10,45,30,99,23,67,5,18,37};
		
		System.out.println("Elements of an array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		java.util.Arrays.sort(a);
		
		System.out.println("Elements of an array after sorting are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\nSmallest element is :"+a[0]);
		System.out.println("Second Smallest element is :"+a[1]);
		System.out.println("-------------------------------------------------------------------");
	}

	public void _10MissingNumbersInArray() {
		System.out.println("***** 10. Program to find missing number in an integer array *****");
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Elements of first array are ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		int b[]= {1,2,3,5,6,7,8,9,10};
		System.out.println("\nElements of second array are ::");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+ " ");
		}
		
		int n = a.length;
		int firstArraySum = n*(n+1)/2;
		System.out.println("\nSum of first array:: "+firstArraySum);
		
		int secondArraySum=0;
		for(int j=0; j<b.length; j++) {
			secondArraySum = secondArraySum + b[j];
		}
		System.out.println("Sum of Second array:: "+secondArraySum);
		int difference = firstArraySum-secondArraySum;
		
		System.out.println("Missing number is :: "+difference);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _11Print_duplicate_elements_in_an_array() {
		System.out.println("***** 11. Print duplicate elements in an array. *****");
		
		int a[]= {4,5,2,1,5,3,2,1,8,4,2,4}; 
		System.out.println("Array elements are :: "+ java.util.Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++ ) {
				if(a[i]==a[j]) {
					System.out.print(a[i] + " ");
					break;
				}
			}
		}
		
		System.out.println("-------------------------------------------------------------------");
	}

	public void _14Frequency_Of_Each_Element_In_An_Array() {
		System.out.println("***** 14. Program to find frequency of each element in an array. *****");
		
		int a[]= {1,2,3,4,1,2,5,6,4,3,4}; //{1,2,3,4,-1,-1,5,6,-1,-1,-1};
		int fr[] = new int[a.length];
		int visited = -1;
		System.out.println("Array elements are :: "+ java.util.Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			int count = 1;
			for(int j=i+1; j<a.length; j++ ) {
				if(a[i]==a[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i] = count;
			}
		}
		
		System.out.println("Frequency of each number is : ");
		for(int k=0; k<fr.length; k++) {
			if(fr[k]!=visited) {
				System.out.println(a[k]+ " | "+ fr[k]);
			}
		}
		
		System.out.println("Maximum occuring character");
		int max =0;
		int maxPos = 0;
		for(int m=0; m<fr.length; m++) {
			if(fr[m]>max) {
				max = fr[m];
				maxPos = m;
			}
		}
		System.out.println("Number "+ a[maxPos] + " repeating maximum "+ max+ " times");
		
		System.out.println("-------------------------------------------------------------------");
	}
	
	
	
	
	
	
}
