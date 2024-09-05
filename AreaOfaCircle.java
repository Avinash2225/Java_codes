package Day11;

import java.util.Scanner;

public class AreaOfaCircle {
    
	public static void main(String[] args) {

		Scanner T1 = new Scanner(System.in);
		
		System.out.println("Enter the value of the pi");
		double pi = T1.nextDouble();
		
		System.out.println("Enter the value of the radious");
		int r = T1.nextInt();	
		
	double 	Areaofthecircle = pi*(r*r);
		
		System.out.println("Area of the circle:"+ Areaofthecircle);
		
		
	}

}
