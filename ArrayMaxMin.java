package day6;

import java.util.Arrays;

public class ArrayMaxMin {

	public static void main(String[] args) {

		int num [] = {1,0, 2,3,4,5,6,222};
		int max = num[0];
		int min  = num [0];
		for(int i=1; i<num.length; i++) {
			
			if(num[i]> max) {
				max = num[i];
			
			}
			else if 
				(num[i]<min) {
				min = num[i];
			}
			
		}
		System.out.println("in the given array:"+ Arrays.toString(num));
		System.out.println("Maxmimum number in the array is:"+ max);
		System.out.println("minimum number in the array is:"+ min);
	}
}
		

	