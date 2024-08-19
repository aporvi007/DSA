package arrays;
import java.util.*;
public class BuySellStocks {
	
	public static int maxProfit(int arr[], int n) {
		int profit=0;
		int minSoFar=arr[0];
		for(int i=1;i<n;i++) {
			profit=Math.max(profit, arr[i]-minSoFar);
			minSoFar=Math.min(minSoFar, arr[i]);
			
		}
		
		return profit;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxProfit(arr,n));
	}

}
