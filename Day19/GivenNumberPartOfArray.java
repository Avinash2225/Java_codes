package Day19;

import java.util.Scanner;

public class GivenNumberPartOfArray {

	public static void main(String[] args) {

		int num [] = new int [4];
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;
		
		System.out.println("Enter the number");
		Scanner s1 = new Scanner(System.in);
		int inputnum = s1.nextInt();
		boolean num1 = false;
		for(int i=0; i<num.length; i++) {
			if ( num[i] == inputnum) {
				System.out.println("number is found");
				boolean num2 = true;
				break;
			}
		}
		if(num1) {
			System.out.println("number is part of an array");
		}else {
			System.out.println("number is not pary of array");
		}
		
		
	}

}
