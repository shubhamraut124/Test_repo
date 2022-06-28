package LearnJava;

public class LearnPassingParameter {
	static LearnPassingParameter lp= new LearnPassingParameter();

	public static String temp() {
		String a="shubham";
		return a;

}
	public static String temp1() {
		String b="shubham";
		return b;

}	
	public static String temp2() {
		String c="raut";
		return c;

}
	
	public static void main(String arg[]) {
		String x= temp();
	
	String x1= temp1();
	String x2= temp2();
	
	if (x==x1) {
		System.out.println("entering in if block");
		
	}else if(x1==x2) {
		System.out.println("entering in the else if wala block");
		
		
	}else {
		System.out.println("else wala block");
	}

		
	}
	
}
