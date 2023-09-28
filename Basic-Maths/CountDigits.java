package maths;
import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
//		this is O(n) solution
		
//		int temp=n;
//		int count=0;
//		int lastdigit=0;
//		while(temp>0) {
//			lastdigit=temp%10;
//			count++;
//			temp=temp/10;
//		}
//		System.out.println(count);
		
//      This is O(1) solution
		
//		String str= Integer.toString(n);
//		System.out.println(str.length());
		
		
		 int digits = (int) Math.floor(Math.log10(n) + 1);
		 System.out.println(digits);
		
		

	}

}
