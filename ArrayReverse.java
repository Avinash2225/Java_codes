package Day19;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		int oldarray [] = new int [3];
		oldarray[0] = 54;
		oldarray[1] = 24;
		oldarray[2] = 84;
		
		int reverse_array [] = new int [3];
		/*reverse_array[2] = oldarray[0];
		reverse_array[1] = oldarray[1];
		reverse_array[0] = oldarray[2];
		*/
		for(int  i=0, k=2; i<oldarray.length; i++) {
			
			reverse_array[k] = oldarray[i];
			k--;
		}
		
		System.out.println(Arrays.toString(oldarray));
		System.out.println(Arrays.toString(reverse_array));

		
	}

}
