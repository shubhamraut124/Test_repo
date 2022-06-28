package patterns;

import java.util.Scanner;

public class Fibbonaci {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the range of number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=0;
		int p=0;
		int u=1;
		for (int i = 0; i <=x; i++) {
			y=u+p;
u=p;
p=y;
			System.out.println(y);
		}
		
	}

}
