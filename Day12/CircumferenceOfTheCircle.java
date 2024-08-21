package Day12;

import java.util.Scanner;

public class CircumferenceOfTheCircle {

	public static void main(String[] args) {

			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter the value of the pi");
			double pi = Sc.nextDouble();
			System.out.println("Enter the value of the radious");
			double r = Sc.nextDouble();
			
		double	Circumference = 2*pi*r;
			
		System.out.println("Area Of the rectangle:"+ Circumference);

	}

}
