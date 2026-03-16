package Assignments_week1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		//Area of Triangle
		Scanner tr = new Scanner(System.in);
		System.out.println("Enter the Base value");
		int base = tr.nextInt();
		System.out.println("Enter the Height value");
		int height = tr.nextInt();
		
		System.out.println("Area of the Triangle is -->");
		double atri = 0.5*base*height;
		System.out.println(atri);
		
		
		System.out.println("Enter 'a' value");
		int a = tr.nextInt();
		System.out.println("Enter 'b' value");
		int b = tr.nextInt();
		System.out.println("Enter 'c' value");
		int c = tr.nextInt();
		
		System.out.println("Circumferance of the Triangle is -->");
		double ctri =a+b+c;
		System.out.println(ctri);
		
		tr.close();
	}

}
