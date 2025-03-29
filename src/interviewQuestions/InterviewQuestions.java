package interviewQuestions;

import java.util.Scanner;

public class InterviewQuestions {

	public static void main(String[] args) {
		
		//1. Java program to Find Odd or Even number
		odd_Even_Numbers();
		
		//2. Java program to find Prime number
		checkPrimeNumber();
		
		//4. Java program to swap two numbers without using third variable
		swap_2_Numbers(20,50);
		
		//5. Java program to Find Factorial on given Number
		factorialOfNumber();
		
		//7. Java program to Reverse Number
		reverseNumber();
		
		//8. Java program to find number of digits in given number
		countNumberOfDigits();
		
		//9. Java program to find Palindrome number
		palindromeCheck();
		
		//10. Java program to calculate the sum of digits of a number
		sumOfDigitsOfNumber();
	}

	public static void odd_Even_Numbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (to check for even or odd) : ");
		int number = sc.nextInt();
		
		if(number%2 ==0) {
			System.out.println("Entered number is "+number + " , And its an even number!");
		}else {
			System.out.println("Entered number is "+number + " , And its an odd number!");
		}
//		sc.close();
		System.out.println("-------------------------------------------------------------------");
	}

	private static void checkPrimeNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (to check for prime) : ");
		int number = sc.nextInt();
		boolean flag = false;
		
		for(int i=2 ; i<number/2; i++) {
			if(number%i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Entered number is "+ number + " ,And its a prime number !!");
		}else {
			System.out.println("Entered number is "+ number + " ,And its not a prime number !!");
		}
		System.out.println("-------------------------------------------------------------------");
		
	}
	
	public static void swap_2_Numbers(int a, int b) {
		System.out.println("Numbers before swap : a = "+a+" , b = "+b);
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("Numbers after swap : a = "+a+" , b = "+b);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public static void factorialOfNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (to find factorial) : ");
		int number = sc.nextInt();
		int fact = 1;
		
		while(number!=0) {
			fact = fact * number;
			number--;
		}
		System.out.println("Factorial of number is "+ fact);
		System.out.println("-------------------------------------------------------------------");
	}
	

	private static void reverseNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (to reverse) : ");
		int num = sc.nextInt();
		System.out.println("Entered number is :: "+ num);
		int reverse=0;
		
		while(num!=0) {
			int n = num % 10;
			num = num / 10;
			reverse = reverse * 10 + n; 
		}
		System.out.println("Number after reverse :: " + reverse);
		System.out.println("-------------------------------------------------------------------");
	}

	private static void countNumberOfDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (to count) : ");
		int num = sc.nextInt();
		int count=0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits is "+ count );
//		sc.close();
		System.out.println("-------------------------------------------------------------------");
	}
	
	
	private static void palindromeCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (to check palindrome) : ");
		int num1 = sc.nextInt();
		System.out.println("Entered number is :: "+ num1);
		int num = num1;
		int reverse=0;
		
		while(num!=0) {
			int n = num % 10;
			num = num / 10;
			reverse = reverse * 10 + n; 
		}
		System.out.println("Number after reverse :: " + reverse);
		if(num1 == reverse) {
			System.out.println("Above number is palindrome number !!");
		}else {
			System.out.println("Above number is not palindrome number !!");
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	private static void sumOfDigitsOfNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (to find sum) : ");
		int num1 = sc.nextInt();
		System.out.println("Entered number is :: "+ num1);
		int num = num1;
		int sum=0;
		
		while(num!=0) {
			int n = num % 10;
			sum = sum + n;
			num = num/10;
		}
		System.out.println("Sum of all digits :: "+ sum);
		System.out.println("-------------------------------------------------------------------");
	}
}
