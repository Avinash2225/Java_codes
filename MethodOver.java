package Day15;

class copy {
	void Copy (int a, int b) {
		 a= 34;
		 b= 45;
		int sum = a+b;
		System.out.println(sum);
	}
}

public class MethodOver extends copy {
	void Copy (int c , int d) {
int sum1 = c-d;
		System.out.println(sum1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOver N1= new MethodOver ();
		N1.Copy(45, 47);
	}

}
