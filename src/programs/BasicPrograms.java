package programs;

import java.util.Scanner;

public class BasicPrograms {

	public static void main(String[] args) {
		BasicPrograms bp = new BasicPrograms();
		
//		bp._1PrintNumberEnteredByUser();
//		bp._2DisplayAsciiValue();
//		bp._3QuotientAndRemainder();
//		bp._4Swap2Numbers();
//		bp._5Swap2NumbersWithoutTempVariable();
//		bp._6EvenAndOdd();
//		bp._7LargestOf3Numbers();
//		bp._8Positive_Negative_ZeroNumber();
		bp._9SumOfNnaturalNumbers();
		bp._10MultiplicationTable();
//		bp._11AlphabetOrNot();
//		bp._12FibonaciiSeries();
//		bp._13CountNumberOfDigits();

	}
	
	public void _1PrintNumberEnteredByUser() {
		System.out.print("enter a number : ");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		
		System.out.println("Entered number is = "+nextInt);
		System.out.println("-------------------------------------------------------------------");
	}

	public void _2DisplayAsciiValue() {
		char c = 'h';
		
		System.out.println("Ascii value of character "+c+" is "+(int)c );
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _3QuotientAndRemainder() {
		System.out.print("enter first number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.print("enter second number : ");
		int b = sc.nextInt();
		
		System.out.println("Quotient of 2 numbers are "+a/b);
		System.out.println("Remainder of 2 numbers are "+a%b);
		System.out.println("-------------------------------------------------------------------");
	}

	public void _4Swap2Numbers() {
		System.out.println("*****Swap 2 numbers with temp variable **********");
		System.out.print("enter first number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.print("enter second number : ");
		int b = sc.nextInt();
		
		System.out.println("Before Swap");
		System.out.println("Value of a "+a+" and value of b "+b);
		
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("After Swap");
		System.out.println("Value of a "+a+" and value of b "+b);
		System.out.println("-------------------------------------------------------------------");
		
	}

	public void _5Swap2NumbersWithoutTempVariable() {
		System.out.println("*****Swap 2 numbers without temp variable **********");
		System.out.print("enter first number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.print("enter second number : ");
		int b = sc.nextInt();
		
		System.out.println("Before Swap");
		System.out.println("Value of a "+a+" and value of b "+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After Swap");
		System.out.println("Value of a "+a+" and value of b "+b);
		System.out.println("-------------------------------------------------------------------");
	}

	public void _6EvenAndOdd() {
		System.out.print("enter a number (to find even or odd) : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Entered number is even !");
		}else {
			System.out.println("Entered number is odd !");
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _7LargestOf3Numbers() {
		System.out.println("enter 3 numbers : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("Numbers are : Number1 = "+num1+" , Number2 = "+num2+ " ,Number3 = "+num3);
		if((num1 > num2) &&  (num1 > num3)) {
			System.out.println("Number 1 is largest : "+num1);
		}else if(num2>num3) {
			System.out.println("Number 2 is largest : "+num2);
		}else {
			System.out.println("Number 3 is largest : "+num3);
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _8Positive_Negative_ZeroNumber() {
		System.out.print("enter a number (to find positive,negative,zero) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("Negative number :: "+ num);
		}else if(num >0) {
			System.out.println("Postive number :: "+ num);
		}else {
			System.out.println("Zero number :: "+ num);
		}
		System.out.println("-------------------------------------------------------------------");
	}

	public void _9SumOfNnaturalNumbers() {
		System.out.println("*****Sum of N natural numbers **********");
		System.out.print("enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of "+num+" natural numbers are "+sum);
		System.out.println("-------------------------------------------------------------------");
	}

	public void _10MultiplicationTable() {
		System.out.println("enter a number (for muliplication table) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * "+i+" = "+num*i);
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _11AlphabetOrNot() {
		char c = 'U';
		
		if((c >='a' && c <= 'z') || (c >='A' && c <= 'Z')) {
			System.out.println("entered character is "+c+" and it's an alphabet.");
		}else {
			System.out.println("entered character is "+c+" and it's not an alphabet.");
		}
	}

	public void _12FibonaciiSeries() {
		System.out.println("enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n1= 0;
		int n2= 1;
		
		for(int i=0; i<num; i++) {
			System.out.print(n1+" ");
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
		}
	}

	public void _13CountNumberOfDigits() {
		System.out.println("enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Count of numbers are "+count);
	}
}
