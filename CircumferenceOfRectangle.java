package Day12;

import java.util.Scanner;

public class CircumferenceOfRectangle {

	public static void main(String[] args) {
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter the value side a");
			double a = Sc.nextDouble();
			System.out.println("Enter the value of the side b");
			double b = Sc.nextDouble();
			
		
			double	Circumference = 2*(a+b);
			
		System.out.println("Circumference of the rectangle:"+ Circumference);
	}

}
