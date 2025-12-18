package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
//		arr._11Print_duplicate_elements_in_an_array();
		arr._12Left_Rotate();
		arr._13Right_Rotate();
		arr._14Frequency_Of_Each_Element_In_An_Array();
		arr._15Join_2_Arrays();
		arr._16Shift_all_zeros_to_the_right_side();
		arr._17Shift_all_zeros_to_the_left_side();
		removeDuplicates_SortedArray_withTemp();
        removeDuplicates_SortedArray_withoutTemp();
        removeDuplicates_UnsortedArray();
        removeDuplicates_UnsortedArray_UsingSets();
        removeDuplicates_UnsortedArray_UsingHashMaps();
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
	
	public void _12Left_Rotate() {
		System.out.println("***** 12. Left rotate n number of times. *****");
		
		int a[]= {1,2,3,4,5};
		System.out.println("Array elements are :: "+ java.util.Arrays.toString(a));
		
		for(int i=1; i<=3; i++){
            int temp = 0;
            temp = a[0];
            for(int j=0; j<a.length-1; j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=temp;
            System.out.println(i + " round :: "+java.util.Arrays.toString(a));
        }
		
		System.out.println("-------------------------------------------------------------------");
	}

	public void _13Right_Rotate() {
		System.out.println("***** 13. Right rotate n number of times. *****");
		
		int a[]= {1,2,3,4,5};
		System.out.println("Array elements are :: "+ java.util.Arrays.toString(a));
		
		for(int i=1; i<=3; i++){
            int temp = 0;
            temp = a[a.length-1];
            for(int j=a.length-1; j>0; j--){
                a[j]=a[j-1];
            }
            a[0]= temp;
            System.out.println(i + " round :: "+java.util.Arrays.toString(a));
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
	
	public void _15Join_2_Arrays() {
		System.out.println("***** 15. Program to join 2 arrays. *****");
		
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println("Array 1 is :: "+java.util.Arrays.toString(array1));
        System.out.println("Array 2 is :: "+java.util.Arrays.toString(array2));
        int joinedArray[] = new int[array1.length+array2.length];

        for(int i=0; i<array1.length; i++){
            joinedArray[i] = array1[i];
        }

        for(int i=0; i< array2.length; i++){
            joinedArray[array1.length+i] = array2[i];
        }

        System.out.println("Merged array :: "+ java.util.Arrays.toString(joinedArray));
		
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _16Shift_all_zeros_to_the_right_side() {
		System.out.println("***** 16. Shift all zeros to the right side. *****");
		
		int a[]= {1,4,0,2,0,7,2,0,3,1,0};
		System.out.println("Array elements are :: "+ java.util.Arrays.toString(a));
		
		int minIndex = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                a[minIndex++]= a[i];
            }
        }

        while(minIndex<a.length){
            a[minIndex++]= 0;
        }
        System.out.println("After shifting all zeros to the right :: "+java.util.Arrays.toString(a));
		
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _17Shift_all_zeros_to_the_left_side() {
		System.out.println("***** 17. Shift all zeros to the left side. *****");
		
		int a[]= {1,4,0,2,0,7,2,0,3,1,0};
		System.out.println("Array elements are :: "+ java.util.Arrays.toString(a));
		
		int maxIndex = a.length-1;

        for(int i=a.length-1; i>=0; i--){
            if(a[i]!=0){
                a[maxIndex--]=a[i];
            }
        }

        while(maxIndex>=0){
            a[maxIndex--]=0;
        }
        System.out.println("After shifting all zeros to the left :: "+java.util.Arrays.toString(a));
		
		System.out.println("-------------------------------------------------------------------");
	}
	
	private static void removeDuplicates_UnsortedArray_UsingHashMaps() {
        System.out.println("Remove duplicate elements from UnSorted array - By using HashMap");
        int a[] = {1,4,9,2,4,1,7,20,4,5,2,3,6,1,1};
        System.out.println("Array elements : "+java.util.Arrays.toString(a));

        Map<Integer, Integer> uniqueMap = new HashMap<>();
        for(int i=0; i<a.length; i++){
            if(uniqueMap.containsKey(a[i])){
                uniqueMap.put(a[i],uniqueMap.get(a[i])+1);
            }else{
                uniqueMap.put(a[i],1);
            }
        }
        uniqueMap.forEach((k,v)->System.out.print(k + " "));
    }

    private static void removeDuplicates_UnsortedArray_UsingSets() {
        System.out.println("Remove duplicate elements from UnSorted array - By using Sets");
        int a[] = {1,4,9,2,4,1,7,20,4,5,2,3,6,1,1};
        System.out.println("Array elements : "+java.util.Arrays.toString(a));

        Set<Integer> UniqueElements = new HashSet<>();
        for(int i=0; i<a.length; i++){
            UniqueElements.add(a[i]);
        }
        System.out.println("Duplicate elements from above array is :: ");
        System.out.println(UniqueElements);
        System.out.println("===========================================================");

    }

    private static void removeDuplicates_UnsortedArray() {
        System.out.println("Remove duplicate elements from UnSorted array - By sorting");
        int a[] = {1,4,9,2,4,1,7,20,4,5,2,3,6,1,1};
        System.out.println("Array elements : "+java.util.Arrays.toString(a));
        java.util.Arrays.sort(a);
        int j=0;

        for(int i=0; i<a.length-1; i++){
            if(a[i]!=a[i+1]){
                a[j++]= a[i];
            }
        }
        a[j] = a[a.length-1];

        System.out.println("Duplicate elements from above array is :: ");
        for(int k=0; k<=j; k++){
            if(a[k]!=0){
                System.out.print(a[k]+ " ");
            }
        }
        System.out.println("\n===========================================================");
    }

    private static void removeDuplicates_SortedArray_withoutTemp() {
        System.out.println("Remove duplicate elements from Sorted array without using temp array");
        int a[] = {1,1,2,3,3,3,5,5,7,8,9,10,10,23,23};
        System.out.println("Array elements : "+java.util.Arrays.toString(a));
        int j=0;

        for(int i=0; i<a.length-1; i++){
            if(a[i]!=a[i+1]){
                a[j++]= a[i];
            }
        }
        a[j] = a[a.length-1];

        System.out.println("Duplicate elements from above array is :: ");
        for(int k=0; k<=j; k++){
            if(a[k]!=0){
                System.out.print(a[k]+ " ");
            }
        }
        System.out.println("\n===========================================================");
    }

    public static void removeDuplicates_SortedArray_withTemp(){
        System.out.println("Remove duplicate elements from Sorted array using temp array");
        int a[] = {1,1,2,3,3,3,5,5,7,8,9,10,10,23,23};
        System.out.println("Array elements : "+java.util.Arrays.toString(a));
        int temp[] = new int[a.length];
        int j=0;

        for(int i=0; i<a.length-1; i++){
            if(a[i]!=a[i+1]){
                temp[j++]= a[i];
            }
        }
        temp[j] = a[a.length-1];

        System.out.println("Duplicate elements from above array is :: ");
        for(int k=0; k<temp.length; k++){
            if(temp[k]!=0){
                System.out.print(temp[k]+ " ");
            }
        }
        System.out.println("\n===========================================================");

    }
	
}
