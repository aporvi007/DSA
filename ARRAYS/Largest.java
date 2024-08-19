package arrays;
import java.util.*;
public class Largest {

	public static int largest(int arr[],int n) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) max=arr[i];
		}
		return max;
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
		
		System.out.println("the maximum number is: "+largest(arr,n));

	}

}
