package Exception_2;

public class TryCatch {
	public static void main(String arg[])
	{
		/*WITHOUT TRY CATCH block
		 * 
				
		*/		
		/*
		 * System.out.println("statment 1");
		 * 
		 * System.out.println(10/0);
		 * 
		 * System.out.println("statment 3");
		 */
		
		
		/*
		 * WITH TRY CATCH		
		*/	
		System.out.println("statment 1");
		
		try {
			System.out.println(10/0);	
		} catch (Exception e) {
			System.out.println(10/2);
			// TODO: handle exception
		}
		System.out.println("statment 2");
		
		}

}


