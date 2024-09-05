package Day16;

import java.util.Scanner;

public class SplitTheStringWord {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
String s =new String("MANISH KUMAR TIWARI");
 String a= s.substring(0, 6);
  String b= s.substring(7, 12);
String c= s.substring(13);
System.out.println(a);
System.out.println(b);
System.out.println(c);
Sc.close();

	}

}
