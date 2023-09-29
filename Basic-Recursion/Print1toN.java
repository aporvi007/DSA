package basicRecursion;

import java.util.Scanner;

public class Print1toN {
	public static void print(int n) {
		//base condition
		
		if(n==0) return;
		
		print(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		print(n);

	}

}
