package Day19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringData {
// pass the value of the array in java to print string using for loop
	// create an array of double data type pass into input.nextdouble
	// 
	public static void main(String[] args) {

		String name [] = new String [5];
		System.out.println("Enter the String name");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
			name [i] = sc.next();
		}
		System.out.println(Arrays.toString(name));
		
	}

}
