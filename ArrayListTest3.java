package classtest4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("a");
		arrayList.add("a");
		System.out.println("Test1");
		arrayList.clear();
		System.out.println("Test2");
		arrayList.add("b");
		arrayList.add("b");
		arrayList.add("b");
		
		System.out.println(arrayList.size());
		
		

	}

}
/*Output : Test1
Test2
2
*/