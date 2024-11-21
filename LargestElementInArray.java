package maxminhighlow;

public class LargestElementInArray {

	public static void main(String[] args) {

		int num [] = {1,2,3,4,56};
		
		int largest = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i]>largest) {
				largest = num[i];
				
			}
		}
		
		System.out.println("largest number in the array is:"+ largest );

	}

}
