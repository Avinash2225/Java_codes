package maxminhighlow;

public class MaxMinInArray {

	public static void main(String[] args) {

		int num [] = {1,2,3,4,56};
		
		int max = num[0];
		int min = num [0];
		for(int i=1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
				
			}else if (num[i]<min){
				min = num[i];
			}
		}
		
		System.out.println("largest number in the array is:"+ max );
		System.out.println("largest number in the array is:"+ min );

	}

}
