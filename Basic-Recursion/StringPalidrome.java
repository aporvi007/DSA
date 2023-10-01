package basicRecursion;

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean rev(String str, int i) {
		int n=str.length();
		
		if(i>n/2) return true;
		
		if(str.charAt(i) !=str.charAt(n-i-1)) return false ;
		
		return rev(str, i+1);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the  string");
		String str= sc.nextLine();
		
		
		boolean ans=rev(str, 0);
		
		if(ans) System.out.println("palindrome");
		else System.out.println("not palindrome");

	}

}
