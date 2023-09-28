package maths;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number");
				int n=sc.nextInt();
				int temp=n;
				int rev=0;
				while(temp>0) {
					int lastd=temp%10;
					rev=rev*10+lastd;
					temp=temp/10;
				}
				if(rev==n) {
					System.out.println("Palindrome");
				}
				else {
					System.out.println("Not Palinrome");
				}

	}

}
