package ProgramsOnNumber;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in); // this way we can take input on run time
		int num = sc.nextInt();
			//	int num= 5;
				int count = 0;
				if(num>1) {
					for(int i=1; i<=num; i++) {
						if(num%i==0) 
							count++;

						}
							if(count==2) {
								System.out.println("number is prime number");
							}else {
								System.out.println("num is not prime number");
							}
				}
				sc.close();
					//	else {
					//System.out.println("num is not a prime number");
				//}
			}

		}
