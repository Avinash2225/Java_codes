package questionsfromarray;

import java.util.Arrays;

public class ArrayCopy1 {
// how to copy one array to another array
	public static void main(String[] args) {

		int a [] = {3,4,21,23,55,78};
		
		int a2 [] = new int [a.length];
		
		for(int i=0; i<a2.length; i++) {
			a2[i] = a[i];
		}
	
		System.out.println("old array");
		System.out.println(Arrays.toString(a));
		System.out.println("copy in new array");
		System.out.println(Arrays.toString(a2));
	}
}
