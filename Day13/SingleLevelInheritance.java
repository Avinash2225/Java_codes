package Day13;

class Ebay{
	static void Nokia() {
		System.out.println("mobile model number");
	}
void simType()
{
	
System.out.println("two types of sim");

}
}

public class SingleLevelInheritance extends Ebay  {
	static void EntermobileNumber () {
		System.out.println("Mobile number is 10 digit");
	}
	
	public static void main(String[] args) {

		EntermobileNumber ();
		
		 SingleLevelInheritance d1 = new SingleLevelInheritance ();
		 d1.simType();
		d1.EntermobileNumber();
		
		
	}

}
