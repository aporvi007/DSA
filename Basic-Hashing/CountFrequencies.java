package basicHashing;

import java.util.*;

public class CountFrequencies {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int [] arr= new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			
			HashMap<Integer, Integer> map = new HashMap<>();
			
			for(int i=0;i<n;i++) {
				if(map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i])+1);
				}
				else {
					map.put(arr[i], 1);
				}
			
			
			
			}
			
			for(Map.Entry<Integer, Integer> e: map.entrySet()) {
				System.out.print(e.getKey()+"--> "+ e.getValue()+" ");
				System.out.println();
			}
			
		
	}

}
