package Day12;

import java.util.Scanner;

public class AreaOfTheTriangle {

	public static void main(String[] args) {


			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter the Base of the triangle");
			double b = Sc.nextDouble();
			System.out.println("Enter the height of the triangle");
			double h = Sc.nextDouble();
			
		double	Area = (b*h)/2;
			
		System.out.println("Area Of the Triangle:"+ Area);
		}

	}

		
		
