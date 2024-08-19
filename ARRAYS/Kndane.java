package arrays;
import java.util.*;
public class Kandane {
	
	public static int kandane(int arr[], int n) {
		int curr=0;
		int maxSum=Integer.MIN_VALUE;
		int maxEle=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			curr+=arr[i];
			if(curr==0) curr=0;
			maxSum=Math.max(maxSum, curr);
			maxEle=Math.max(arr[i], maxEle);
		}
		if(maxSum==0) return maxEle;
		
		return maxSum;
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
       System.out.println("the maximum sum: "+kandane(arr,n));
	}

}
