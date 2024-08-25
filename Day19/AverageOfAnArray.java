package Day19;

public class AverageOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num []= new int [4];
    num[0] = 17;
    num[1]= 35;
    num[2] =81;
    num [3]= 42;
	double sum = 0;

    for(int i=0; i<num.length; i++) {
    	sum += num[i];
    }	
    	double average = sum/num.length;
    
    System.out.println("sum of the array is:" + sum);
    System.out.println("average of the array is:" + average);

	}

}
