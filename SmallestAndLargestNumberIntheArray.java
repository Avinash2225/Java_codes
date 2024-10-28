package questionsfromarray;

import java.util.Arrays;

public class SmallestAndLargestNumberIntheArray {

	public static void main(String[] args) {

		int num [] = {23,21,1,3,5,7,9,0,344};
		int max = num[0];
		int min = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
				else if (num[i]<min) {
			min = num[i];		
				}
			}
		System.out.println("\n given arrays is :"+Arrays.toString(num));
		System.out.println("Largest Element in the Arrayis:"+ max);
		System.out.println("smallest Element in the Arrayis:"+ min);

	}
		

		
	}


