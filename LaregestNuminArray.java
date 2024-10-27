package day2;

public class LaregestNuminArray {

	public static void main(String[] args) {

		int num [] = {4,7,21,34,1457,89};
		//int lar =0;
		int lar = num[0];
		
		for(int i=0; i<num.length; i++) {
			if(lar<num[i] ) {
				lar = num[i];
			}
		}
		System.out.println("largest num is:" + lar);
		
		
		
		
	}

}
