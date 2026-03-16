package Assignments_week1;

public class NANDOperator {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int age = 30;
		boolean city = false;
		
		//NOR Operator
		if(!(age<=10 || city==true)) {
			System.out.println("NOR condition");
		}else {
			System.out.println("condition is false");
		}
		System.out.println("outside condition");
	}

}
