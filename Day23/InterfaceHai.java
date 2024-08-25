package Day23;

interface Amazon {
	void login ();                             //Ab can not be static because static method can not override
	void logout();
	
}
public class  InterfaceHai  implements Amazon {  // remain with the organization
	
	public static void main (String args []) {    // from here to line no 27
				
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

}

//   Abstract class Am as well as CM so it will show some logic to the  third party
// cm we are exposing things
// interface only have abstract method hide 100% the implementation
// 