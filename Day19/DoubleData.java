package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleData {

	public static void main(String[] args) {

		double d1 [] = new double [3];
		System.out.println("Enter the value of the duoble");
		Scanner s1 = new Scanner(System.in);
		for(int i=0; i<d1.length; i++) {
			d1[i] = s1.nextDouble()	;	
			}
		
	System.out.println(Arrays.toString(d1));
		
		s1.close();  // if do this then it understand no need to take more values
		
		
		
		
		
	}

}
