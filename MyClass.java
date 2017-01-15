package classtest4;

import java.util.Arrays;
import java.util.Comparator;

public class MyClass {

	public static void main(String[] args) {
		
		String [] ar = {"c","d","b","a","e"};
		InnerClass in = new InnerClass();
		Arrays.sort(ar,in);
		for(String str : ar)
			System.out.println(str + "");
		System.out.println(Arrays.binarySearch(ar,"b"));

	}
	
	static class InnerClass implements Comparator<String>
	{
		public int compare(String s1,String s2)
		{
			return s2.compareTo(s1);
		}
	}
/*Output : e
d
c
b
a
-1
*/
}
