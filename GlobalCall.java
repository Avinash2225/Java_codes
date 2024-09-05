package Day8;

public class GlobalCall {

static int a = 5;  // Global variable you can craete once and utilize throughout the class
static int b= 10;  // and global variable is in blue colore
	static void add () {
	int	a= 56;
		System.out.println(a+b); // a is in now brown colore
	}
	static void sub () {
		System.out.println(a-b);
	}
	
	static void mul () {
		System.out.println(a*b);
	}
	
	static void divide () {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
add();
sub();
mul();
divide();		
	}

}
