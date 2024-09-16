package inheritance;

 class SingalLevel {

	static void Add() {
		System.out.println("this is single");
	}
	
 }
		public class Amazon extends SingalLevel {
		static void Add1() {
			
	System.out.println("this is second");		
		}
	
	public static void main(String[] args) {

		Amazon d1 = new Amazon ();
		d1.Add();
		d1.Add1();
	}
	
	}
