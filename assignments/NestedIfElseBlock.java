package Assignments_week1;

public class NestedIfElseBlock {

	public static void main(String[] args) {
		int marks = 65; // You can change this value to test other cases

        if (marks >= 0 && marks <= 100) { // Valid marks check
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                if (marks >= 75) {
                    System.out.println("Grade: B+");
                } else {
                    System.out.println("Grade: B");
                }
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else if (marks >= 40) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F (Fail)");
            }
        } else {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        }
	}

}
