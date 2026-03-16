package Assignments_week1;

import java.util.Scanner;

public class AreaOfCircleHumanInput {

	public static void main(String[] args) {
		// Area of Circle
		//double r=25;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the radius value");
		double r1 = r.nextDouble();
		System.out.println("Area of the Circle is -->");
		double area =Math.PI * r1 * r1;
		System.out.println(area);
		System.out.println("Circumferance of the Circle is -->");
		double cir =2*Math.PI *r1;
		System.out.println(cir);
		
		r.close();

	}

}
