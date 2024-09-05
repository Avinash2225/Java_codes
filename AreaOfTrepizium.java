package Day12;

import java.util.Scanner;

public class AreaOfTrepizium {
public static void main(String []args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the value side a");
	double a = Sc.nextDouble();
	System.out.println("Enter the value of the side b");
	double b = Sc.nextDouble();
	
	System.out.println("Enter the value of the height");
	double h = Sc.nextDouble();

	double	Area = 1/2*(a+b)*h;
	
System.out.println("Area of the trepezium:"+ Area);

}
}
