package Assignments_week1;

public class StaticMethodCalling {

	static void S1() {
		System.out.println("Static Method1");
	}
	static void S2() {
		System.out.println("Static Method2");
	}
	
	public static void main(String[] args) {	
		System.out.println("Main Method");
		S1();
		S2();
	}

}
