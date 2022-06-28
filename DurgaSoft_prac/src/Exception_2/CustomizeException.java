package Exception_2;

public class CustomizeException {

	
	public static void main(String args [])
	{
		System.out.println("creating  the cutomize exception");
		
		
		try {
			System.out.println(10/0);
			
		} catch (Exception e) {

			e.printStackTrace();
			//System.out.println(e);
			//System.out.println(e.toString());
			
			
			System.out.println(10/2);
			// TODO: handle exception
		}
	}

}
