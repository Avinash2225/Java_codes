package Day5;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int a [] = {2,4,9,5,1,7};
	//	for(int i=0; i<a.length; i++) {
	/*	System.out.println("Arrays elements before sorting:"+Arrays.toString(a)); // this is a built in method to sort an array

			Arrays.sort(a);
			System.out.println("Arrays elements After sorting:"+Arrays.toString(a));

		*/	
			System.out.println("Arrays elements before sorting: "+ Arrays.toString(a));
			
			Arrays.parallelSort(a);
			
			System.out.println("Arrays elements after sorting: "+ Arrays.toString(a));
			
		}
	}


