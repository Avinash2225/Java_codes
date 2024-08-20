package Day6;

public class callingNonStaticMethod {

	int a =5;
	int b= 7;
	 int sum = a+b;
	void sum () {
		System.out.println(sum);
	}
	
	int a1 =5;
	int b1= 7;
	int substract = a1-b1;
	void substract () {
		System.out.println(substract);
	}
	public static void main(String[] args) {

		callingNonStaticMethod cs = new callingNonStaticMethod ();
		cs.sum();
		cs.substract();
	
	}

}
