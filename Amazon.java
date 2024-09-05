package Day15;
class Snapchat{
	Snapchat(int a , int b){
		System.out.println("snapchat");
	}
}
class Google extends Snapchat {
 Google (){
	 super(12,3);      //should be present only in first line
	 System.out.println("Google");
	//  super(12,3); it can not be present here always gives error
 }
}

public class Amazon extends Google {
Amazon(){
	//super(10);  //explicitely when parent class constructure is non parameterized
	//super calling is present when constructures are non parameterized
	System.out.println("Amazon");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new Amazon();
	}

}
