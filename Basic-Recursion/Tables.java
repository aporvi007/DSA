package basicRecursion;

import java.util.Scanner;

public class Tables {
	
	public static void table(int n, int i) {
		if(i>10) return;
		
		System.out.println(n*i);
		table(n, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(n+" X "+i+" = "+n*i);
//		}
		
		table(n,1);

	}

}
