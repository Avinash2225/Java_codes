package Day21;

import java.util.Arrays;

// in string concepts there is no sorting

public class StringMethods {

	public static void main(String[] args) {
String s= "AVINASH KUMAR YADAV";
String s1= "AVINASH KUMAR YADAV";
String s2= "AVINASH KUMAR YADAV";

System.out.println(s.replace("A", "G"));  // 
System.out.println(s1.replaceAll("[A-Z]", "a"));  // replace all
System.out.println(s2.replace(" ", ""));  // space
 System.out.println(s.contains("YADAv"));   // contains

//System.out.println(s.rep)		
		
	String name [] = s.split(" ");	// split single
		System.out.println(Arrays.toString(name));
		
		String name1 [] = s.split(" " ,2);	 // split two times 
		System.out.println(Arrays.toString(name1));
		
		System.out.println(s1.repeat(5));   // repeat
	    System.out.println(s1.endsWith("V"));;;  // false
	}

}
