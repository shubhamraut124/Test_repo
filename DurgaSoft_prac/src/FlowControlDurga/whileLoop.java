package FlowControlDurga;

public class whileLoop {

	public static void main (String args[]) {
		CallOtheraClass w= new CallOtheraClass();
		
		
		
		w.testWhile();
		w.test();
		
	}}

class CallOtheraClass{
	int x=1;
	
	//standard syntax of the while loop 
	
	public void testWhile() {
		while (x<=10) {
			x++;
			System.out.println("testing the while loop");
		}
	}
	
	public void test() {
	
		// new syntax for the while 
		
		while (true)
			System.out.println("Ho");
		
	}
	
/*	
 * 
 * here in this while loop after the end of the loop if we write the code it will be unreachable code syntax error
 * 
 * 
	public void test1() {
		while (true) {
			System.out.println("hi");
		}
		System.out.println("check");		line where you will get the syntax error
		
	}
	
	
	
	*/
	
	
	/*
	 * as declaring the vaiables as final cndition will be always true and for compiler 
	 * even after putting the break values wont change the values #unrechable code syntax error
	 *
	 * 
	 * 
	 * public void test2() {
	 *  	final int a=10,b=20; 
	 * 		 while (a>b) {
	 * 			System.out.println("hi"); 
	 * 		 }
	 *  	System.out.println("hello"); 
	 *  }
	 */
	
}
