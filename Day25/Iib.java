package Day25;

public class Iib {

	{
		System.out.println("IIB 1");                 // iib gets invoked when you create an object 
	}
	{
		System.out.println("IIB 2");                 // iib gets invoked when you create an object 
	}
	
	{
		System.out.println("IIB 3");                 // iib gets invoked when you create an object 
	}
	static {                                            // sib will execute and control come in the main method so the output will be SIB, main method and IIB
		System.out.println("When to call IIB");
	}
	
	
	public static void main(String[] args) {
		new Iib();                                        // first execute this and then after go to the main method

		System.out.println("Main method");
				
	}

}
