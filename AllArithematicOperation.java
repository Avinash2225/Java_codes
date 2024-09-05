package Day11;

import java.util.Scanner;

public class AllArithematicOperation {

	public static void main(String[] args) {

		Scanner S1 = new Scanner (System.in);
		System.out.println("Enter First numbers ");
		int a = S1.nextInt();
		System.out.println("Enter Second numbers ");
		int b = S1.nextInt();
		int sum = (a+b);
		System.out.println(sum);
		
		int sub = (a-b);
		System.out.println(sub);
		
		int mul = (a*b);
		System.out.println(mul);
		
		int div = (a/b);
		System.out.println(div);
		
		int mod = (a%b);
		System.out.println(mod);
	
		
	}

}
