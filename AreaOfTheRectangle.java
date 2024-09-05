package Day12;

import java.util.Scanner;

public class AreaOfTheRectangle {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lenght of the rectangle");
		double l = Sc.nextDouble();
		System.out.println("Enter the breadth of the triangle");
		double b = Sc.nextDouble();
		
	double	Area = l*b;
		
	System.out.println("Area Of the rectangle:"+ Area);
		
	}

}
