package Assignments_week1;

//Exception Handling ---> for Arithmetic Exception, StringIndexOutOfBoundsException
public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
			
			//int c = 1/0; //c=a/b;
			String a1="ram";
			int out = a1.charAt(5);
			System.out.println(out);
			}
		catch(ArithmeticException e1) {
			System.out.println("Handled the Exception1");
		}
		catch(StringIndexOutOfBoundsException e2) {
			System.out.println("Handled the Exception2");
		}
		catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("Handled the Exception3");
		}
		
	}
	
}
