package Day15;

public class Diamond {
Diamond(int a){
	System.out.println("Diamomd");
}

Diamond (float d){
	this(8);
		System.out.println("Graphite");
	}
	
		Diamond(){
			this(9.3f);
			System.out.println("Cable"); // if the constructure is parameterized that time when we call then only this constructure will call
		}                                // but if we want to call parameterizrd constructure then we need to write thiskeyword along with parameter
                                           // any constructure can never be combination of super calling statement and this calling statements
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
      new Diamond();
}
}
}