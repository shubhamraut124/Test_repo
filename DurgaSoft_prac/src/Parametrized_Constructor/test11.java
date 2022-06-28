package Parametrized_Constructor;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name :");
		String dummyname=sc.next();
		System.out.print("Enter the age :");
		int dummyage=sc.nextInt();
		
			sample12 g=new sample12(dummyname, dummyage);		//creating the object of the class and pasiing the parameters value 
		
		System.out.println("Your name is "+g.name);			// using the instance variable using hte values inside the constructor 
		System.out.println("Your age is "+g.age);
	}

}
