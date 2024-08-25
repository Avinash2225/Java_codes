package Day24;

public class Class2 {

	public static void main(String[] args) {

		Class1 c1 = new Class1 ();
		Class1.add();
		c1.sub();          // private method we can not call from one class to another class in the same package 
		c1.divide();
		
		
	}

}
