package Constructure;

public class Constr {

	Constr(){
		System.out.println("this is google");
	}
	Constr(int a){
		System.out.println("this is Meta");
	}
	
	Constr(int b , int c){
		System.out.println("this is linkdin");
	}
	Constr(int c, int d, int e){
		System.out.println("this is snapchat");
	}
	
	
	public static void main(String[] args) {
new Constr();
new Constr(3);
new Constr(21, 23);
new Constr(34, 56);
	}

}
