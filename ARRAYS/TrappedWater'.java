package arrays;
import java.util.*;
public class TrappedWater {
	
	public static int trappedWater(int arr[], int n) {
		int leftMax[]=new int[n];
		int rightMax[]=new int[n];
		
		//left max
		leftMax[0]=arr[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(leftMax[i-1], arr[i]);
		}
		
		rightMax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(rightMax[i+1], arr[i]);
		}
		int trapped=0;
		for(int i=0;i<n;i++) {
			trapped+=Math.min(leftMax[i],rightMax[i])-arr[i];
		}
		return trapped;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
		}
		System.out.println("the trapped water "+trappedWater(arr,n));
	}

}