package abstract_prac;

public abstract  class abstract_prac {

	/*
	 *both types of methods can be declare inside the abstract class ie. with body and without body
	 *--when you declare the abstract class you cant instantiated the class you have to extend it 
	 *--why we cant create the object of the abstract class ?
	 *-- though methods inside the abstract class may not have the implementation so 1st thing we have to provide the implementation for the class
	 *   
	 */
	
	public abstract void m1();
	public void m2() {
		System.out.println("declare method inside the abstrct class and accesing it form the other class");
	}
	
	
	public static void m21() {
		System.out.println("declaring method with body");
	}
	
	
	/*
	 * public static void main(String args[]) {
	 * System.out.println("declaring the amin method"); }
	 */
	
	
	
	/*
	 * abstract_prac c= new abstract_prac();
	 *
	 * one cant instantiate the abstarct class u have to extend it and implement in other class
	 * ======
	 */
			 
			 
	//Abstract method 
	public   abstract  String   test(); 
	
}
