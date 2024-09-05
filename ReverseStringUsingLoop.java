package Day17;

public class ReverseStringUsingLoop {

	public static void main(String[] args) {

		String s = "MANISH";
		//int l = s.length();
		String rev = "";
		for(int i=5;  i>=0; i--) {
			 rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);
		
		
		
	}

}
