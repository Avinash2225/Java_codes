package Day28;

public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		double b1 = 100; //  implicit widening
		System.out.println(b1);
		int b = 100;
		double b2 = (double)b; // explicit widening
		System.out.println(b2);
		
		int a1= (int)   77.8;  // it is not possible
		System.out.println(a1);  // Explicitly
     
		// narrowing cab not be done implicit manner it will give compile time error
		
		double wt = 88.9;
		int wt1 =  (int )wt;
		System.out.println(wt1);
	}

}
