package Day13;

class One{
	static void add () {
		System.out.println("1");
		
	}
	
}
class Two extends One  {
	static void sub () {
		System.out.println("2");
		
	}
	
}

public class Multilevel extends Two {
	static void mul() {
		System.out.println("3");
	}
public static void main(String [] args) {
	//Multilevel m1 = new Multilevel();
    add();
   sub();
   mul();
	
	
}
}
