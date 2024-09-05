package Day7;

public class MethodOverloading {
 static  void add() {
	   System.out.println("1");
	  
   }
static	void add(int a) {
		
		System.out.println("2");
	}
static	void add (String c) {
		 
		System.out.println("3");
	}
static void add  (String a, int d){
	System.out.println("4");
	
}
	
	
	public static void main(String[] args) {

	add();
	add(233);
	add("Automation");
	add("Rest", 5);
	}

}
