package arrays;
import java.util.*;
public class Reverse {
	
	public static void reverse(int arr[], int n) {
		int start=0;
		int end=n-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end --;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		reverse(arr,n);
	}

}
