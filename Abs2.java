package abstraction;

abstract class Abs2 {

abstract void add1 ();
abstract void sub1 ();
}
class Flipkart extends Abs2 {

	@Override
	void add1() {
System.out.println("this is best shop");		
	}

	@Override
	void sub1() {
System.out.println("This is new mobile");		
	}
	

	public static void main(String[] args) {

		Flipkart f1 = new Flipkart();
		
		f1.add1();
		f1.sub1();
		
	}
	}
