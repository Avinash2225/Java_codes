package Day10;

public class NestedIfCondition {

	public static void main(String[] args) {
char gen = 'M';

int age =88;

if (gen == 'F') {
	System.out.println("Travelling is free");
	
  } else {
 if (gen=='M' && age <= 12) {
	System.out.println("Ticket is half");
}else if(gen == 'M' && age <=59 ) {
	
	System.out.println("Price of Ticket is full");
}else if (gen == 'M' && age>=59) {
	System.out.println("Ticket Price on the behalf of senior citizen");
} else {
	System.out.println("invalid gender");
}
	}

}
	
}
