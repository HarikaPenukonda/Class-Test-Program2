package classtest4;

public class Question2 {
	

	public static void method1(Integer i)
	{
		System.out.println("integer");
	}
	public static void method1(String s)
	{
		System.out.println("string");
	}
	public static void method1(Object s) 
	{
		System.out.println("Object");
	}
	

	public static void main(String[] args) {
	
		//method1(null);

	}

}

/*When two wrapper classes are declared it gives compilation error as it shows abiguity */


/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method method1(Integer) is ambiguous for the type Question2

	at classtest4.Question2.main(Question2.java:22)
*/

