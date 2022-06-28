package patterns;

import java.util.Scanner;

public class ReverseString {
public static void main(String arg[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String rev=sc.next();
	for(int i=rev.length()-1;i>=0;i--) {
		char h=rev.charAt(i);
		System.out.print(h+"");
		
	}
}
	
}
