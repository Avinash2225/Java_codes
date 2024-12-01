package da3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayEqual1 {

	public static void main(String[] args) {
System.out.println("welcome to array checking");
		int arr [] = new int [5];
		
		System.out.println("Enter the first array");
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			}
		System.out.println("Enter the second array");

		
		int arr2 [] =  new int [5];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = sc.nextInt();
			}
		
		
		System.out.println(Arrays.equals(arr, arr2));
		sc.close();
	}
}