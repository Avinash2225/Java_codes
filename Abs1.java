package abstraction;

abstract class Abs1 {
	abstract void add(); 
		
	abstract void sub();
}
	 class Amazon extends Abs1 {
	 
		@Override
		void add() {
			System.out.println("this is addition method");
		}
		@Override
		void sub() {
	System.out.println("this is substraction");		
		}
	
	 
	public static void main(String[] args) {
		
	Amazon a1 = new Amazon();
a1.add();
a1.sub();
	
	
}
}

