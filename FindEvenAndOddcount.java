package Day4;

public class FindEvenAndOddcount {

	public static void main(String[] args) {

		int num = 123456;
		int odd = 0;
		int Even = 0;
		
		while(num>0) {
			if(num%2==0) {
				Even++;
			}else {
				odd++;
			}
			num = num/10;
	
			
		}
		System.out.println("Even count is:" + Even);
		
		System.out.println("Even count is:" + odd);

		
		
	}

}
