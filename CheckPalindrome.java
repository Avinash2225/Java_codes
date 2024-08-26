package Day2;

public class CheckPalindrome {

	public static void main(String[] args) {

		int number = 786;
int rev = 0;
int org_num = number;
while (number !=0) {
	rev = rev*10 + number%10;

	number = number/10;
}
System.out.println("Rev of the number is;" + rev);

	if  (org_num == rev) {
		System.out.println("number is palindrome");
		}
	else {
		System.out.println("Number is not a palindrome");
		
	}
}
}