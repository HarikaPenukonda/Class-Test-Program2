package classtest4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {

	public static void main(String... a) {
	
		Collection<Integer> Collection = new HashSet<Integer>();
		
		Collection.add(3);
		Collection.add(1);
		Collection.add(2);
		
		Set<Integer> treeSet = new TreeSet<Integer>(Collection);
		System.out.println(treeSet);
		

	}

}

/*Output : [1, 2, 3]
 * TreeMap sorts the values*/


