package languageFundament;

public class Varargs {

	
	public static void m1(int... x) {
		System.out.println("variable argument method "+x.length );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method");
System.out.println("calling the variable argumet method");

		
		m1();
		m1(10);
		m1(100,10,1);
	}

}
