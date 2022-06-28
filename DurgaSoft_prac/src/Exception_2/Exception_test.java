package Exception_2;

public class Exception_test {
	
	public static void main (String  args[]) {
		doStuff();
		System.out.println("after exception codes");
	
	}

	
	public  static void doStuff() {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("inside dostuff method");
		doMoreStuff();
		
	}


	public static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("inside domore stuff");
		System.out.println(10/0);
	}
}
