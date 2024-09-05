package Day19;

import java.util.Arrays;

public class ArrayCopy {
  public static void main(String[] args) {

	double ESalary []=  new double [3];
	ESalary [0] =  7135.25;
    ESalary [1] =  8154.36;
	ESalary [2]  =  5478.25;
	
	double MSalary [] = new double [3];
	for(int i=0; i<ESalary.length; i++) {
		MSalary[i] = ESalary[i];
	}
	
	System.out.println("old salary is:  " );
	System.out.println(Arrays.toString(ESalary));
	System.out.println("new salary is:  " );
	System.out.println(Arrays.toString(MSalary));
		
				
		
		
		
		
		
		
	}

}
