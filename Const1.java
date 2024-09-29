package constructure;

public class Const1 {

 Const1() {
	 System.out.println("this is the constructure1");
 }
	
 Const1(int a) {
	 this();
	 System.out.println("this is the constructure2");
 }
	
	
 Const1(int a , int b) {
	 this(3);
	 System.out.println("this is the constructure3");
 }
	
	
	public static void main(String[] args) {
 Const1 c1 =new Const1();
Const1 c2 = new Const1(4);
new Const1(2,6);
	}

}
