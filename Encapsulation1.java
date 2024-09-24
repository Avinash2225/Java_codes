package Day1;

public class Encapsulation1 {
// encapsulation is also called data hiding
// how to implement encapsulation
// private data variables so that these variables can not accessed directly from outside of the class
		private int ssn;
private String empName;
private int empAge;

public static void main(String[] args) {

	Encapsulation1 e1 = new Encapsulation1();
	e1.setempName("Avinash");
e1.setempAge(27);
e1.setssn(26429075);

System.out.println("employee name is : "+ e1.getempName());
System.out.println("employee name is : "+ e1.getempAge());
System.out.println("employee name is : "+ e1.getssn());

// getter and setter methods to set and get the values of the fields
}
	public int getssn() {
		return ssn;
	}
	public void setssn(int ssn) {
		this.ssn = ssn;
	
	}
		
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
		
		public int getempAge() {
			return empAge;
		}
		public void setempAge(int empAge) {
			this.empAge = empAge;
		
		}
	}
		
	  
	