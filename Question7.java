package classtest4;

public class Question7 {

	public static void main(String[] args) {
		method2();
	}
@SuppressWarnings("finally")
public static int method2()
	{
	try
	{
	System.out.println("TRY");
	int x=4/0;
	return 10; //return of the method
	}
	catch(Exception e)
	{
	System.out.println("CATCH");
	}
	finally
	{
	System.out.println("FINALLY");	
	return 88;
	}
}

/*
OUTPUT IS:
 TRY
CATCH
FINALLY
*/


	}


