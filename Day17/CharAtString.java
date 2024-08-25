package Day17;

public class CharAtString {

	public static void main(String[] args) {
	
		String name = "Avinash";
			//System.out.println(name.charAt(6)); // if you print this way then you have to print multiple times which consumes many lines
		
		//for(int i=6; i>=0; i--) // printing this in the reverse order
			for(int i=0; i<7; i++) {

			char a1= name.charAt(i);
			System.out.print(a1);
		}
	}

}

//  difference between System.out.println print something and take me to next line
// System.out.print print and do not take into next line
// String index out of bound exception when size is only 7 then you can not call it for 8 it will give you exception
