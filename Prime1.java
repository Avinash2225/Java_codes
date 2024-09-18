package ProgramsOnNumber;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {

		System.out.println("Enter the Numbers");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count =0;
		if(num>1) {
			for(int i=1; i<=num; i++) {  // here we alawys take 1 because if we take 0 it will give you arithematic exception
				if(num%i==0)
					count++;
			}
				if(count==2) {
					System.out.println("Number is Prime number ");
				}else {
					System.out.println("Number is not prime Number");
				}
				
			}
		}
}


