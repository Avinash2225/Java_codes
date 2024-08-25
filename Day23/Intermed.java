 package Day23;
interface Grandparent{
	void method1();
	void method2();
	
	
}
abstract class Parent_class  implements Grandparent   { // parents needs to be abstarct
	static void method3 () {
		
	}
	void method4() {
	                                    // which one of these you are going to expose in the market only grandparent
	
}

public class Intermed extends Parent_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_class n1 = new Parent_class();
		n1.method1();
	}

}

@Override
public void method1() {
	// TODO Auto-generated method stub
	
}
@Override
public void method2() {
	// TODO Auto-generated method stub
	
}
}