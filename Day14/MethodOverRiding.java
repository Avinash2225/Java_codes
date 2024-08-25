package Day14;

class Paytm {
	void login() {
		
		System.out.println("Login with your mobile number");
		}
}

public class MethodOverRiding extends Paytm {

void login () {
	//super.login();  // by using super keyword we are calling parent class method

	System.out.println("Login with your Email Id");
	
}                                             // child class implementation has overridden by parent class implementation
public static void main(String args []) { 
	MethodOverRiding m1 = new MethodOverRiding();
	m1.login();
	Paytm p1 = new Paytm();
	p1.login();
}
	
}
