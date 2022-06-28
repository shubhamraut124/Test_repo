package Exception_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * In this program if we didnt declare the throws ky word compiler will give unchecked exception
 * for this either throws keyword or try catch 
 * 
 * Atithimatic exception is unchecked exception it wont be checked by compiler at run time  
*/

public class ChkedUnchkedException {

	public static void main(String args []) throws FileNotFoundException 
	{
	PrintWriter pw=new PrintWriter("ab.txt");
	
	pw.print("hello");
	System.out.println(10/0);
	
		
	}
}
