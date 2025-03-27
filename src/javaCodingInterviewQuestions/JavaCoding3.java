package javaCodingInterviewQuestions;

import java.util.ArrayList;

public class JavaCoding3 {

	public static void main(String[] args) {
		//11. Fibanocci series - 0 1 1 2 3 5 8 13 21 34
		int n=20;
		_11_fibanocciSeries(n);
		System.out.println("\n=============================================================");
		
		//12. Check if a number is prime
//		Logic : if number% i ==0, then it's not a prime number
//				we should start i from 2 and ends with number/2
		int number = 13;
		_12_CheckPrimeNumber(number);
		System.out.println("=============================================================");
		
		//13. Minimum number in multidimensional array
		int b[][]= {{2,3,4},{5,7,8},{4,9,8}};
		_13_MinimumNumberMultidimensionalArray(b);
		System.out.println("=============================================================");
		
		//14. Maximum number in multidimensional array
		int c[][]= {{2,3,4},{5,7,8},{4,9,8}};
		_14_MaximumNumberMultidimensionalArray(c);
		System.out.println("=============================================================");
		
		//15. Eliminate duplicates and print unique numbers in Array
		//Frequency of each element in an array
		int arr1[] = {4,5,5,5,4,6,6,1,9,4};
		_15_FrequencyOfEachElement(arr1);

	}

	private static void _15_FrequencyOfEachElement(int[] arr1) {


		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<arr1.length; i++) {
			int k=0;
			
			if(!a.contains(arr1[i])) {
				a.add(arr1[i]);
				k++;
				
				for(int j=i+1; j<arr1.length; j++) {
					if(arr1[i]==arr1[j]) {
						k++;	
					}
				}
				System.out.println("Element is "+arr1[i]+" and it is repeated "+ k + " times.");
				if(k==1) {
					System.out.println(arr1[i]+ " is the unique number");
				}
			}
		}
		
	}

	private static void _11_fibanocciSeries(int n) {
		
		System.out.println("Fibanocci Series till "+n+ " digits :");
		int num1 = 0;
		int num2 = 1;
		for(int i=0; i<n; i++) {
			System.out.print(num1+" ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
	
	private static void _12_CheckPrimeNumber(int number) {

		boolean flag = false;
		for(int i=2; i<=number/2; i++) {
			if(number%2 ==0) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(number + " is not a prime number");
		}else {
			System.out.println(number + " is a prime number");
		}
		
	}
	
	private static void _13_MinimumNumberMultidimensionalArray(int[][] b) {
		System.out.println("Minimum numbers in a multidimensional array.");
		int min = b[0][0];
		System.out.println("Arrays are :");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				if(min > b[i][j]) {
					min = b[i][j];
				}
			}
		}
		System.out.println("Minimum number is "+min);
	}
	
	private static void _14_MaximumNumberMultidimensionalArray(int[][] b) {
		System.out.println("Maximum numbers in a multidimensional array.");
		int max = b[0][0];
		System.out.println("Arrays are :");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				if(max < b[i][j]) {
					max = b[i][j];
				}
			}
		}
		System.out.println("Maximum number is "+max);
		
	}

}
