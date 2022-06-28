package ConstructorPrac;

public class ReturnTYpeConstructor {

	/*
	 * 1) in this program we declared the constructor with the return type of void but compiler will treat that constructor as method
	 * 2) in program the class name and the method name can be same.
	 *  
	*/
	
	void ReturnTYpeConstructor() {
		System.out.println("method not a constructor");
		
	}
	public static void main(String args[]) {
		ReturnTYpeConstructor r=new ReturnTYpeConstructor();
		r.ReturnTYpeConstructor();
		
	}
	
}
