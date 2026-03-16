package Assignments_week1;

public class MultiLevelInheritanceC2 extends MultiLevelInheritanceC1{
	static void Login() {
		System.out.println("Step2-->Logging in");
	}
	
	public static void main(String[] args) {
		launchbrowser();
		Login();
		logout();
	}

}
