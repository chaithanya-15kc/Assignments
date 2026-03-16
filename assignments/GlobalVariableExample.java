package Assignments_week1;

public class GlobalVariableExample {
	//Global  variable
	static int a=10;
	static int b=50;
	
	static void add() {
		a=100;
		b=200;
		int c= a+b;
		System.out.println("Addition of 2 numbers - "+ c);
	}
	static void sub() {
		int c = a-b;
		System.out.println("Subtraction of 2 numbers - "+ c);
	}
	static void mul() {
		int c = a*b;
		System.out.println("mutiplication of 2 numbers - "+ c);
	}
	static void div() {
		int c = a/b;
		System.out.println("Division of 2 numbers - "+ c);
	}
	static void mod() {
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
