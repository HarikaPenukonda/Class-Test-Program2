package classtest4;

public class Question4 {
	
	
		public static void method1(Exception e)
		{
			System.out.println("Exception");
		}
		public static void method1(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		public static void method1(Object s)
		{
			System.out.println("Object");
		}
		public static void main(String a[])
		{
			method1(null);
		}
		
		/*Output is Arithemetic exception
		 * as the child is given the first preference
		 * in the case of exception and object the exception is given the first preference*/


}
