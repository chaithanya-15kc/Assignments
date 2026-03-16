package Assignments_week1;

public class ArithmaticOperations {

	static void add() {
		int x= 20;
		int y= 30;
		int z= x+y;
		System.out.println("Addition of 2 numbers - "+ z);
	}
	static void sub() {
		int a = 50;
		int b = 20;
		int c = a-b;
		System.out.println("Subtraction of 2 numbers - "+ c);
	}
	static void mul() {
		int a = 15;
		int b = 2;
		int c = a*b;
		System.out.println("mutiplication of 2 numbers - "+ c);
	}
	static void div() {
		int a = 45;
		int b = 3;
		int c = a/b;
		System.out.println("Division of 2 numbers - "+ c);
	}
	static void mod() {
		int a = 52;
		int b = 3;
		int c = a%b;
		System.out.println("Modulus of 2 numbers - "+ c);
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		add();
		sub();
		mul();
		div();
		mod();
	}

}
