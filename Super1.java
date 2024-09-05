package Day13;

public class Super1 {

Super1(){
	System.out.println("this is first");
	}
	
}
	
class Super2 extends Super1 {
	Super2(){
	System.out.println("this is second");
	}
}
	
	class Super3 extends Super2 {
		Super3(){
			super(); // we write here explicitely super but if we do not write then also it will call implicitely
		System.out.println("this is three");
		}
	}
	class Main {

	public static void main(String[] args) {
		
	new Super3();
		

	}

	}

	
