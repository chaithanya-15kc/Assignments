package Assignments_week1;

public class LogicalOperator {

	public static void main(String[] args) {
		/*Logical Operator &&, ||, !,NAND, NOR
		1. AND
		   true && true - true
		   true && false - false
		   false && true - false
		   false && false - false
		   
		 2. OR
		   true || true - true
		   true || false - true
		   false || true - true
		   false || false - false
		   
		 3. NOT
		 boolean = false;
		 if(!(boolean)){
		 	system.out.println("Condition is true!");
		 }
		 
		 3. NOR
		   true || true - false
		   true || false - false
		   false || true - false
		   false || false - TRUE
	
		if(){
	         o/p
		}
		
		OR
		
		*/
        int age=24;
        char gender='M';
        boolean metrocity=true;
        
        //AND 
        
        if(age>=24 && gender=='M')
        {
                System.out.println("AND Statemenet will execute");
        }
        
        //OR
        if(age>=20 || metrocity==true)
        {
                System.out.println("OR Statemenet will execute");
        }
        
        //NOT
        boolean bol = false;
        if(!(bol))
        {
                System.out.println("NOT Statemenet will execute");
        }
        
        //NOR 
        if(!(age>=32 || metrocity==false))
        {
                System.out.println("NOR Statemenet will execute");
        }
        
        //NAND 
        if(!(age>=24 && gender=='M'))
        {
                System.out.println("NAND Statemenet will execute");
        }
        
        System.out.println("Outside the block");
	}

}
