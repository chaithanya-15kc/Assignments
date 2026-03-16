package Assignments_week1;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// Area of Rectangle
		Scanner rc = new Scanner(System.in);
		System.out.println("Enter the length value");
		int length = rc.nextInt();
		System.out.println("Enter the width value");
		int width = rc.nextInt();
		
		System.out.println("Area of Rectangle is--->");
		int arec = length*width;
		System.out.println(arec);
		
		System.out.println("Circumferance of the Rectangle is -->");
		int cirrec = 2*(length+width);
		System.out.println(cirrec);
		
		rc.close();
	}

}
