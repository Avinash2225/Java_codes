package ImportantArrayQuestions;

public class MaxAndMinInArray11 {

	public static void main(String[] args) {

		int num [] = {1,2,3,4,5,55};
		
		int max =num[ 0];
		int min = num[0];
		
		for(int i=1; i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
			}
		
			if(num[i]<min) {
			min = num[i];	
		}
		
		}
		System.out.println("Largest number in the array is:"+ max);

		System.out.println("smallest number in the array is:"+min);


	}

}
