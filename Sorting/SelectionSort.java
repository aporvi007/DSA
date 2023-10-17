package sorting;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int [] arr= new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=n-2;i++) {
			int min= i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]<arr[min]) {
					min =j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
