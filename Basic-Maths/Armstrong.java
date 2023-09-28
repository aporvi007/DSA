package maths;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n,cnt=0;
		while(temp>0) {
			
			cnt++;
			temp=temp/10;
			
		}
		temp=n;
		int sum=0;
		while(temp>0) {
			int lastd=temp%10;
			sum=sum+(int)Math.pow(lastd, cnt);
			temp=temp/10;
			
		}
		if(sum==n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not");
		}
	}
}
