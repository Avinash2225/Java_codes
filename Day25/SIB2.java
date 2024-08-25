package Day25;

public class SIB2 {
static {
	System.out.println("this is SIB2");
}
SIB2 ()   
      {
	System.out.println("constructure");
      }
SIB2 (int a)   
{
System.out.println("3");
}
    {
    	System.out.println("IIB execute");
    }
    {
    	System.out.println("IIB execute");
    }
	public static void main(String[] args) {
      System.out.println("this is the main method");           // order of execution 1, SIB, then main method, then IIB and then Constructor
                                                              // order of execution in the construct and IIB 
      
      new SIB2();
    
	}

}
