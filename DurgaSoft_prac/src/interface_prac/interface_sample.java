	package interface_prac;

public interface interface_sample {
	
	/*
	 Interface Methods cannot be final, strictfp or native. because we have to implement the body outside out the interface and have to access them
	 
	 */
	public void m1();
	
	//public void m2() {
	//} cant declare the body inside the interface 
	
	public abstract void m2();
	void m4();	//no need to use keywords as implicitly all methods are public and abstract
	
	//========================================================
	/*VARIABLES INSIDE THE INTERFACE
	ALL  variables inside the interface are by defaultly public static final only one copy of the varible will be created nwith final
	no instance variables are allowed
	*/
	public static final String a="s";
	String a1="shubham";//
	
	 	


}


