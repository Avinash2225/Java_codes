package Day18;

public class StringReverse {

	public static void main(String[] args) {

		String input = "Avin";
		
		String output = "";
		for(int i=3; i>=0; i--) {
			char c1 =  input.charAt(i);            // i= 3
			                                       //output= +l
		output = output +c1;                      // i=2     
		}                                         // output = l+u = lu
		System.out.println("output of the strimg:"+ output) ; // why we write it here because it will combine but if we write above then its answer will be
		                                                      // be come one by one
	}

}
