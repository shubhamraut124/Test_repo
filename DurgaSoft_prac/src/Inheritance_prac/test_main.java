package Inheritance_prac;

public class test_main {
	
	public static void main(String srgs[]) {
		
		
		//creating the objects
		
		iheritance_1 k=new iheritance_1();
		sample2 s= new sample2();
		iheritance_1 tes= new sample2();
		
		//calling methods
		
		k.m1();
	//	k.m2(); // not able to find m2 inside the iheritance_1 class
		
		s.m1();  // create the object for sample and sample have both methods extends 
		s.m2();
		
		tes.m1();
	
		/*
		 * // tes.m2(); // create the object for sample and sample have both methods
		 * extends
		 * 
		 * 1) //iheritance_1 tes= new sample2(); //tes is the reference variable for the class inheritance and pointing to the object sample2
		 * 2) parent reference  used to hold child object
		 * 3) but using this reference we can call only parent methods we can't call child methods
		 * 4) this creating of reference is known as polymorphism 
		 * 
		 * ===
		 * muliple imheritance is not allowed in java
		 * 
		 */	
		}
	
}
