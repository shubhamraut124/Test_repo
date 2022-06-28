package Exception_prac;

import java.io.IOException;

public class Test_exception {

	public static void main(String args[]) {
		
		Exception_prac e=new sample1();
		Exception_prac e12=new Exception_prac();
		
		try {
			e.m1();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	try {
		e12.m1();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	e.m2();
	
	}
	
}
