package basicRecursion;

import java.util.Scanner;

public class PrintSomethingNtimes {
	public static void print(int n) {
		
		//base condition
		if(n==0) return;
		
		System.out.println("Hi, welcome.. <3");
		print(n-1);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		print(n);

	}

}
