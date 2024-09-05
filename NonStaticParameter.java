package Day7;

public class NonStaticParameter {

	   void add() {
		   System.out.println("3");
		  
	   }
		void add(int a) {
			
			System.out.println("4");
		}
		void add (String c) {
			 
			System.out.println("5");
		}
	 void add  (String a, int d){
		System.out.println("6");
		
	}
				
	public static void main(String[] args) {
NonStaticParameter nt = new NonStaticParameter();
nt.add();
nt.add(6);
nt.add("aster");
nt.add("bmw", 6);
		
		
	}

}
