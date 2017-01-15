package classtest4;

public class Test2 {
	
	static int x = 10;

	public static void main(String[] args) {
		
		Test2 test = new Test2();
		
		Test2 test1 = new Test2();
		
		test.x +=1;
		
		System.out.println(test.x + test1.x);
		

	}

}

/*Output : 22*/