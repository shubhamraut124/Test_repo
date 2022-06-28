package patterns;

import java.util.Scanner;

public class PalindromString {

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.next();
		if (isPalindrom(str)) {
			System.out.println("palindrome string");
		}else 
			System.out.println("not a palindrome string");
		
	}
	
	public static boolean isPalindrom(String str) {
		int i=0;
	int j=str.length()-1;
	
	while (i<=j) {
		if (str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;

		
	}
}
