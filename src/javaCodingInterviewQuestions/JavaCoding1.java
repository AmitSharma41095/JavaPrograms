package javaCodingInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaCoding1 {

	public static void main(String[] args) {
		//1. Create a method which accepts Array and return sum of all the elements of arrays
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum = _1_SumOfArrayElements(a);
		System.out.println("Sum of all the elements are : "+sum);
		System.out.println("=============================================================");
		
		//2. Print multiplication table without using multiply operator
		int num = 5;
		_2_MultiplicationTableWithoutMultiplyOperator(num,10);
		System.out.println("=============================================================");
		
		//3. Maximum difference between any adjacent index in array (using temporary array)
		int b[] = {1,4,8,15,17};	//difference : 3 4 7 2    o/p =7
		int maxDiffernence = _3_MaximumDifferenceBetweenAdjacentIndexes(b);
		System.out.println("Maximum difference between any adjacent index in array is : "+maxDiffernence);
		System.out.println("=============================================================");
		
		//4. Maximum difference between any adjacent index in array (without using temporary variable)
		int m[] = {1,4,8,15,17};	//difference : 3 4 7 2    o/p =7
		int maxDiffernence_1 = _4_MaximumDifferenceBetweenAdjacentIndexesTemporaryVariable(m);
		System.out.println("Maximum difference between any adjacent index in array is : "+maxDiffernence_1);
		System.out.println("=============================================================");
		
		//5. Compare same indexes of 2 different arrays and create new array for match Values
		int a1[] = {1,4,5,7,3};
		int b1[] = {6,4,3,7,3};
		ArrayList<Integer> MatchedValues = _5_CompareArrayIndexes(a1,b1);
		System.out.println("\nMatched values : "+MatchedValues);

	}
	
	private static int _4_MaximumDifferenceBetweenAdjacentIndexesTemporaryVariable(int[] b) {
		System.out.println("Array elements:");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println("\nDifference between adjusent arrays : ");
		
		for(int i=0; i<b.length-1; i++) {
			int num1 = b[i+1];
			int num2 = b[i];
			System.out.print(num1-num2 + " ");
		}
		System.out.println();
		
		int maxValue = 0;
		int difference = 0;
		for(int i=0; i<b.length-1; i++) {
			difference = b[i+1]-b[i];
			if(difference>maxValue) {
				maxValue = difference;
			}
		}
		return maxValue;
	}

	private static int _3_MaximumDifferenceBetweenAdjacentIndexes(int[] b) {
		int temp[] = new int[b.length];
		
		System.out.println("Array elements:");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println("\nDifference between adjusent arrays : ");
		
		for(int i=0; i<b.length-1; i++) {
			int num1 = b[i+1];
			int num2 = b[i];
			System.out.print(num1-num2 + " ");
			temp[i]=num1-num2;
			
		}
		System.out.println();
		
		Arrays.sort(temp);
		return temp[temp.length-1];
		
	}

	private static void _2_MultiplicationTableWithoutMultiplyOperator(int a, int number) {
		System.out.println("Multiplication table of "+a+ " is : ");
		int sum = 0;
		for(int i=1; i<=number; i++) {
			//System.out.println(a+" * "+ i + " = "+ a*i);  //with multiplication opeśrator
			int num = sum+a;
			sum = num;
			System.out.println(a+" * "+ i + " = "+ num);
		}
		
	}

	public static int _1_SumOfArrayElements(int[] a) {
		System.out.println("Array elements:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println();
		return sum;
	}
	
	private static ArrayList<Integer> _5_CompareArrayIndexes(int[] a1, int[] b1) {
		
		System.out.println("First Array::");
		for(int i=0; i<a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		
		System.out.println("\nSecond Array::");
		for(int i=0; i<b1.length; i++) {
			System.out.print(b1[i]+" ");
		}

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i=0; i<a1.length; i++) {
			if(a1[i]==b1[i]) {
				arrList.add(a1[i]);
			}
		}
		return arrList;
	}

}
