package practice;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {


		String s1= "Amit";
		String s2= "Amit";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1 = "Amit sharma";
		System.out.println(s1.hashCode());
		System.out.println(s1);
		
		String s3 = new String("Rahul");
		System.out.println(s3.hashCode());
		
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		
		switch(nextInt) {
		
		
		case 1: 
			System.out.println("Monday"); 
			break;
		case 2: 
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default : 
			System.out.println("Not valid value selected");
			break;
		
		}
			
		

	}

}
