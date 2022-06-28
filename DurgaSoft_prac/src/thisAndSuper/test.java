package thisAndSuper;

public class test {
	
	/*
	 * here we are declaring the variable in the super object which is having the value 100
	 * and in the child class are are declaring the value of the same variable as 30 
	 * in the 1 method we are using the super and this keyword and accessing the values 
	*/
	
	int x=100;
	

	
public static void main(String args[]) {
	sample s=new sample();
	s.m1();
}
	
}

class sample extends test {
	int x=30;
	
	
	public void m1() {
		System.out.println(super.x);
		System.out.println(this.x);
	}
	
}
