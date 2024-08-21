package Day12;

import java.util.Scanner;

public class CircumferenceOfTriangle {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value side a");
		double a = Sc.nextDouble();
		System.out.println("Enter the value of the side b");
		double b = Sc.nextDouble();
		System.out.println("Enter the value of the side c");
		double c = Sc.nextDouble();
	
		double	Circumference = a+b+c;
		
	System.out.println("Circumference of the triangle:"+ Circumference);
	}

}
