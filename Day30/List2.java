package Day30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1 = new ArrayList();  // never write class name as list and Array List
		
		l1.add(243);
		l1.add(235);
		l1.add(2343);
		l1.add(2322);
		l1.add(232);
		l1.add(231);
		l1.add(243);
		l1.add(253);
		l1.add(233);
		Collections.sort(l1);  // comes under class asending order sorting
	System.out.println(l1);
	}

}
