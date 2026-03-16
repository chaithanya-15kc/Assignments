package Assignments_week1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class CheckedException1 {
	/*Checked Exception is also called --->Compile time Exceptions 
	1. InterruptedExecption, 
	2. MalformedURLException, 
	3. FileNotFoundExeception
	
	//Interrupted Exception, MalformedURLException, FileNotFoundException  using throws keyword*/
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException, FileNotFoundException {
		URL ul= new URL("https://www.google.com");
		
		FileInputStream f1 = new FileInputStream("");
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	


	//Interrupted Exception using try,catch block
	/*public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
}
