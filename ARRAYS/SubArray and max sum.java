package arrays;
import java.util.*;
public class Subarrays {
	
	
	public static void subArray(int arr[], int n) {
		int ts=0;
		int sum=0;
		int maxsum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum=0;
				System.out.print("{ ");
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
					sum=sum+arr[k];
				}
				
				ts++;
				System.out.print("}");	
				System.out.println("sum so far: "+sum);
				maxsum=Math.max(sum, maxsum);
			}
			System.out.println();
		}
		System.out.println("total subarray: "+ts);
		System.out.println("maximum sum: "+maxsum);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		subArray(arr,n);
	}

}
