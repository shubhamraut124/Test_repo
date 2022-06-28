package languageFundament;

public class mainMethod {
	public static void main (String args[])
	{
		System.out.println("hi");
		
	}
}

class test extends mainMethod{
	public static void main(String args[]) {					//this concept is not overriding this is known as method hiding 
		System.out.println("hello");
		
	}
}
