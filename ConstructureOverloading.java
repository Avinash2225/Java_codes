package Day7;

public class ConstructureOverloading {

	ConstructureOverloading (){
		System.out.println("overloading");
		
	}
	
	ConstructureOverloading (int a){
		System.out.println(6);
		
	}
	
	public static void main(String[] args) {

		new ConstructureOverloading ();
		new ConstructureOverloading (7);
		
		
	}

}
