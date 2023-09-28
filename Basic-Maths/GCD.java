package maths;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int n=sc.nextInt();
		System.out.println("enter the 2nd number");
		int m=sc.nextInt();
		while(n>0 && m>0) {
			if(n>m) n=n%m;
			else m=m%n;
		}
		if(n==0) System.out.println("gcd is: "+m);
		else System.out.println("gcd is: "+n);
		

	}

}
