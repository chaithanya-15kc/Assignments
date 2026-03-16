package Assignments_week1;

import java.util.InputMismatchException;
import java.util.Scanner;
//Exception Handling ---> for InputMismatchExeception
public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the age of student");
			int age1 = s1.nextInt();
			System.out.println("age is-->"+age1);
			s1.close();
			}
		catch(InputMismatchException e1) {
			System.out.println("handled the exception");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the age of student");
			int age1 = s1.nextInt();
			s1.close();
			System.out.println("age is-->"+age1);
		}
		
	}
	
}
