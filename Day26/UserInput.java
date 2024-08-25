package Day26;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner S1 = new Scanner (System.in);
		
		System.out.println("Enter the age ");
		try {	
		int age  = S1.nextInt();
		}
		catch ( InputMismatchException b1) {
			System.out.println("sorry please read the question again");
		}
	//	Scanner S2 = new Scanner(System.in);
		System.out.println("Enter the customer name");
		try {
         String  name = S1.next();
		}
	catch (InputMismatchException b2) {
			System.out.println("sorry please read the question again");
}
                 
	}
		
}

