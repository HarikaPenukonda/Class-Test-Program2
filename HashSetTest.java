package classtest4;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		Set hashSet = new HashSet();
		
		hashSet.add("10");
		hashSet.add(12);
		hashSet.add(null);
		System.out.println(hashSet);

	}

}

/*Output [null, 1, 1]
 * no sorting
 * hashSet.add("1");
		hashSet.add(1);
		hashSet.add(null);
		System.out.println(hashSet)
		
		hashSet.add("11");
		hashSet.add(1);
		hashSet.add(null);
		System.out.println(hashSet)
		Output is [11, null, 1];
		
		hashSet.add("11");
		hashSet.add(12);
		hashSet.add(null);
		System.out.println(hashSet);
		
		[11, null, 12]
		
		

*/
