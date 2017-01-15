package classtest4;

public class Question3 {
	
	public static void method1(int i)
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
	
		method1(null);

	}

}

/*Output is String
 * when a wrapper class,primitive data type and object s declared
 * the wrapper class is given preference */
