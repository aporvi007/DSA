package maths;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter number to be checked");
			int n=sc.nextInt();
			boolean bool=true;
			
			
			for(int i=2;i<(int)Math.sqrt(n);i++) {
				if(n%i==0) {
					bool=false;
					break;
				}
			}
			if(n!=1 && bool==true) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}

	}

}
