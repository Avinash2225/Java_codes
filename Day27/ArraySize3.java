package Day27;

import java.util.InputMismatchException;
// import java.util.ex   if you want to use exception you can use from java.util.ex
// it is only for safety reason
// find out broken links in website in selenium we see this example
public class ArraySize3 {

	public static void main(String[] args) {
 int num [] = new int [3];
 
 num[0] = 34;
 num[1] = 67;
 num[2] = 44;
// num[3] = 55;
  try {
	  
	  num[3] = 55;
  }
  catch (ArrayIndexOutOfBoundsException k2)
  {
	  System.out.println("handled to 1");
  }
  catch (InputMismatchException k3)
  {
	  System.out.println("handled to 2");

  }
 
  System.out.println ("the num are");
  
	}

}
