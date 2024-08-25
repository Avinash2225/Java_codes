package Day22;

abstract  class Flipkart {         // grand parent  abstract class
	abstract void login();
	abstract 	void logout();
	static void homepage()
	{ 
		int a= 45;
		int b = 78;
		System.out.println(a*b);
	}
	
} 

class Ebay extends Flipkart {  // Parent  concreate class
	static void add () {
		int a= 20;
		int b =87;
		System.out.println(a+b);

	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void logout() {
		// TODO Auto-generated method stub
		
	}



public class AbstractHai extends Ebay {    // child class  concreate class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
