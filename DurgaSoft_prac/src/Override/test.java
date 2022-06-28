package Override;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p=new Parent();
		Parent random=new child();
		
		
		p.marry();
		p.property();
		System.out.println("======");
		random.marry();
		random.property();
		
	}

}
/* here 2 reference variables are created p & random with initializing object of Parent & child 
p.marry method will call method inside p 
random.marry method will method insie child 

here inplementation is different 
*/