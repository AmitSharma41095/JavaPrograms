package practice;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Multiplication table");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		for(int j=1; j<=10; j++) {
			System.out.println(value+" * "+j+" = "+j*value);
		}
		
		System.out.println("Multiplication table using while");
		int k=1;
		while(k<=10) {
			System.out.println(value+" * "+k+" = "+k*value);
			k++;
		}
		
		System.out.println("Break");
		for(int a=1; a<=10; a++) {
			System.out.println(a);
			if(a==5)
				break;
		}

		System.out.println("Continue");
		for(int b=1; b<=10; b++) {
			System.out.println(b);
			if(b==5)
				continue;
		}
		
	}

}
