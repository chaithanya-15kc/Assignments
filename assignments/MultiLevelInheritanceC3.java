package Assignments_week1;

public class MultiLevelInheritanceC3 extends MultiLevelInheritanceC2 {
	
	static void HomePage() {
		System.out.println("Step3-->Home Page");
	}
	
	static void InvetoryPage() {
		System.out.println("Step4-->Inventory Page");
	}
	static void PaymentPage() {
		System.out.println("Step5-->Payment Page");
	}

	public static void main(String[] args) {
		launchbrowser();
		Login();
		HomePage();
		InvetoryPage();
		PaymentPage();
		logout();
	}
}
