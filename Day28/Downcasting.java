package Day28;

class Type1

 {

}

public class Downcasting  extends Type1 {   // not relation with object directly indirectly yes
	
	
	public static void main(String[] args) {

		Type1 t1 = new Downcasting (); // upcasting  parent class se ho raha hai
		// implicit way
		
		Type1 t2 = (Type1) new Downcasting (); // upcasting
		// upcasting by explicit way
		
		Downcasting d1 = new Downcasting ();   //  child class se ho raha hai
		// Explicitly
		 

	}

}
