package Day3;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
//String S = "avinash@gmail.com";
//String a[] = S.split("@");
//System.out.println(Arrays.toString(a));
//System.out.println(a[0]);
//System.out.println(a[1]);
	
	
	String amount = "$15, 20, 40";
	System.out.println(amount.replace("$","  "));
	System.out.println (amount.replace ("$","  ").replace("," ,""));

	String S = "abc,123@xyz";
	String arr1[] = S.split(",");
	System.out.println(Arrays.toString(arr1));
	
	
	String arr2[] = arr1[1].split("@");
	System.out.println(Arrays.toString(arr2));
	System.out.println(arr1[0]);
	System.out.println(arr2[0]);
	System.out.println(arr2[1]);

	// Based on the space you can find out
	
String	S1 = "abc   123";
String arr[] = S1.split("      ");
System.out.println(Arrays.toString(arr));
		
	}

}



















