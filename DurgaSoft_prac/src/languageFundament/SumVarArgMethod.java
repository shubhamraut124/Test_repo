package languageFundament;

public class SumVarArgMethod {
static int total;
	public static void main(String args[]) {
		sum(10);
		sum(10,10,7);
		sum(20,10,100,1000);
	}
	
	
	public static void sum(int... v) {
		/*
		 * for (int temp : v) { total=temp+total; }
		 */
		for (int i = 0; i < v.length; i++) {
			int j = v[i];
			total=j+total;
			
		}
		System.out.println("the total of every method is "+total);
	}
}

