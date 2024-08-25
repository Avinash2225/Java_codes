package Day16;

public class This_keyword {

	int age;
	String name;
	double salary;
	void details(int age, String name, double salary) {
this.age= age;// by using this local age is assigned to global variable;
this.name= name;
this.salary= salary;
	
	}
public static void main(String[] args) {

		This_keyword t1= new This_keyword();
		t1.details(45, "Avinash", 70000.677);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);

		

	}

}
