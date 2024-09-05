package Day17;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Array in java use to homogenous value together the syntex of the array is data type 
		
		String name [] = new String [4];
	
		//	2nd exception 	// create an array for string datatype and store the names of 3 students
		//  Index 2 out of bounds for length 2   at Day17.Array.main(Array.java:17)
	
		name[0] = "Avinash";
		name[01] = "Avinash";  // update the value of the array
		name[02] = "Yadav";
		
		// if your size of the array is 2 and you go for 3 then it will throw exception array index out of the bound exception
		
		
		// first way to print values of the array
		//System.out.println(name[0]);
		//System.out.println(name[1]);
	    //System.out.println(name[2]);

		// 2nd way to print 
		System.out.println(Arrays.toString(name));  // this way you can also print the array 
		  
	}
}




