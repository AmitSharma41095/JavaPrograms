package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_InterviewQuestions {

	public static void main(String[] args) {
//		//11. Java program to reverse a string 
//		reverseString();	//java programming
//		
//		//12. Java program to reverse each word of a given string
//		reverseEachWordOfString("Java is good programming langauges");
//		
//		//15. Java program to count the number of words in a string
//		countNumberOfWords();  //Welcome to Java World
//		
//		//17. Java program to find if a string is Palindrome
//		checkPalindrome();	//"madam"
//		
//		//18. Java program to determine if Two Strings are Anagrams
//		checkAnagramString();
//		
//		//19. Java program to Count Vowels and Consonants in a given string
//		countVowelsAndConsonants();
//		
//		//21. Java program to print even indexed characters
//		printEvenIndexedCharacters();  //Automation
//		
//		//22. Java program to remove space from a given string
//		removeSpaceFromString();
//		
//		//23. Java program to print each letter twice from a given string
//		printEachLetterTwice();
//		
//		//24. Java program to swap two string without using 3rd variable
//		swap2NumbersWithoutTempVariable();
		
		//26. Java program to gives two Output: “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”
		javaStringCodeOutput1("aBACbcEDed");
		
		//27. Java program to gives two Output: “Subburaj”, “123” for the Input String Str = “Subbu123raj”
		javaStringCodeOutput2("Subbu123raj");

	}

	private static void javaStringCodeOutput2(String s) {
		System.out.println("Java program to gives two Output: “Subburaj”, “123” for the Input String Str = “Subbu123raj”");
		//Logic : check for alphabet if alphabet-> store in 1 string

		System.out.println("Entered string is : "+s);
		
		StringBuilder alphabet = new StringBuilder();
		StringBuilder digits = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				alphabet.append(s.charAt(i));
			}else {
				digits.append(s.charAt(i));
			}
		}
		
		System.out.println("Output 1 is :: "+alphabet);
		System.out.println("Output 2 is :: "+digits);
		System.out.println("-------------------------------------------------------------------");
	}

	private static void javaStringCodeOutput1(String s1) {
		System.out.println("Java program to gives two Output: “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”");
		System.out.println("Entered string is : "+s1);
		
		char[] chars = s1.toCharArray();
		Arrays.sort(chars);
		String s = new String(chars);
		System.out.println("Sorted string is :: "+ s);
		
		StringBuilder lower = new StringBuilder();
		StringBuilder upper = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				upper.append(s.charAt(i));
			}else if(Character.isLowerCase(s.charAt(i))) {
				lower.append(s.charAt(i));
			}
		}
		
		System.out.println("Output 1 is :: "+lower);
		System.out.println("Output 2 is :: "+upper);
		System.out.println("-------------------------------------------------------------------");
	}

	private static void reverseEachWordOfString(String s) {
		System.out.println("Java program to reverse each word of a given string");
		
		System.out.println("Entered string is : "+s);
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sbb = new StringBuilder();
		String[] split = s.split(" ");
		for(int i=0; i<=split.length-1; i++) {
			for(int j=split[i].length()-1; j>=0; j-- ) {
				sb.append(split[i].charAt(j));
			}
			sb.append(" ");
		}
		System.out.println("Reversed string word by word is :: "+sb.toString().trim());
		
		for(int i=split.length-1; i>=0; i--) {
			for(int j=split[i].length()-1; j>=0; j-- ) {
				sbb.append(split[i].charAt(j));
			}
			sbb.append(" ");
		}
		System.out.println("Reversed each string and each word is :: "+sbb.toString().trim());
		System.out.println("-------------------------------------------------------------------");
	}

	private static void checkAnagramString() {
		System.out.println("Java program to determine if Two Strings are Anagrams");
//		String str1 = "listen";
//		String str2 = "silent";
		
		String str1 = "sandy";
		String str2 = "trase";
		
		System.out.println("String 1 is :: "+str1);
		System.out.println("String 2 is :: "+str2);
		
		char[] a = str1.toLowerCase().toCharArray();
		char[] b = str2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(a.length==b.length) {
			if(Arrays.equals(a, b)) {
				System.out.println("Above two strings are anagram !!");
			}else {
				System.out.println("Above two strings are not anagram !!");
			}
		}else {
			System.out.println("Above two strings are not anagram !!");
		}
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void swap2NumbersWithoutTempVariable() {
		System.out.println("Java program to swap two string without using 3rd variable");
		String s1 = "Amit";
		String s2 = "Sharma";
		String concat = "";
		
		int a = s1.length();
		int b = s2.length();
		
		System.out.println("String 1 is :: "+ s1 + " and String 2 is :: "+ s2);
		concat = s1 + s2;
		s1 = concat.substring(a);
		s2 = concat.substring(0,a);
		
		System.out.println("After Swap ==>");
		System.out.println("String 1 is :: "+ s1 + " and String 2 is :: "+ s2);
		System.out.println("-------------------------------------------------------------------");
	}

	private static void printEachLetterTwice() {
		System.out.println("Java program to print each letter twice from a given string");
		String s = "hello";
		System.out.println("Entered string is : "+s);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			sb.append(ch).append(ch);
		}
		System.out.println("Modified string after printing each letter twice is : "+sb);
		System.out.println("-------------------------------------------------------------------");
	}

	private static void removeSpaceFromString() {
		System.out.println("Java program to remove space from a given string");
		
		String s = "Welcome to Java World";
		System.out.println("Entered string is : "+s);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!= ' ') {
				sb.append(s.charAt(i));
			}
		}
		System.out.println("String after removing white spaces :: "+sb);
		System.out.println("-------------------------------------------------------------------");
	}

	private static void countVowelsAndConsonants() {
		System.out.println("Java program to Count Vowels and Consonants in a given string");
		
		String s = "Hello World";
		System.out.println("Entered string is :: "+ s);
		
		int vowel=0;
		int consonant=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
					s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				vowel++;
			}else if(s.charAt(i)==' ') {
				
			}else {
				consonant++;
			}
		}
		System.out.println("Count of Vowels : "+ vowel);
		System.out.println("Count of Consonants : "+ consonant);
		
		System.out.println("-------------------------------------------------------------------");
	}

	private static void checkPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string (to check for Palindrome) :: " );
		String value = sc.nextLine();
		StringBuffer reverse = new StringBuffer();
		
		for(int i=value.length()-1; i>=0; i--) {
			reverse.append(value.charAt(i));
		}
		System.out.println("Original String ::"+ value);
		System.out.println("Reversed String ::"+ reverse);
		
		//convert string buffer to string for comparison : recommended to use StringBuilder rather than StringBuffer
		if(value.equals(reverse.toString())) {
			System.out.println(value + " is a plaindrome string !!");
		}else {
			System.out.println(value + " is not a plaindrome string !!");
		}
		System.out.println("-------------------------------------------------------------------");
	}

	private static void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string (to find reverse) :: " );
		String value = sc.nextLine();
		System.out.println("Entered string is :: "+value);
		StringBuffer sb = new StringBuffer();
		
		System.out.print("String in reversed order :: ");
		for(int i=value.length()-1; i>=0; i--) {
			sb.append(value.charAt(i));
		}
		System.out.println(sb);
		System.out.println("-------------------------------------------------------------------");
	}
	

	private static void countNumberOfWords() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string (to count number of words) :: " );
		String value = sc.nextLine();
		System.out.println("Entered string is :: "+value);
		
		String[] countWords = value.split(" ");
		System.out.println("Number of words in string is :: "+ countWords.length);
		System.out.println("-------------------------------------------------------------------");
	}
	
	private static void printEvenIndexedCharacters() {
		System.out.println("Java program to print even indexed characters");
		String s = "Automation";
		System.out.println("Entered string is :: "+s);
		
		for(int i=0; i<s.length(); i++) {
			if(i%2 == 0) {
				System.out.println("Character at "+i+ " index is "+ s.charAt(i));
			}
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	

}
