package ConstructorPrac;

import java.util.Scanner;

public class test {

	int cnt;
	String name;
	
//creating the constructor
	
	test(int cnt,String name){
		this.cnt=cnt;			//pointing to the variable
		this.name=name;
		
		System.out.println(" enterted into thhe constructor");
		
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);					//creating the object
		System.out.println("Enter the roll number :");
		int cnt1=sc.nextInt();
		System.out.println("Enter the name :");
		String name1=sc.next();
		
		test t=new test(cnt1, name1);							//creating the object
		System.out.println();
		System.out.println("roll number is "+t.cnt);			//accessing the values in the object
		System.out.println("name is "+t.name);
	}
	
}
