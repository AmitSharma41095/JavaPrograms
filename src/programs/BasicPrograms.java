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
//		bp._9SumOfNnaturalNumbers();
//		bp._10MultiplicationTable();
//		bp._11AlphabetOrNot();
//		bp._12FibonaciiSeries();
//		bp._13CountNumberOfDigits();
//		bp._14ReverseNumber();
//		bp._15PalindromeNumber();
//		bp._16PowerOfNumber();
//		bp._17FactorialOfNumber();
//		bp._18PrimeNumber();
//		bp._19ArmstrongNumber();
//		bp._20AlphabetVowelOrConsonat();
		bp._21CheckLeapYear();

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
		System.out.println("-------------------------------------------------------------------");
	}

	public void _12FibonaciiSeries() {
		System.out.print("enter a number (for fibonacii series) : ");
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
		System.out.println("\n-------------------------------------------------------------------");
	}

	public void _13CountNumberOfDigits() {
		System.out.println("enter a number (to count digits) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Count of numbers are "+count);
		System.out.println("-------------------------------------------------------------------");
	}
	
	private void _14ReverseNumber() {
		System.out.print("enter a number (to revrese) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Entered number is "+ num );
		int reverse = 0;
		
		while(num!=0) {
			int n= num % 10;
			reverse = reverse * 10 + n;
			num = num / 10;
		}
		System.out.println("Reversed number is "+ reverse);
		System.out.println("-------------------------------------------------------------------");
	}
	

	private void _15PalindromeNumber() {
		System.out.print("enter a number (to check palindrome) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num;
		System.out.println("Entered number is "+ num );
		int reverse = 0;
		
		while(num!=0) {
			int n= num % 10;
			reverse = reverse * 10 + n;
			num = num / 10;
		}
		System.out.println("Reversed number is "+ reverse);
		if(num1 == reverse) {
			System.out.println(num1 + " is a palindrome number !!");
		}else {
			System.out.println(num1 + " is not a palindrome number !!");
		}
		System.out.println("-------------------------------------------------------------------");
	}
	

	private void _16PowerOfNumber() {
		System.out.print("enter a number (base number for power) : ");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		
		System.out.print("enter a number (exponent number for power) : ");
		int exponent = sc.nextInt();
		int result = 1;
		
		for(int i=0; i<exponent ; i++) {
			result = result * base;
		}
		System.out.println("Power of number with base "+base + " and exponent "+exponent + "  is "+result);
		System.out.println("-------------------------------------------------------------------");
	}
	

	private void _17FactorialOfNumber() {
		System.out.print("enter a number (to find factorial) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		
		for(int i=num; i>0; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of Number "+ num + " is " + fact);
		System.out.println("-------------------------------------------------------------------");
	}
	
	private void _18PrimeNumber() {
		System.out.print("enter a number (to check Prime) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		
		for(int i=2 ; i< num/2; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num + " is a prime number !!");
		}else {
			System.out.println(num + " is not a prime number !!");
		}
		System.out.println("-------------------------------------------------------------------");
	}
	

	private void _19ArmstrongNumber() {
		// 153 = cube(1) + cube(5) + cube(3)
		
		System.out.print("enter a number (to check Prime) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num;
		double result = 0;
		
		while(num!=0) {
			int n = num % 10;
			result = result + Math.pow(n, 3);
			num = num / 10;
		}
		if(num1 == result) {
			System.out.println(num1 + " is an armstrong number !!");
		}else {
			System.out.println(num1 + " is not an armstrong number !!");
		}
		System.out.println("-------------------------------------------------------------------");
	}
	

	private void _20AlphabetVowelOrConsonat() {
		System.out.println("Enter a character : ");
		Scanner sc = new Scanner(System.in);
		char val = sc.next().charAt(0);
		
		if(val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u' || val == 'A'
				|| val == 'E'|| val == 'I'|| val == 'O'|| val == 'U') {
			System.out.println("Entered character "+ val + " is a vowel !!");
		}else {
			System.out.println("Entered character "+ val + " is a consonant !!");
		}
		System.out.println("-------------------------------------------------------------------");
	}
	

	private void _21CheckLeapYear() {
		System.out.print("Enter a year (to check leap year) : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean flag = false;
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					flag = true;
				}else {
					flag = false;
				}
			}else {
				flag = false;
			}
		}else {
			flag = false;
		}
		
		if(flag == true) {
			System.out.println(year + " is a leap year !!");
		}else {
			System.out.println(year + " is not a leap year !!");
		}
		System.out.println("-------------------------------------------------------------------");
	}
}
