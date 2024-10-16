package day6;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {

		System.out.println("Welcome to the factorial calculator");
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
		factorial = factorial*i;
		}
		
		System.out.println("factorial of the number is:"+ factorial);
		
	}

}
