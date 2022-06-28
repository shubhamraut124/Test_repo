package DataHiding;

public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking the construcor");
		
		Sample1 d=new Sample1();
		d.setName("shubham");
		System.out.println(d.getName());
		
		
		/*
		 * //Sample1 d1=new Sample1("kalpana",50,"Alephata"); only with getters and
		 * setters are usefull for accessing the private avriables
		 * 
		 * //System.out.println(d1.getname());
		 * 
		 * in this scenarios the name variable is declared as private and we are trying to access the variable from outside the class 
		 * #test_1 using the getter and setter method
		 */		
		
	}

}
