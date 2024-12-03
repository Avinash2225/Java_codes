package day1;

public class Method122 {

	static void Amazon1() {
		System.out.println("this is first method");
	}
	static void Amazon(int a) {
		System.out.println("this is first method");
	}
	
	void Amazon(int a , int b) {
		System.out.println("This is three");
	}
	
	public static void main(String[] args) {
		
		
		Amazon1();
		Amazon(3);
		Method122 m1 = new Method122 ();
		
		m1.Amazon(23, 340);
		
	}

}
