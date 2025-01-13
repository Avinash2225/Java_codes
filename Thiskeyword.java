package constructure;

public class Thiskeyword {

	int x, y;
	
	Thiskeyword(int a, int b){
		// to differentiate between local variables and class variables we use this keyword
		this.x =x;
		this.y = y;
		
	}

	void Display(){
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {

		Thiskeyword th = new Thiskeyword(100,500);
		th.Display();
		
		
	}

}
