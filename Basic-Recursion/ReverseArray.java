package basicRecursion;

import java.util.Scanner;

public class ReverseArray {
	
	public static void print(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void rev(int[]arr, int i, int j) {
		if(i>j) return ;
		
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		
		rev(arr, i+1, j-1);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter rows of array");
		int n=sc.nextInt();
		
		int [] arr=new int[n];
		System.out.println("enter array elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		rev(arr, 0, arr.length-1);
		
		print(arr);

	}

}
