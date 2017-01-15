package classtest4;

public class Question1 {
	
	
		public static void method1(String s)
		{
			System.out.println("String");
		}
		public static void method1(Object s) 
		{
			System.out.println("Object");
		}
		

	

	public static void main(String[] args) {
		
		method1(null);

	}

}


/*If object and wrapper class is given preference is given to wrapper class
 * and string gets printed because object is the root to all other classes*/
