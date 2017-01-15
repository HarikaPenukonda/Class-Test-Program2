package classtest4;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		x = 10;
		if(x==10)
		{
			int y = 20;
			System.out.println("x and y :" +x+ " "+y); //x and y :10 20

		}
		
		//y = 100; //Compilation error as y is the local variable it cannot be declared outside the loop
		
		//System.out.println("x and y :" +x+ " "+y);

	}

}
