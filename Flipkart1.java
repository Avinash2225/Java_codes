package Day7;

public class Flipkart1 {

	Flipkart1(){
		
		System.out.println("This is first");
	}
Flipkart1(int a){
	this();
	System.out.println("This is second");

	}
	
Flipkart1(int b , int c){
	this('a');
	System.out.println("This is third");

}	
	public static void main(String[] args) {
new Flipkart1();
new Flipkart1(4);
new Flipkart1(5,4 );

	}

}
