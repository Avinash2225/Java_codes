package Day26;

public class TryCatch {

	public static void main(String[] args) {
/* int a = b/c; // cab b comes from grand parent class 
  
               // can c comes from parent class yes answer of the question is possible
	*/
	try {
	int c = 1/0;
	
	 System.out.println(c);
	}
	 catch ( ArithmeticException a1) {
	System.out.println("Handled the exception");	
	
	
	}
	}
}
