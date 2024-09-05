package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class Booleandata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b1  [] = new boolean [5];
	    System.out.println("Enter the value of the boolean");
        Scanner sc1 = new Scanner(System.in);
	
		for(int i=0; i< b1.length; i++ ) {
			b1[i] = sc1.nextBoolean();
			}
		System.out.println(Arrays.toString(b1));
		
	}

}
