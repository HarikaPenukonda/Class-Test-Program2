package classtest4;

public class Question6 {

	public static void main(String[] args) {
		
			short s=0;
				int x=07;
				//int y=08; //the literal is out of range so Compilation error
				int z=123456;
				//s +=z; no compilation error
				//s = s+z; compilation error as high value is assigned to low value
				z +=s;
				//System.out.println(""+x+y+s);
				System.out.println(x+""+""+s+""+z);
			


	}

}


/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The literal 08 of type int is out of range 

	at classtest4.Question6.main(Question6.java:9)*/