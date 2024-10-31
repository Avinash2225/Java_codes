package Day9;

public class UpperCaseLowercase2 {

	public static void main(String[] args) {

		String s = "Welcome to THE Agra";
		
		int lowercase=0;
		int uppercase=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z') {
				uppercase++;
			}
				else if(ch>='a' && ch<='z') {
					lowercase++;
				}
			}
		System.out.println("No of upper case is:"+ uppercase);
		
		System.out.println("No of lower case is:"+ lowercase);

		
		}
			
	}


