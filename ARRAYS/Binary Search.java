package arrays;
import java.util.*;
public class BinarySearch {
	
	public static int binarySearch(int arr[], int n, int k) {
		
		int start=0;
		int end=n-1;
		while(start<=end) {
			int mid =(start+end)/2;
			if(arr[mid]<k) start=mid+1;
			else if(arr[mid]>k) end=mid-1;
			else return mid;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter key to e found");
		int k=sc.nextInt();
		
		if(binarySearch(arr,n,k)< 0) System.out.println("Number not found");
		else System.out.println("Number is found at: " + binarySearch(arr,n,k));

	}

}
