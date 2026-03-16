package Assignments_week1;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		//Area of Square
		Scanner as = new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = as.nextInt();
		System.out.println("Area of Square is -->");
		int asqu = a*a; //Area of Square=a^2;
		System.out.println(asqu);
		
		//Circumference of Square
		System.out.println("Circumferance of Square is -->");
		int cirsqu = 4*a;
		System.out.println(cirsqu);
		
		as.close();
	}

}
