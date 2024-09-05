package Day8;

public class GlobalVariable {
static double dr = 3.556;
  int no_of_days_leap_year= 366; // it can be static and non static global variable can have default value
 static int age;
// byte,short, int,long = 0 value for boolean = false value for string is null value is not defined for char datatype = Global
	void sun () {
		String a = "Avinash";  // local can not be static and non static local variable can not have default value
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		double salary; // decaleard do not have dafault value local variable    int  a int a =5 
	//	System.out.println(salary); // utilization 
		dr = 5.88;
		System.out.println(age);
GlobalVariable gr = new GlobalVariable();
System.out.println(gr.no_of_days_leap_year);
	}

}
