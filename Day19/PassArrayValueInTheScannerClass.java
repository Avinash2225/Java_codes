package Day19;

import java.util.Arrays;
import java.util.Scanner;
// **** interview multiple times how to take value of the array using scanner class 
public class PassArrayValueInTheScannerClass {

	public static void main(String[] args) {
      int rollno1 [] = new int [5];
      System.out.println("Enter the value of the array");
      Scanner s1 = new Scanner(System.in);
      
     for( int i=0; i<rollno1.length; i++) {  
    	 rollno1 [i]= s1.nextInt(); 
    	 
    	 
     }
		System.out.println(Arrays.toString(rollno1)); // this the value to print of your value
		
	}

}
