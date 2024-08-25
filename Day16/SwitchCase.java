package Day16;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner S1= new Scanner (System.in);
		
	System.out.println("Enter press 1 for Chrome");
	System.out.println("Enter press 2 for firefox");
	System.out.println("Enter press 3 for Edge");
	System.out.println("Enter press 4 for safari");
int browser_selection = S1.nextInt();
		switch (browser_selection) {
		case 1: System.out.println("Chrome browser launch");
		break;
		case 2: System.out.println("firefox browser launch");
		break;
		case 3: System.out.println("Edge browser launch");
		break;
		case 4: System.out.println("Safari browser launch");
		break;
		default:
			System.out.println("your selection is wrong");
		
	}

	}
}
