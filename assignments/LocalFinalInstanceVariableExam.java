package Assignments_week1;

import ab62.GlobalVariable2;

public class LocalFinalInstanceVariableExam {
	static int a3=60; 
	final static double pi=3.14;
	int a2=200; //Instance variable(which is non static)
	static void l1() {
		int a1=100;//local variable
	//	a1=200;
		final double pi=3.14;//local final variable
		System.out.println("Local Variable -->"+a1);
		System.out.println("Local Final Variable -->"+pi);
		}

	public static void main(String[] args) {
		//System.out.println(l);//local variable cannot be access out side the method
		l1();
		System.out.println("Global Final Variable -->"+pi);//global final variable
		
		LocalFinalInstanceVariableExam In = new LocalFinalInstanceVariableExam();
		System.out.println("Instance Variable --->"+In.a2);
		In.a2=500;//instance variable updated value
		System.out.println("Instance Variable Updated value--->"+In.a2);
		System.out.println("Global Variable from different class and package--->"+GlobalVariable2.a);
		System.out.println("Global Variable from same class --->"+a3);
		GlobalVariable2.a=800;
		System.out.println("Global Variable from different class and package Updated value--->"+GlobalVariable2.a);
		System.out.println("Global Variable Updated value --->"+a3);
	}

}
