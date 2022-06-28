package staticControlFlow;

/*
 * here in this program every element declared is static so finding the execution flow is important 
 * 
 * 1)identification of the static members from top to bottom  

*/
public class StaticControlFlow {

	static int a=10;
	
	static {
		m1();
		
		System.out.println("test");
	}
	
	public static void main(String args[]) {
		m1();
		System.out.println("main method");
		
	}
	
	public static void m1() {
		System.out.println(j);
	}
	static 	{
		System.out.println("static block number 2");
	}
	static int j=20;
}
