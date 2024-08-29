
public class CompileTimePolymorphism {

	static void add(int a) {
		System.out.println("Method1");
		
	}
	
	static void add2(int a, int b) {
		System.out.println("Method2");
		
	}
	
	
	static void add3(int c , int d) {
		System.out.println("Method3");
		
	}
	public static void main(String[] args) {
	
		add(1);
		add2(10,30);
		add3(300,90);
	}

}
