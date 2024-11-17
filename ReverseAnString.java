package day4;

//Approach1 
/*public class ReverseAnString {
	public static void main(String[] args) {
String S = "Welcome to the deoria railway station";
String rev = " ";
for (int i = S.length()-1; i>=0; i--) {
	System.out.println(S.charAt(i));

		rev = rev +S.charAt(i);
	}
System.out.println("Reverse of string:" + rev);

	}

} */

//  Approach 2

public class ReverseAnString {
	public static void main(String[] args) {
String S = "Refrigerator";
String rev = " ";
char a[] = S.toCharArray();
for (int i = S.length()-1; i>=0; i--) {
	System.out.println(S.charAt(i));

		rev = rev + a[i];
	}
System.out.println("Reverse of string:" + rev);

	}

}