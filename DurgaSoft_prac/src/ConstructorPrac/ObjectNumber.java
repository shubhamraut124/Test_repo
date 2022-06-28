package ConstructorPrac;

public class ObjectNumber {
static int count=0;
	/*
	 * write a program to find how many object got created
	*/
	
	/*
	 * *****instance block***********
	 * 
	 * here the execution flow is like before exceution of the constructor 1st instance block will get executed
	 */
	{
		 count++;
	}
	ObjectNumber() {
		// TODO Auto-generated constructor stub
		this (10);											//using THIS keyword we are doing the construction chaining
		System.out.println("1st constructor");
	}
	
	ObjectNumber(int a){
		
		System.out.println("constructor chaining");
	}
	
	ObjectNumber(double h){
		System.out.println("calling last constructor");
	}
	
	
	
	public static void main(String args[]) {
		System.out.println("main method");
		ObjectNumber obj=new ObjectNumber();
		ObjectNumber obj1=new ObjectNumber(10);
		ObjectNumber obj2=new ObjectNumber(10.0);
		System.out.println();
		System.out.println("number of object got crated are "+count);
	}
}
