package day6;

public class FibonaciSeries {

	public static void main(String[] args) {
 // fibonaci series 0+1=1 1+1=2, 2+1=3, 3+2=5, 5+3=8, 8+5=13
		int n1 =0, n2=1, sum=0;
			for(int i=2; i<12; i++) {
				sum = n1+n2;
				
			
			System.out.println("the sum of the fibonaci series  "+sum);
			n1=n2;
			n2= sum;
					
			}
		
	}
		
		
		
}
