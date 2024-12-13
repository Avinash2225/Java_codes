package probleumsonnumbers;

public class Fibonaciseries11 {

	public static void main(String[] args) {

		int n1 =0;
		int n2=1;
		int count = 10;
		int n3;
		//int sum=0;
		System.out.println(n1+ "" +n2);
		for(int i=2; i<count; i++) {
		n3 = n1+n2;
		System.out.println(n3);

			n1=n2;
			n2=n3;
			
		}
		
	
	}

}
