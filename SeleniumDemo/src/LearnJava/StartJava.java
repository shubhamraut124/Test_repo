package LearnJava;

import java.util.*;

// 

public class StartJava extends Sample4 {
	
	//creating the method which returns the int type*******
	
	
	public int multi(int a1, int b1 ) {
		int	result=a1* b1;
	//	System.out.println(result); *************can give o/p directly from the method to console
			return result;  //****** returnig the value
		}
			
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample4 s12=new Sample4();
		s12.m1();
		
		Scanner sc= new Scanner(System.in) ;
		String s="shubham";
		System.out.println(s);
		int a=19;
		int b=10;
		int c,d;
		c=89;
		d=100;
		System.out.println("enter the value");
	int	x=sc.nextInt();//
	if (a>b) {
			System.out.println(" a is bigger");		
			System.out.println(b+c);
	} else {
			System.out.println("  error");
		
	}
	StartJava sj=new StartJava();// creating the object and accessing the method 
	int y=sj.multi(1,21);
	System.out.println(y);
	
	
	
		
		
		
	}

	

}
