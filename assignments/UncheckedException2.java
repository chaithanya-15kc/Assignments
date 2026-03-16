package Assignments_week1;

public class UncheckedException2 {
	/*UnChecked Exception is also called --->Run time Exceptions
	1. InputMismatchException,
	2. ArithmaticExeception, 
	3. StringIndexOutOfBoundsException
	
	//StringIndexOutOfBoundsException */
	public static void main(String[] args) {
		//int a = 1/0;
		
		String a = "Chai";
		char out = a.charAt(5);
			
		System.out.println(out);

	}

}
