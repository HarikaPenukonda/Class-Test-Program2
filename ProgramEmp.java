package classtest4;

import java.util.HashMap;

public class ProgramEmp {

	public static void main(String[] args) {
		
		HashMap<Employee,String> hm = new HashMap<Employee,String>();
		
		hm.put(new Employee("a"),"emp1");
		hm.put(new Employee("b"),"emp2");
		hm.put(new Employee("a"),"emp1 OVERRIDDEN");
		
		System.out.println(hm.size());
		System.out.println(hm.get(new Employee("a")));
		

	}

}

/* Output 
 * 3
null*/
