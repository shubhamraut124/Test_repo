package thisAndSuper;

 class test1 {
	
	private static final int i = 0;

	test1(){
		this(i);
		System.out.println("1st constructor");
		System.out.println(i);
	}

	test1(int i){
		System.out.println("2nd constructor");
		System.out.println(i);
	}
	
	test1(double g){
	//	super();
		System.out.println();
		System.out.println("3rd constructor");
	}
	
	public static void main(String args[]) {
		/*
		 * test1 t=new test1(); test1 t1=new test1(2); test1 s1=new test1();
		 */
		 test1 ty= new test1(); 
		//sample13 s=new sample13(); 
		
	}

}


class sample13  extends test1{
	sample13 (){
//super();
	}
	
	

	
}
