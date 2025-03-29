package interviewQuestions;

import java.util.Scanner;

public class Strings_InterviewQuestions {

	public static void main(String[] args) {
//		//11. Java program to reverse a string
		reverseString();
		
//		//15. Java program to count the number of words in a string
//		countNumberOfWords();  //Welcome to Java World
//		
//		//21. Java program to print even indexed characters
//		printEvenIndexedCharacters();  //Automation

	}

	private static void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :: " );
		String value = sc.nextLine();
		System.out.println("Entered string is :: "+value);
		
		System.out.print("String in reversed order :: ");
		for(int i=value.length()-1; i>=0; i--) {
			System.out.print(value.charAt(i));
		}
		System.out.println("\n-------------------------------------------------------------------");
	}
	

	private static void countNumberOfWords() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :: " );
		String value = sc.nextLine();
		System.out.println("Entered string is :: "+value);
		
		String[] countWords = value.split(" ");
		System.out.println("Number of words in string is :: "+ countWords.length);
		System.out.println("-------------------------------------------------------------------");
	}
	
	private static void printEvenIndexedCharacters() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :: " );
		String value = sc.nextLine();
		System.out.println("Entered string is :: "+value);
		
		for(int i=0; i<value.length(); i++) {
			if(i%2 == 0) {
				System.out.println("Character at "+i+ " index is "+ value.charAt(i));
			}
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	

}
