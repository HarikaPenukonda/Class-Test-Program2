package classtest4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
	
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		
		System.out.println();
		arrayList.add(1,"d");
		System.out.println(arrayList);
		

	}

}

/*Output : [a, d, b, c]
 * Here  d is inserted in the place of b i.e 1 and b is pushed */
