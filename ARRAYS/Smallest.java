package arrays;
import java.util.*;
public class Smallest {

	public static int smallest(int arr[],int n) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<min) min=arr[i];
		}
		return min;
	}	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the aaray elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		
		System.out.println("the minimum number is: "+smallest(arr,n));

	}

}
