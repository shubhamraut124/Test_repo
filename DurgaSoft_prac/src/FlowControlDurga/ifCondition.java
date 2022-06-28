package FlowControlDurga;

public class ifCondition {

	static  int x= 99; // global variable , made it static , 
	
	public void x1() {
		System.out.println(x);	// printing the variable in the method which is not static 
	}
}


class sample{  // declaring the class as default access modifier 
	
	static ifCondition shu=new ifCondition();	// creating the instance variable and creating the object #Static object?
	 
	public static void main (String args[]) {	// creating the main method 
		
		shu.x1();			// using the instance variable and accessing the method in other class
	}
}