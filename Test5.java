package classtest4;

public class Test5 {

	public static void main(String[] args) {
		
		int x = 0,y = 0,z = 0;
		
		x = (++x + y--)*z++;
		
		System.out.println(x);
		
		/*System.out.println(z); 1
		
		System.out.println(y); -1
*/
	}

}
 /*Output : 0*/