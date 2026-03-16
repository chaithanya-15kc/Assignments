package Assignments_week1;

import java.util.InputMismatchException;
import java.util.Scanner;

//Finally Block Execution with try, catch block
public class FinallyBlockExecution {

	public static void main(String[] args) {
		try {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the age of 1st student");
			int age1 = s1.nextInt();
			System.out.println("age is-->"+age1);
			s1.close();
			}
		catch(InputMismatchException e1) {
			System.out.println("handled the exception");
		}
		finally {
			System.out.println("closing the database connection");
		}

	}

}
