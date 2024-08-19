package arrays;
import java.util.*;
public class LinearSearch {
	
	public static int linearSearch(int []arr, int n, int k) {
		for(int i=0;i<n;i++) {
			if(arr[i]==k) return i;
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the key to be found");
		int k=sc.nextInt();
		
		if(linearSearch(arr,n,k)< 0) System.out.println("Number not found");
		else System.out.println("Number is found at: " + linearSearch(arr,n,k));

	}

}
