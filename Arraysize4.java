package exceptionsarray;

public class Arraysize4 {

	public static void main(String[] args) {

		int arr [] = {1,2,3,4,5,8};
		try {
		for(int i=0; i<7; i++) {
			System.out.println(arr[i]);
		}
		
		
	}catch (Exception e1) {
		System.out.println("please enter nummber inside length");
	}

}
}